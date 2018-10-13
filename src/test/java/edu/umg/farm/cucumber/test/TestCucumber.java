package edu.umg.farm.cucumber.test;

import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCucumber {

    @Test
    public void testito() {

        Given("today is Sunday", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });
        
        When("I ask whether it's Friday yet", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });
        
        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });
    
    }

}