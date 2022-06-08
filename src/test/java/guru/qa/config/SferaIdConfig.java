package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/sferaId.properties")
public interface SferaIdConfig extends Config {
    String login();
    String password();
}
