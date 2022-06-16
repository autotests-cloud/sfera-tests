package guru.qa.pages.android;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    @Step("Проверка, что в заголовке главного экрана есть текст '{value}'")
    public MainPage shouldHaveTitle(String value) {
        $(AppiumBy.id("zone.sfera:id/tvCategoryTitle")).shouldHave(text(value));

        return this;
    }

}
