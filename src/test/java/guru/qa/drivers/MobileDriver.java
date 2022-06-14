package guru.qa.drivers;

import com.codeborne.selenide.WebDriverProvider;
import guru.qa.config.Credentials;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;


public class MobileDriver implements WebDriverProvider {

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        File app = getApp();

        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2); //todo Deprecated
        options.setPlatformName(Credentials.mobileDriver.platformName());
        options.setDeviceName(Credentials.mobileDriver.deviceName());
        options.setPlatformVersion(Credentials.mobileDriver.platformVersion());
        options.setApp(app.getAbsolutePath());
        options.setLocale(Credentials.mobileDriver.locale());
        options.setLanguage(Credentials.mobileDriver.language());
        options.setAppPackage(Credentials.mobileDriver.appPackage());
        options.setAppActivity(Credentials.mobileDriver.appActivity());
        options.setCapability("autoAcceptAlerts", "true"); //to accept all alerts
//        options.setCapability("autoDissmissAlerts", "true"); //to dismiss all alerts
        

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    public static URL getAppiumServerUrl() {
        try {
            return new URL(Credentials.mobileDriver.serverUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private File getApp() {
        String appPath = Credentials.mobileDriver.appPath();
        String appUrl = Credentials.mobileDriver.appUrl();

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