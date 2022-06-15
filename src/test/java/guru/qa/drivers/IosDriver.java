package guru.qa.drivers;

import com.codeborne.selenide.WebDriverProvider;
import guru.qa.config.Credentials;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class IosDriver implements WebDriverProvider {

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        File app = getApp();

        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(AutomationName.IOS_XCUI_TEST);
        options.setPlatformName(Credentials.iosDriver.platformName());
        options.setDeviceName(Credentials.iosDriver.deviceName());
        options.setPlatformVersion(Credentials.iosDriver.platformVersion());
        options.setApp(app.getAbsolutePath());
        options.setLocale(Credentials.iosDriver.locale());
        options.setLanguage(Credentials.iosDriver.language());
        options.setAppPackage(Credentials.iosDriver.appPackage());
        options.setCapability(MobileCapabilityType.UDID,Credentials.iosDriver.udid());
        options.setAppActivity(Credentials.iosDriver.appActivity());
        options.setCapability("autoAcceptAlerts", "true"); //to accept all alerts
//        options.setCapability("autoDissmissAlerts", "true"); //to dismiss all alerts
        return new IOSDriver(getAppiumServerUrl(), options);
    }

    public static URL getAppiumServerUrl() {
        try {
            return new URL(Credentials.iosDriver.serverUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private File getApp() {
        String appPath = Credentials.iosDriver.appPath();
        String appUrl = Credentials.iosDriver.appUrl();

        File app = new File(appPath);
        if (!app.exists()) {
            try (InputStream in = new URL(appUrl).openStream()) {
                copyInputStreamToFile(in, app);
            } catch (IOException e) {
                throw new AssertionError("Failed to download apk", e);
            }
        }
        return app;
    }

}