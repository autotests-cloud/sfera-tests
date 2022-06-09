package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstackios.properties")
public interface BrowserstackIosDriverConfig extends Config {
    String login();

    String password();

    @Key("app")
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
