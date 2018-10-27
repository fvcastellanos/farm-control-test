package edu.umg.farm.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.beans.factory.annotation.Value;

import static junit.framework.TestCase.assertNotNull;

public class FarmControlReadHumidityDefs {

    @Value("${activation.url:http://app-host:8080/manual-activation}")
    private String activationUrl;

    private WebDriver webDriver;

    @Given("I want to get humidity value")
    public void i_want_to_get_humidity_value() {
        // Write code here that turns the phrase above into concrete actions

        webDriver = new HtmlUnitDriver(true);

        assertNotNull(webDriver);
    }

    @When("I go to manual activation page again")
    public void i_go_to_manual_activation_page_again() {
        // Write code here that turns the phrase above into concrete actions

        webDriver.get(activationUrl);
    }

    @When("I press read humidity button")
    public void i_press_read_humidity_button() {
        // Write code here that turns the phrase above into concrete actions

        var readTemperature = webDriver.findElement(By.id("read-humidity"));
        readTemperature.click();
    }

    @Then("I got the humidity reading")
    public void i_got_the_humidity_reading() {
        // Write code here that turns the phrase above into concrete actions

        var element = webDriver.findElement(By.id("humidity-value"));
        assertNotNull(element);
    }
}
