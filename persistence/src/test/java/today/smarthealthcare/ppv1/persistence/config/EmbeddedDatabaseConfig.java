package today.smarthealthcare.ppv1.persistence.config;

import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author: Vadim Nesmashnov
 */
@Configuration
public class EmbeddedDatabaseConfig {

    @Autowired
    private PersistenceConfig persistenceConfig;

    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        builder.setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:database/createTables.sql");
        return builder.build();
    }

    @Bean
    public Properties hibernateProperties() {
        Properties properties = persistenceConfig.hibernateProperties();
        properties.put(AvailableSettings.DIALECT, "org.hibernate.dialect.H2Dialect");
        properties.put(AvailableSettings.DEFAULT_SCHEMA, "PUBLIC");
        properties.put(AvailableSettings.HBM2DDL_AUTO, "");
        properties.put(AvailableSettings.SHOW_SQL, "true");
        properties.put(AvailableSettings.FORMAT_SQL, "true");
        return properties;
    }

}
