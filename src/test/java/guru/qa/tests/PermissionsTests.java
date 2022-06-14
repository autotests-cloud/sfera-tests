package guru.qa.tests;

import com.codeborne.selenide.Condition;
import guru.qa.config.Credentials;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class PermissionsTests extends TestBase {

    void loginTest() {
        $(AppiumBy.id("zone.sfera:id/vEnter")).click();
        $(AppiumBy.id("zone.sfera:id/etId")).sendKeys(Credentials.sferaId.login());
        $(AppiumBy.id("zone.sfera:id/etPassword")).sendKeys(Credentials.sferaId.password());
        $(AppiumBy.id("zone.sfera:id/vEnter")).click();
        $(AppiumBy.id("com.android.permissioncontroller:id/grant_dialog")).should(appear);
        $(AppiumBy.id("com.android.permissioncontroller:id/permission_message"))
                .shouldHave(Condition.text("Allow SFERA to record audio?"));


        // todo describe other
    }
}
