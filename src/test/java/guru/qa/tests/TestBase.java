package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import guru.qa.config.SferaIdConfig;
import guru.qa.drivers.MobileDriver;
import guru.qa.helpers.Attach;
import guru.qa.helpers.DriverSettings;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static io.qameta.allure.Allure.step;

public class TestBase {

    private static String deviceProvider = System.getProperty("deviceProvider", "mobile");


    @BeforeAll
    public static void setup() {
        Configuration.browser = DriverSettings.getDeviceProvider(deviceProvider);
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());

        open();
    }

    @AfterEach
    public void afterEach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        step("Close driver", Selenide::closeWebDriver);
    }
}
