package guru.qa.tests.ios;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import guru.qa.config.Credentials;
import guru.qa.tests.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
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

        switchTo().alert().accept();
        switchTo().alert().accept();
        $(AppiumBy.name("Continue with SFERA ID")).click();
        $(AppiumBy.xpath("//*[@value='SFERA ID']")).sendKeys(Credentials.sferaId.login());
        $(AppiumBy.xpath("//*[@value='Password']")).sendKeys(Credentials.sferaId.password());
        $(AppiumBy.name("Sign In")).click();

//        $(AppiumBy.name("Main section")).click(); // search for name don't work and for xPath too and accessibilityId too
        // TODO: add check list in the pop up after tap on the Main section
    }

}
