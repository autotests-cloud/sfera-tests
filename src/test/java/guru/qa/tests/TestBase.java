package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import guru.qa.helpers.Attach;
import guru.qa.helpers.DriverSettings;
import guru.qa.pages.android.MainPage;
import guru.qa.pages.android.LoginPage;
import guru.qa.pages.android.components.PermissionsComponent;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static guru.qa.helpers.Attach.sessionId;
import static io.qameta.allure.Allure.step;

public class TestBase {

    private static String deviceProvider = System.getProperty("deviceProvider", "mobile");
    public LoginPage loginPage = new LoginPage();
    public MainPage mainPage = new MainPage();
    public PermissionsComponent permissionsComponent = new PermissionsComponent();

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
        String sessionId = sessionId();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        step("Close driver", Selenide::closeWebDriver);

        if (deviceProvider.contains("browserstack")) {
            Attach.video(sessionId);
        }
    }
}
