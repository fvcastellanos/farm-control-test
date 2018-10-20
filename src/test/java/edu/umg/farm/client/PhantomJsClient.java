package edu.umg.farm.client;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.Platform.UNIX;
import static org.openqa.selenium.remote.BrowserType.PHANTOMJS;

public class PhantomJsClient {

    private String webDriverURL;
    private WebDriver webDriver;

    public PhantomJsClient(String webDriverURL) {
        this.webDriverURL = webDriverURL;
        this.webDriver = createWebDriver();
    }

    public WebElement getElementById(String url, String element) {

        webDriver.get(url);
        return webDriver.findElement(By.id(element));
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    private WebDriver createWebDriver() {

        try {
            final var desiredCapabilities = new DesiredCapabilities(PHANTOMJS, "2.1.1", UNIX);
            final var webDriver = new RemoteWebDriver(new URL(webDriverURL), desiredCapabilities);
            webDriver.manage().window().setSize(new Dimension(1360, 780));

            return webDriver;

        } catch (MalformedURLException ex) {

            return null;
        }
    }

}
