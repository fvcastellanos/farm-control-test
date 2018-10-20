package edu.umg.farm.client;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.Platform.UNIX;
import static org.openqa.selenium.remote.BrowserType.PHANTOMJS;

public class PhantomJsClient {

    private String webDriverURL;

    public PhantomJsClient(String webDriverURL) {
        this.webDriverURL = webDriverURL;
    }

    public WebElement getElementById(String url, String element) throws Exception {
        var webDriver = createWebDriver();

        webDriver.get(url);
        var webElement = webDriver.findElement(By.id(element));

        return webElement;
    }

    private WebDriver createWebDriver() throws MalformedURLException {
        final var desiredCapabilities = new DesiredCapabilities(PHANTOMJS, "2.1.1", UNIX);
        final var webDriver = new RemoteWebDriver(new URL(webDriverURL), desiredCapabilities);
        webDriver.manage().window().setSize(new Dimension(1360, 780));

        return webDriver;
    }

}
