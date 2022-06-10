package guru.qa.tests.android;

import guru.qa.config.Credentials;
import guru.qa.tests.TestBase;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

@Tag("android")
public class LoginTests extends TestBase {
    @Test

//    @Feature("Wiki App Mobile")
    @Owner("Stanislav Vasenkov")
//    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Successful login with sferaId")
    void successfulLoginWithSferaIdTest() {
        $(AppiumBy.id("zone.sfera:id/vEnter")).click();
        $(AppiumBy.id("zone.sfera:id/etId")).sendKeys(Credentials.sferaId.login());
        $(AppiumBy.id("zone.sfera:id/etPassword")).sendKeys(Credentials.sferaId.password());
        $(AppiumBy.id("zone.sfera:id/vEnter")).click();

        sleep(3000);
        $(AppiumBy.id("com.android.permissioncontroller:id/grant_dialog")).should(appear);
        $(AppiumBy.id("com.android.permissioncontroller:id/permission_message"))
                .shouldHave(text("Allow SFERA to record audio?"));
        $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();

        sleep(3000);
        $(AppiumBy.id("com.android.permissioncontroller:id/permission_message"))
                .shouldHave(text("Allow SFERA to make and manage phone calls?"));
        $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();

        $(AppiumBy.id("zone.sfera:id/tvCategoryTitle")).shouldHave(text("Primary"));
    }

//    @Feature("Wiki App Mobile")
    @Owner("Stanislav Vasenkov")
//    @Severity(SeverityLevel.NORMAL)
    @Disabled("in progress")
    @DisplayName("Negative login with sferaId with wrong password")
    void negativeLoginWithSferaIdWithWrongPasswordTest() {
        $(AppiumBy.id("zone.sfera:id/vEnter")).click();
        $(AppiumBy.id("zone.sfera:id/etId")).sendKeys(Credentials.sferaId.login());
        $(AppiumBy.id("zone.sfera:id/etPassword")).sendKeys("wrong");
        $(AppiumBy.id("zone.sfera:id/vEnter")).click();

        // todo
    }
}
