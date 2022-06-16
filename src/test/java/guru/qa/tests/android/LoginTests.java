package guru.qa.tests.android;

import guru.qa.config.Credentials;
import guru.qa.pages.android.LoginPage;
import guru.qa.tests.TestBase;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

@Tag("android")
public class LoginTests extends TestBase {
    @Test
    @Owner("Amidosha")
    @DisplayName("Successful login with sferaId")
    void successfulLoginWithSferaIdTest() {
        loginPage
                .clickEnter()
                .setLogin(Credentials.sferaId.login())
                .setPassword(Credentials.sferaId.password())
                .clickEnter();
        mainPage
                .shouldHaveTitle("Primary");
    }

    @Test
    @Owner("Amidosha")
    @DisplayName("Negative login with sferaId with wrong password")
    void negativeLoginWithSferaIdWithWrongPasswordTest() {
        loginPage
                .clickEnter()
                .setLogin(Credentials.sferaId.login())
                .setPassword("123456")
                .clickEnter()
                .shouldHaveErrorText("You entered an incorrect ID or password, please try again");
    }

    @Test
    @Owner("Amidosha")
    @Disabled("Enable capabilities with permissions")
    @DisplayName("Successful login with sferaId without granted permissions")
    void withOutLoginPermissionsTest() {
        loginPage.clickEnter()
                .setLogin(Credentials.sferaId.login())
                .setPassword(Credentials.sferaId.password())
                .clickEnter();
        permissionsComponent
                .grantDialog()
                .permissionMessage()
                .permissionAllowForegroundOnlyButton()
                .permissionMessageAudio()
                .permissionAllowButton();
        mainPage
                .shouldHaveTitle("Primary");
    }
}
