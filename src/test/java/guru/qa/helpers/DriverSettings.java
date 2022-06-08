package guru.qa.helpers;

import guru.qa.drivers.BrowserstackDriver;
import guru.qa.drivers.MobileDriver;

public class DriverSettings {
    public static String getDeviceProvider(String deviceProvider) {
        if (deviceProvider.equals("mobile")) {
            return MobileDriver.class.getName();
        }

        if (deviceProvider.equals("browserstack")) {
            return BrowserstackDriver.class.getName();
        }

        throw new RuntimeException("Didn't select device");
    }
}
