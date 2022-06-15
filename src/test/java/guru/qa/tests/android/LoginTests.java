package guru.qa.tests.android;

import guru.qa.config.Credentials;
import guru.qa.pages.LoginPage;
import guru.qa.tests.TestBase;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class LoginTests extends TestBase {
    @Test
    @Tag("android")
    @Owner("Amidosha")
    @DisplayName("Successful login with sferaId")
    void successfulLoginWithSferaIdTest() {
        new LoginPage()
                .clickEnter()
                .setLogin(Credentials.sferaId.login())
                .setPassword(Credentials.sferaId.password())
                .clickEnter();
        assertCheckPage
                .shouldHaveText();
    }

    @Test
    @Tag("android")
    @Owner("Amidosha")
    @DisplayName("Negative login with sferaId with wrong password")
    void negativeLoginWithSferaIdWithWrongPasswordTest() {
        new LoginPage()
                .clickEnter()
                .setLogin(Credentials.sferaId.login())
                .setPassword("123456")
                .clickEnter();
        $(AppiumBy.id("zone.sfera:id/tvError")).
                shouldHave(text("You entered an incorrect ID or password, please try again"));
    }
}
