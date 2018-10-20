package edu.umg.farm.cucumber;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.xhtmlrenderer.simple.Graphics2DRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static org.junit.Assert.assertNotNull;

public class FarmControlSpecs implements En {

//    private static final String WEB_DRIVER_URL = "http://phantom-host:8910";
    private static final String WEB_DRIVER_URL = "http://127.0.0.1:8910";
    private static final String DASHBOARD_URL = "http://127.0.0.1:8080/";

//    private final PhantomJsClient phantomJsClient;
    private WebElement webElement;

    public FarmControlSpecs() {

        WebDriver webDriver = new HtmlUnitDriver(true);

//        phantomJsClient = new PhantomJsClient(WEB_DRIVER_URL);
        webElement = null;

        Given("I have historical sensor reading data", () -> {
            // Write code here that turns the phrase above into concrete actions

            assertNotNull(webDriver);

        });

        When("I navigate into the Dashboard", () -> {
            // Write code here that turns the phrase above into concrete actions

//            webElement = phantomJsClient.getElementById(DASHBOARD_URL, "sensor-reading");

            webDriver.get(DASHBOARD_URL);
        });

        Then("I should be able to see historical reading table", () -> {
            // Write code here that turns the phrase above into concrete actions

//            phantomJsClient.getWebDriver().quit();

            webElement = ((HtmlUnitDriver) webDriver).findElementById("sensor-reading");

            assertNotNull(webDriver);

            webDriver.close();
            webDriver.quit();

            try {
                String address = DASHBOARD_URL;
                BufferedImage buff = Graphics2DRenderer.renderToImageAutoSize(address, 1024);
                ImageIO.write(buff, "png", new File("~/screenshot.png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
