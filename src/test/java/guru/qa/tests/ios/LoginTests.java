package guru.qa.tests.ios;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import guru.qa.config.Credentials;
import guru.qa.tests.TestBase;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("ios")
public class LoginTests extends TestBase {

    @Test
//    @Feature("Wiki App Mobile")
//    @Owner("ElakovNick")
//    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Successful login with sferaId")
    void successfulLoginWithSferaIdTest() {
//        $(AppiumBy.id("Continue with SFERA ID")).click();
//        $(AppiumBy.id("zone.sfera:id/etId")).sendKeys(Credentials.sferaId.login()); value SFERA ID
//
//        $(AppiumBy.id("zone.sfera:id/etPassword")).sendKeys(Credentials.sferaId.password()); Password
//
//        $(AppiumBy.id("zone.sfera:id/vEnter")).click(); Sign In
//
//        sleep(3000);
//        $(AppiumBy.id("com.android.permissioncontroller:id/grant_dialog")).should(appear);
//        $(AppiumBy.id("com.android.permissioncontroller:id/permission_message"))
//                .shouldHave(text("Allow SFERA to record audio?"));
//        $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
//
//        sleep(3000);
//        $(AppiumBy.id("com.android.permissioncontroller:id/permission_message"))
//                .shouldHave(text("Allow SFERA to make and manage phone calls?"));
//        $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//
//        $(AppiumBy.id("zone.sfera:id/tvCategoryTitle")).shouldHave(text("Primary")); XCUIElementTypeStaticText
//        Main section

    }

}
