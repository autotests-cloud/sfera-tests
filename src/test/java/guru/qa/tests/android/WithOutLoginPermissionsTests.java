package guru.qa.tests.android;

import guru.qa.config.Credentials;
import guru.qa.tests.TestBase;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

@Tag("permissions")
public class WithOutLoginPermissionsTests extends TestBase {
    @Test

//    @Feature("Wiki App Mobile")
    @Owner("Amidosha")
//    @Severity(SeverityLevel.NORMAL)
    @DisplayName("WithOutLoginPermissionsTests")
    void withOutLoginPermissionsTest() {
        loginPage.clickEnter()
                .setLogin(Credentials.sferaId.login())
                .setPassword(Credentials.sferaId.password())
                .clickEnter();
        permissionsPage
                .grantDialog()
                .permission_message()
                .permission_allow_foreground_only_button()
                .permission_message_audio()
                .permission_allow_button();
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
