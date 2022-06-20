package guru.qa.pages.ios;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class IosAuthPage {

    @Step("Continue with Google")
    public IosAuthPage continueWithGoogle() {
        $(AppiumBy.name("Continue with SFERA ID")).click();
        return this;

    }

    // This feature doesn't work yet
    @Step("Continue with Apple ID")
    public IosAuthPage continueWithAppleId() {
        $(AppiumBy.name("Continue with SFERA ID")).click();
        return this;

    }

    @Step("Continue with SFERA ID")
    public IosAuthPage continueWithSferaId() {
        $(AppiumBy.name("Continue with SFERA ID")).click();
        return this;

    }

}
