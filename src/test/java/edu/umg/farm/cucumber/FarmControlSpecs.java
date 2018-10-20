package edu.umg.farm.cucumber;

import cucumber.api.java8.En;
import edu.umg.farm.client.PhantomJsClient;

public class FarmControlSpecs implements En {

//    private static final String WEB_DRIVER_URL = "http://phantom-host:8910";
    private static final String WEB_DRIVER_URL = "http://127.0.0.1:8910";
    private static final String DASHBOARD_URL = "http://127.0.0.1:8080";


    private final PhantomJsClient phantomJsClient;

    public FarmControlSpecs() {

        phantomJsClient = new PhantomJsClient(WEB_DRIVER_URL);

        Given("I have historical sensor reading data", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });

        When("I navigate into the Dashboard", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });

        Then("I should be able to see historical reading table", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });
    }
}
