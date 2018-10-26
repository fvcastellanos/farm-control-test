package edu.umg.farm.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.beans.factory.annotation.Value;

import static junit.framework.TestCase.assertNotNull;

public class FarmControlActivationDefs {

    @Value("${activation.url:http://localhost:8080/manual-activation}")
    private String activationUrl;

    private WebDriver webDriver;

    @Given("I want to activate water pump")
    public void i_want_to_activate_water_pump() {
        // Write code here that turns the phrase above into concrete actions

        webDriver = new HtmlUnitDriver(true);
        assertNotNull(webDriver);
    }

    @When("I navigate to activation page")
    public void i_navigate_to_activation_page() {
        // Write code here that turns the phrase above into concrete actions

        webDriver.get(activationUrl);
    }

    @When("I press send command button")
    public void i_press_send_command_button() {
        // Write code here that turns the phrase above into concrete actions

        var activator = webDriver.findElement(By.id("read-humidity"));
        activator.click();
    }

    @Then("Actuator is operated remotely")
    public void actuator_is_operated_remotely() {
        // Write code here that turns the phrase above into concrete actions
        var activator = webDriver.findElement(By.id("read-humidity"));
        assertNotNull(activator);
    }
}
