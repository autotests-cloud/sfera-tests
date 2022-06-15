package guru.qa.tests.android;

import guru.qa.config.Credentials;
import guru.qa.tests.TestBase;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
                .permissionMessage()
                .permissionAllowForegroundOnlyButton()
                .permissionMessageAudio()
                .PermissionAllowButton();
        assertCheckPage
                .shouldHaveText();
    }
}
