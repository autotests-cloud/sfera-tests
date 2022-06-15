package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import guru.qa.helpers.Attach;
import guru.qa.helpers.DriverSettings;
import guru.qa.pages.AssertCheckPage;
import guru.qa.pages.LoginPage;
import guru.qa.pages.PermissionsPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static io.qameta.allure.Allure.step;

public class TestBase {

    private static String deviceProvider = System.getProperty("deviceProvider", "mobile");
    public LoginPage loginPage = new LoginPage();
    public PermissionsPage permissionsPage = new PermissionsPage();
    public AssertCheckPage assertCheckPage = new AssertCheckPage();

    @BeforeAll
    public static void setup() {
        Configuration.browser = DriverSettings.getDeviceProvider(deviceProvider);
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        open();
        addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void afterEach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        step("Close driver", Selenide::closeWebDriver);
    }
}
