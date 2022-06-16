package guru.qa.config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static BrowserstackDriverConfig browserstack = ConfigFactory.create(BrowserstackDriverConfig.class, System.getProperties());
    public static LocalDriverConfig mobileDriver = ConfigFactory.create(LocalDriverConfig.class, System.getProperties());
    public static GmailConfig gmail = ConfigFactory.create(GmailConfig.class, System.getProperties());
    public static SferaIdConfig sferaId = ConfigFactory.create(SferaIdConfig.class, System.getProperties());

}
