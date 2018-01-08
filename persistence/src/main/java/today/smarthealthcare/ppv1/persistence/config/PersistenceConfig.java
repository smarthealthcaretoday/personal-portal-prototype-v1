package today.smarthealthcare.ppv1.persistence.config;

import com.google.common.base.MoreObjects;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.cfg.AvailableSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Configuration for persistence layer
 *
 * @author: Vadim Nesmashnov
 */
@Configuration
@EnableTransactionManagement
@PropertySources({
        @PropertySource(value = "classpath:conf/db-default.properties"),
        @PropertySource(value = "classpath:conf/db.properties", ignoreResourceNotFound = true)
})
@EnableJpaRepositories("com.smarthealthcare.ppv1.persistence.repository")
@ComponentScan({"today.smarthealthcare.ppv1.persistence.service","today.smarthealthcare.ppv1.persistence.dao"})
public class PersistenceConfig {

	public static final Logger LOGGER = LoggerFactory.getLogger(PersistenceConfig.class);

	@Autowired
	private Environment environment;

	private String driverClass;
	private String jdbcUrl;
	private String user;
	private String password;

	@PostConstruct
	public void init() {
		driverClass = environment.getProperty("db.driverClass");
		jdbcUrl = environment.getProperty("db.url");
		user = environment.getProperty("db.user");
		password = environment.getProperty("db.password");
		LOGGER.info(MoreObjects.toStringHelper("Database connection configuration")
				.add("driverClass", driverClass)
				.add("url", jdbcUrl)
				.add("user", user)
				.add("password", "***")
				.toString());
	}

	@Bean
	public JdbcTemplate jdbcTemplate() throws Exception {
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public JpaTransactionManager transactionManager() throws Exception {
		return new JpaTransactionManager(entityManagerFactory().getObject());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setJpaProperties(hibernateProperties());
		factoryBean.setJpaVendorAdapter(hibernateVendor());
		factoryBean.setPackagesToScan("com.smarthealthcare.ppv1.persistence.model");
		return factoryBean;
	}

	@Bean
	public JpaVendorAdapter hibernateVendor() {
		return new HibernateJpaVendorAdapter();
	}

	@Bean(destroyMethod = "close")
	public DataSource dataSource() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		dataSource.setAcquireIncrement(1);
		dataSource.setIdleConnectionTestPeriod(60);
		dataSource.setMaxPoolSize(50);
		dataSource.setMaxStatements(1000);
		dataSource.setMaxStatementsPerConnection(100);
		dataSource.setMinPoolSize(5);
		dataSource.setBreakAfterAcquireFailure(false);
		dataSource.setAcquireRetryAttempts(0);
		dataSource.setAcquireRetryDelay(1000);
		dataSource.setCheckoutTimeout(30000);
		return dataSource;
	}

	@Bean
	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");
		properties.put(AvailableSettings.HBM2DDL_AUTO, "validate");
		properties.put(AvailableSettings.SHOW_SQL, "false");
		properties.put(AvailableSettings.FORMAT_SQL, "false");
		properties.put(AvailableSettings.GENERATE_STATISTICS, "false");
		properties.put(AvailableSettings.ORDER_INSERTS, "true");
		properties.put(AvailableSettings.ORDER_UPDATES, "true");
		properties.put(AvailableSettings.STATEMENT_FETCH_SIZE, "30");
		properties.put(AvailableSettings.STATEMENT_BATCH_SIZE, "30");
		properties.put(AvailableSettings.BATCH_VERSIONED_DATA, "true");
		properties.put(AvailableSettings.RELEASE_CONNECTIONS, "on_close");
		properties.put(AvailableSettings.USE_REFLECTION_OPTIMIZER, "true");
		properties.put(AvailableSettings.BYTECODE_PROVIDER, "javassist");
		properties.put(AvailableSettings.C3P0_MAX_STATEMENTS, "2000");
		return properties;
	}
}
