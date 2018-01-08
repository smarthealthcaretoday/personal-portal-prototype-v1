package today.smarthealthcare.ppv1.persistence.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * @author: Vadim Nesmashnov
 */
public abstract class AbstractDao {
    @Autowired
    private DataSource dataSource;

    protected JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
