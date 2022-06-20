package guru.qa.pages.ios.components;

import guru.qa.pages.android.components.PermissionsComponent;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class IosPermissionsComponents {

    @Step("Allow access to Microphone")
    public IosPermissionsComponents allowPermissionToMicrophone() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Sfera Stage Would Like to Access the Microphone']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Allow microphone for calls and audio messages']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='OK']")).click();

        return this;
    }

    @Step("Don't allow access to Microphone")
    public IosPermissionsComponents dontAllowPermissionToMicrophone() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Sfera Stage Would Like to Access the Microphone']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Allow microphone for calls and audio messages']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Don’t Allow']")).click();

        return this;
    }

    @Step("Allow access to Photo")
    public IosPermissionsComponents allowPermissionToPhoto() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='“Sfera Stage” Would Like to Add to your Photos']")).shouldBe(visible);
        //$(AppiumBy.xpath("//XCUIElementTypeButton[@label='This is necessary so that you can share photos and videos from the device's library.']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='OK']")).click();

        return this;
    }

    @Step("Allow access to Photo")
    public IosPermissionsComponents dontAllowPermissionToPhoto() {
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='“Sfera Stage” Would Like to Add to your Photos']")).shouldBe(visible);
        //$(AppiumBy.xpath("//XCUIElementTypeButton[@label='This is necessary so that you can share photos and videos from the device's library.']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Don’t Allow']")).click();

        return this;
    }

    @Step("Allow receive notification")
    public IosPermissionsComponents allowReceiveNotification() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='“Sfera Stage” Would Like to Send You Notifications']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Notifications may include alerts, sounds and icon badges. These can be configured in Settings.']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Allow']")).click();

        return this;
    }

    @Step("Don't allow receive notification")
    public IosPermissionsComponents dontAllowReceiveNotification() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='“Sfera Stage” Would Like to Send You Notifications']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Notifications may include alerts, sounds and icon badges. These can be configured in Settings.']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Don’t Allow']")).click();

        return this;
    }

    @Step("Use Google to Sign in")
    public IosPermissionsComponents useGoogleToSignIn() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='“Sfera” Wants to Use “google.com” to Sign In']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='This allows the app and website to share information about you.']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Continue']")).click();

        return this;
    }

    @Step("Don't use Google to Sign in")
    public IosPermissionsComponents dontUseGoogleToSignIn() {
        $(AppiumBy.xpath("//XCUIElementTypeStaticText[@label='“Sfera” Wants to Use “google.com” to Sign In']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='This allows the app and website to share information about you.']")).shouldBe(visible);
        $(AppiumBy.xpath("//XCUIElementTypeButton[@label='Cancel']")).click();

        return this;
    }

}
