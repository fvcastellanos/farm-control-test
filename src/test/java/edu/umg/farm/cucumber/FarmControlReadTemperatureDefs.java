package edu.umg.farm.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.beans.factory.annotation.Value;

import static junit.framework.TestCase.assertNotNull;

public class FarmControlReadTemperatureDefs {

    @Value("${activation.url:http://app-host:8080/manual-activation}")
    private String activationUrl;

    private WebDriver webDriver;

    @Given("I want to get temperature value")
    public void i_want_to_get_temperature_value() {
        // Write code here that turns the phrase above into concrete actions

        webDriver = new HtmlUnitDriver(true);

        assertNotNull(webDriver);
    }

    @When("I go to manual activation page")
    public void i_go_to_manual_activation_page() {
        // Write code here that turns the phrase above into concrete actions

        webDriver.get(activationUrl);
    }

    @When("I press read temperature button")
    public void i_press_read_temperature_button() {
        // Write code here that turns the phrase above into concrete actions

        var readTemperature = webDriver.findElement(By.id("read-temperature"));
        readTemperature.click();
    }

    @Then("I got the temperature reading")
    public void i_got_the_temperature_reading() {
        // Write code here that turns the phrase above into concrete actions

        var element = webDriver.findElement(By.id("temperature-value"));

        assertNotNull(element);
    }

}
