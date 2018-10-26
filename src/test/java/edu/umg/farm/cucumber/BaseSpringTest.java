package edu.umg.farm.cucumber;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BaseSpringTest.Config.class)
public abstract class BaseSpringTest {


    @Configuration
    static class Config {

    }
}
