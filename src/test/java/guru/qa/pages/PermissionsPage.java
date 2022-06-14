package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PermissionsPage {
    private final SelenideElement grant_dialog = $(AppiumBy.id("com.android.permissioncontroller:id/grant_dialog"));
    private final SelenideElement permission_message = $(AppiumBy.id("com.android.permissioncontroller:id/permission_message"));
    private final SelenideElement permission_message_audio = $(AppiumBy.id("com.android.permissioncontroller:id/permission_message"));
    private final SelenideElement permission_allow_foreground_only_button = $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
    private final SelenideElement permission_allow_button = $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));


    @Step("")
    public PermissionsPage grant_dialog() {
        grant_dialog
                .should(appear);
        return this;
    }

    @Step("")
    public PermissionsPage permission_message() {
        permission_message
                .shouldHave(text("Allow SFERA to record audio?"));
        return this;
    }

    @Step("")
    public PermissionsPage permission_allow_foreground_only_button() {
        permission_allow_foreground_only_button
                .click();
        return this;
    }

    @Step("")
    public PermissionsPage permission_message_audio() {
        permission_message_audio
                .shouldHave(text("Allow SFERA to make and manage phone calls?"));
        return this;
    }

    @Step("")
    public PermissionsPage permission_allow_button() {
        permission_allow_button
                .click();
        return this;
    }
}