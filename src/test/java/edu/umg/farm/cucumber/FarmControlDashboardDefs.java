package edu.umg.farm.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.beans.factory.annotation.Value;

import static junit.framework.TestCase.assertNotNull;

public class FarmControlDashboardDefs extends BaseSpringTest {

    @Value("${dashboard.url:http://app-host:8080}")
    private String dashboardUrl;

    private WebDriver webDriver;

    @Given("I have historical sensor reading data")
    public void i_have_historical_sensor_reading_data() {
        // Write code here that turns the phrase above into concrete actions

        webDriver = new HtmlUnitDriver(true);
        assertNotNull(webDriver);
    }

    @When("I navigate into the Dashboard")
    public void i_navigate_into_the_Dashboard() {
        // Write code here that turns the phrase above into concrete actions

        webDriver.get(dashboardUrl);
    }

    @Then("I should be able to see historical reading table")
    public void i_should_be_able_to_see_historical_reading_table() {
        // Write code here that turns the phrase above into concrete actions

        var webElement = ((HtmlUnitDriver) webDriver).findElementById("sensor-reading");

        webDriver.close();

        assertNotNull(webElement);

    }
}
