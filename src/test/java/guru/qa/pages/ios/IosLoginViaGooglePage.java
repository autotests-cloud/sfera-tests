package guru.qa.pages.ios;

import guru.qa.pages.android.LoginPage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class IosLoginViaGooglePage {

    @Step("Set English language")
    public IosLoginViaGooglePage setEnglishLanguage() {
        $(AppiumBy.xpath("//XCUIElementTypeOther[@label='English (United States)']")).click();

        return this;
    }

    @Step("Sign in with Google was opened")
    public IosLoginViaGooglePage signInWithGoogleWasOpened() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='Sign in']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='to continue to']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='SFERA project']")).shouldBe(visible);

        return this;
    }

    @Step("Enter '{email}' to the Email or Phone field and next")
    public IosLoginViaGooglePage enterEmail(String email) {
        $(AppiumBy.xpath("//XCUIElementTypeTextField[@label='Email or phone']")).sendKeys(email);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Next']")).click();

        return this;
    }

    @Step("the Enter password form was opened")
    public IosLoginViaGooglePage EnterPasswordWasOpened(String email) {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='Welcome']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='testerofsfera@gmail.com']")).shouldBe(visible);

        return this;
    }

    @Step("Enter '{password}' to the password field")
    public IosLoginViaGooglePage enterPassword(String password) {
        $(AppiumBy.xpath("//XCUIElementTypeTextField[@label='Email or phone']")).sendKeys(password);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Next']")).click();

        return this;
    }

}
