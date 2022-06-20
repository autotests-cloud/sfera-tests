package guru.qa.pages.ios;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class IosMainPage {

    @Step("the Далее click")
    public IosMainPage tapContinue() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Далее']")).shouldBe(visible);

        return this;
    }

    @Step("Check text in the navigation bar visible")
    public IosMainPage checkTextInNavigationBar() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='All']")).shouldBe(visible);

        return this;
    }


}
