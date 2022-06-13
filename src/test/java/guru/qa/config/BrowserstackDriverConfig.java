package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")
public interface BrowserstackDriverConfig extends Config {
    String login();
    String password();

    @Key("app")
    String app();

    String deviceName();

    @Key("osVersion")
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
