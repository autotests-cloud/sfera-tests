package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.config.Credentials;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement vEnter = $(AppiumBy.id("zone.sfera:id/vEnter"));
    private final SelenideElement login = $(AppiumBy.id("zone.sfera:id/etId"));
    private final SelenideElement password = $(AppiumBy.id("zone.sfera:id/etPassword"));
    private final SelenideElement Enter = $(AppiumBy.id("zone.sfera:id/vEnter"));


    @Step("Нажать на кнопку Enter")
    public LoginPage clickEnter() {
        vEnter
                .click();
        return this;
    }

    @Step("Нажать на кнопку login")
    public LoginPage sendLogin() {
        login
                .sendKeys(Credentials.sferaId.login());
        return this;
    }

    @Step("Нажать на кнопку password")
    public LoginPage sendPassword() {
        password
                .sendKeys(Credentials.sferaId.password());
        return this;
    }

    @Step("Нажать на кнопку password")
    public LoginPage wrongSendPassword() {
        password
                .sendKeys("123456");
        return this;
    }

    @Step("Нажать на кнопку Enter")
    public LoginPage clickvEnter() {
        Enter
                .click();
        return this;
    }
}