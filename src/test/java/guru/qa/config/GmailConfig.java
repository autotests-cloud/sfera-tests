package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/gmail.properties")
public interface GmailConfig extends Config {
    String login();
    String password();
}
