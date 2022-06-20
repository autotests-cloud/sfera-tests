package guru.qa.drivers;

import com.codeborne.selenide.WebDriverProvider;
import guru.qa.config.Credentials;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class BrowserstackDriver implements WebDriverProvider {
    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        mutableCapabilities.setCapability("browserstack.appium_version", "1.22.0");
        mutableCapabilities.setCapability("browserstack.user", Credentials.browserstack.login());
        mutableCapabilities.setCapability("browserstack.key", Credentials.browserstack.password());
        mutableCapabilities.setCapability("app", Credentials.browserstack.app());
        mutableCapabilities.setCapability("device", Credentials.browserstack.deviceName());
        mutableCapabilities.setCapability("osVersion", Credentials.browserstack.osVersion());
        mutableCapabilities.setCapability("project", Credentials.browserstack.project());
        mutableCapabilities.setCapability("build", Credentials.browserstack.build());
        mutableCapabilities.setCapability("name", Credentials.browserstack.name());

        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL(Credentials.browserstack.url());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}