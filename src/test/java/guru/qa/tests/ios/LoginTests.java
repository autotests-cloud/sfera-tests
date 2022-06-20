package guru.qa.tests.ios;

import guru.qa.config.Credentials;
import guru.qa.tests.TestBase;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("ios")
public class LoginTests extends TestBase {

    @Test
    @Owner("ElakovNick")
    @DisplayName("Successful login with sferaId")
    void successfulLoginWithSferaIdTest() {

        iosPermissionsComponents
                .allowPermissionToMicrophone()
                .allowReceiveNotification();

        iosAuthPage
                .continueWithSferaId();

        iosLoginViaSferaIDPage
                .enterLogin(Credentials.sferaId.login())
                .enterPassword(Credentials.sferaId.password())
                .clickSignIn();

        iosMainPage
                .checkTextInNavigationBar();
    }

}
