package guru.qa.config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static BrowserstackDriverConfig browserstack = ConfigFactory.create(BrowserstackDriverConfig.class);
    public static BrowserstackIosDriverConfig browserstackios = ConfigFactory.create(BrowserstackIosDriverConfig.class);
    public static MobileDriverConfig mobileDriver = ConfigFactory.create(MobileDriverConfig.class, System.getProperties());
    public static MobileDriverConfigIOS mobileDriverIOS = ConfigFactory.create(MobileDriverConfigIOS.class);
    public static GmailConfig gmail = ConfigFactory.create(GmailConfig.class, System.getProperties());
    public static SferaIdConfig sferaId = ConfigFactory.create(SferaIdConfig.class, System.getProperties());

}
