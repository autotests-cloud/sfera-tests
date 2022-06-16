package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/drivers/local.properties")
public interface LocalDriverConfig extends Config {
    String platformName();
    String platformVersion();
    String deviceName();
    String locale();
    String language();
    String appPackage();
    String appActivity();
    String appUrl();
    String appPath();
    String serverUrl();
}
