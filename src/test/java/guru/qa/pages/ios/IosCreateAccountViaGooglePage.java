package guru.qa.pages.ios;

import com.codeborne.selenide.Condition;
import guru.qa.config.Credentials;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import javax.xml.xpath.XPath;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;

public class IosCreateAccountViaGooglePage {

    @Step("Create account page was opened")
    public IosCreateAccountViaGooglePage setEnglishLanguage() {
        $(AppiumBy.xpath("//XCUIElementTypeNavigationBar[@name='Create an account']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='Enter the name or nickname you want and create password']")).shouldBe(visible);

        return this;
    }

    @Step("Check FIO from Google")
    public IosCreateAccountViaGooglePage checkFIOFromGoogle(String fio) {
        $(AppiumBy.xpath("//XCUIElementTypeNavigationBar")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='Enter the name or nickname you want and create password']")).shouldBe(visible);

        return this;
    }

    @Step("Enter new '{password}' to the password and confirm password fields")
    public IosCreateAccountViaGooglePage createPassword(String password) {
        $(AppiumBy.xpath("//*[@value='Password']")).sendKeys(password);
        $(AppiumBy.xpath("//*[@value='Confirm password']")).sendKeys(password);

        return this;
    }

    @Step("Choose sex")
    public IosCreateAccountViaGooglePage chooseSex() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@Label='Your sex']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@Label='Female']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@Label='Male']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@Label='Male']")).click();
        $(AppiumBy.xpath("//XCUIElementTypeImage[@Visible='true']")).shouldBe(visible);

        return this;
    }

    @Step("Open terms and condition")
    public IosCreateAccountViaGooglePage openTermsAndCondition() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='By continuing you agree to the']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='terms of user agreement and privacy policy']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='terms of user agreement and privacy policy']")).click();

        return this;
    }

    @Step("Check text of the Term and Condition")
    public IosCreateAccountViaGooglePage checkTextOftermAndCondition() {
        $(AppiumBy.xpath("//XCUIElementTypeNavigationBar[@name='Privacy policy']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeTextView")).shouldHave(text("USER AGREEMENT and PRIVACY POLICY for SFERA software product"));
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='Register']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Register']")).click();

        return this;
    }

    @Step("Click Next")
    public IosCreateAccountViaGooglePage clickNext() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Next']")).click();

        return this;
    }

}
