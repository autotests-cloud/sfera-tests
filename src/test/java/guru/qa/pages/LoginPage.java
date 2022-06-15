package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.config.Credentials;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement vEnter = $(AppiumBy.id("zone.sfera:id/vEnter")),
            login = $(AppiumBy.id("zone.sfera:id/etId")),
            password = $(AppiumBy.id("zone.sfera:id/etPassword"));


    @Step("Нажать на кнопку Enter")
    public LoginPage clickEnter() {
        vEnter.click();
        return this;
    }

    @Step("Ввести значение '{value}' в поле login")
    public LoginPage setLogin(String value) {
        login.sendKeys(value);
        return this;
    }

    @Step("Ввести значение '{value}' в поле password")
    public LoginPage setPassword(String value) {
        password.sendKeys(value);
        return this;
    }
}