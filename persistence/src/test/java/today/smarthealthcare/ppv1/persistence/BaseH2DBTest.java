package today.smarthealthcare.ppv1.persistence;

import today.smarthealthcare.ppv1.persistence.config.DozerConfig;
import today.smarthealthcare.ppv1.persistence.config.EmbeddedDatabaseConfig;
import today.smarthealthcare.ppv1.persistence.config.PersistenceConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.transaction.TransactionConfiguration;

import today.smarthealthcare.ppv1.persistence.config.DozerConfig;
import today.smarthealthcare.ppv1.persistence.config.EmbeddedDatabaseConfig;
import today.smarthealthcare.ppv1.persistence.config.PersistenceConfig;

/**
 * @author: Vadim Nesmashnov
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class,
        classes={PersistenceConfig.class, EmbeddedDatabaseConfig.class, DozerConfig.class})
@TransactionConfiguration(defaultRollback=false)
public abstract class BaseH2DBTest {

}
