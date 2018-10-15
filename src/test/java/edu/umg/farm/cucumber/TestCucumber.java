package edu.umg.farm.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.java8.En;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

public class TestCucumber implements En {

    private String day;
    private boolean isFriday;

    public TestCucumber() {
        Given("today is Sunday", () -> {
            // Write code here that turns the phrase above into concrete actions
//            throw new cucumber.api.PendingException();
            day = "sunday";
            System.out.println("hola mundo!");
        });

        When("I ask whether it's Friday yet", () -> {
            // Write code here that turns the phrase above into concrete actions
            isFriday = day.equals("friday");
//            throw new PendingException();
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
//            throw new PendingException();

            assertEquals("Nope", string);

        });

    }

//    @Test
    public void testito() {


    }

}