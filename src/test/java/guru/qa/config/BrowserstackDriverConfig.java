package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")
public interface BrowserstackDriverConfig extends Config {
    String login();
    String password();
    String app();
    String deviceName();
    String osVersion();
    String project();
    String build();
    String name();
    String url();
}
