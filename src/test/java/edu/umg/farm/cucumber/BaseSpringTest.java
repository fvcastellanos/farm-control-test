package edu.umg.farm.cucumber;

import edu.umg.farm.cucumber.config.MySqlDataSourceConfig;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BaseSpringTest.Config.class)
public abstract class BaseSpringTest {


    @Configuration
    @Import({
            MySqlDataSourceConfig.class
    })
    static class Config {

    }
}
