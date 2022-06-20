package guru.qa.pages.ios;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SuccessfulCreatedAccountViaGooglePage {

    @Step("the Далее click")
    public SuccessfulCreatedAccountViaGooglePage tapContinue() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Далее']")).shouldBe(visible);

        return this;
    }


    @Step("Account has been created displayed")
    public SuccessfulCreatedAccountViaGooglePage acountHasBeenCreatedDisplayed() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='Account has been created']")).shouldBe(visible);

        return this;
    }

    @Step("Warning about remember your ID displayed")
    public SuccessfulCreatedAccountViaGooglePage warningAboutRememberIdDisplayed() {
        //$(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='Remember the ID, it's your login to sing in to the app. Other users can also find you by ID']")).shouldBe(visible);

        return this;
    }

    @Step("Your ID displayed")
    public SuccessfulCreatedAccountViaGooglePage idDisplayed() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText")).shouldHave(text("Your ID:"));

        return this;
    }

    @Step("Save to Gallery")
    public SuccessfulCreatedAccountViaGooglePage saveToGallery() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='Save to Gallery']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Save to Gallery']")).click();

        return this;
    }

    @Step("Click Go to App")
    public SuccessfulCreatedAccountViaGooglePage clickGoToApp() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Go to App']")).click();

        return this;
    }

}
