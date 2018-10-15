package edu.umg.farm.cucumber;

import cucumber.api.java8.En;
import edu.umg.farm.cucumber.calculator.Calculator;

import static org.junit.Assert.assertTrue;

public class CalculatorTest implements En {

    private Calculator calculator;
    private int result;

    public CalculatorTest() {

        calculator = new Calculator();

        Given("I have entered {int} into the calculator", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
//            throw new cucumber.api.PendingException();
            calculator.setFirstNumber(int1);
        });

        Given("I have also entered {int} into the calculator", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
//            throw new cucumber.api.PendingException();
            calculator.setSecondNumber(int1);
        });

        When("I press add", () -> {
            // Write code here that turns the phrase above into concrete actions
//            throw new cucumber.api.PendingException();
            result = calculator.add();
        });

        Then("the result should be {int} on the screen", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
//            throw new cucumber.api.PendingException();

            assertTrue(result == int1);
        });

    }
}
