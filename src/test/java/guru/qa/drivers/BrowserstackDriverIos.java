package guru.qa.drivers;

import com.codeborne.selenide.WebDriverProvider;
import guru.qa.config.Credentials;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class BrowserstackDriverIos implements WebDriverProvider {
    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        mutableCapabilities.setCapability("browserstack.appium_version", "1.22.0");
        mutableCapabilities.setCapability("browserstack.user", Credentials.browserstackios.login());
        mutableCapabilities.setCapability("browserstack.key", Credentials.browserstackios.password());
        mutableCapabilities.setCapability("app", Credentials.browserstackios.app());
        mutableCapabilities.setCapability("device", Credentials.browserstackios.deviceName());
        mutableCapabilities.setCapability("os_version", Credentials.browserstackios.osVersion());
        mutableCapabilities.setCapability("project", Credentials.browserstackios.project());
        mutableCapabilities.setCapability("build", Credentials.browserstackios.build());
        mutableCapabilities.setCapability("name", Credentials.browserstackios.app());

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