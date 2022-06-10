package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")
public interface BrowserstackDriverConfig extends Config {
    String login();
    String password();
    String app();
    String deviceName();
    @Key("os_version")
    String osVersion();
    @Key("project")
    String project();
    @Key("build")
    String build();
    @Key("name")
    String name();
    @Key("url")
    String url();
}
