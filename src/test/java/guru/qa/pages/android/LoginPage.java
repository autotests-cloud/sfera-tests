package guru.qa.pages.android;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    @Step("Нажать на кнопку Enter")
    public LoginPage clickEnter() {
        $(AppiumBy.id("zone.sfera:id/vEnter")).click();

        return this;
    }

    @Step("Ввести значение '{value}' в поле login")
    public LoginPage setLogin(String value) {
        $(AppiumBy.id("zone.sfera:id/etId")).sendKeys(value);

        return this;
    }

    @Step("Ввести значение '{value}' в поле password")
    public LoginPage setPassword(String value) {
        $(AppiumBy.id("zone.sfera:id/etPassword")).sendKeys(value);

        return this;
    }

    @Step("Проверка, что появился текст ошибки '{value}'")
    public LoginPage shouldHaveErrorText(String value) {
        $(AppiumBy.id("zone.sfera:id/tvError")).shouldHave(text(value));

        return this;
    }
}