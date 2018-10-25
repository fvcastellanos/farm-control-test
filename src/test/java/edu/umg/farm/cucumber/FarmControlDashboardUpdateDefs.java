package edu.umg.farm.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Value;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class FarmControlDashboardUpdateDefs {

    @Value("${dashboard.url:http://127.0.0.1:8080}")
    private String dashboardUrl;

    private WebDriver webDriver;

    private FirefoxDriver firefoxDriver;

    @Given("Historical sensor reading data displays {int} rows by default")
    public void historical_sensor_reading_data_displays_rows_by_default(Integer value) {

        webDriver = new HtmlUnitDriver(true);
        webDriver.get(dashboardUrl);

        var id="value" + value;
        var webElement = webDriver.findElement(By.id(id));
        assertNotNull(webElement);
    }

    @When("I select {string} from no results dropdown")
    public void i_select_from_no_results_dropdown(String value) {
        // Write code here that turns the phrase above into concrete actions

        var displaySelect = new Select(webDriver.findElement(By.id("display")));

        displaySelect.selectByValue(value);
    }

    @When("press update button")
    public void press_update_button() {
        // Write code here that turns the phrase above into concrete actions

        var updateButton = webDriver.findElement(By.id("displayRows"));
        updateButton.click();
    }

    @Then("I should be able to see {string} rows displayed")
    public void i_should_be_able_to_see_rows_displayed(String value) {
        // Write code here that turns the phrase above into concrete actions
        var displaySelect = new Select(webDriver.findElement(By.id("display")));

        var option = displaySelect.getFirstSelectedOption();
        assertEquals(value, option.getAttribute("value"));

        webDriver.close();
    }
}
