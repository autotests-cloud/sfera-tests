package guru.qa.pages.ios;

import guru.qa.config.Credentials;
import guru.qa.pages.android.LoginPage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class IosLoginViaSferaIDPage {

    @Step("Enter '{sferaID}' to the login field")
    public IosLoginViaSferaIDPage enterLogin(String sferaID) {
        $(AppiumBy.xpath("//*[@value='SFERA ID']")).sendKeys(Credentials.sferaId.login());

        return this;
    }

    @Step("Enter '{password}' to the password field")
    public IosLoginViaSferaIDPage enterPassword(String password) {
        $(AppiumBy.xpath("//*[@value='Password']")).sendKeys(Credentials.sferaId.password());

        return this;
    }

    @Step("Click Sign in")
    public IosLoginViaSferaIDPage clickSignIn() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Sign In']")).click();

        return this;
    }

    @Step("Check the Sign in button disabled")
    public IosLoginViaSferaIDPage checkSignInButtonDisabled() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@Enabled='false']")).shouldBe(not(visible));

        return this;
    }

    //TODO Добавить методы для проверки сообщений об ошибке (неверный логин, пароль)

}