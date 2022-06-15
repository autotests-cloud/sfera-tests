package guru.qa.pages;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AssertCheckPage {

    @Step("Успешная авторизация в приложение")
    public AssertCheckPage shouldHaveText() {
        $(AppiumBy.id("zone.sfera:id/tvCategoryTitle")).shouldHave(text("Primary"));

        return this;
    }


}
