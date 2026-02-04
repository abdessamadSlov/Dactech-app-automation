package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverFactory {

    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static void initDriver(String deviceKey) {
        DesiredCapabilities caps = buildCapabilities(deviceKey);

        try {
            String bsUrl = "https://" +
                    ConfigReader.get("browserstack.user") + ":" +
                    ConfigReader.get("browserstack.key") +
                    "@hub.browserstack.com/wd/hub";

            if (caps.getCapability("platformName").toString().equalsIgnoreCase("Android")) {
                driver.set(new AndroidDriver<>(new URL(bsUrl), caps));
            } else {
                driver.set(new IOSDriver<>(new URL(bsUrl), caps));
            }

        } catch (Exception e) {
            throw new RuntimeException("Driver init failed", e);
        }
    }

    private static DesiredCapabilities buildCapabilities(String deviceKey) {
        DesiredCapabilities caps = new DesiredCapabilities();

        String platform = ConfigReader.get(deviceKey + ".platformName");

        caps.setCapability("platformName", platform);
        caps.setCapability("automationName", ConfigReader.get(deviceKey + ".automationName"));
        caps.setCapability("deviceName", ConfigReader.get(deviceKey + ".deviceName"));
        caps.setCapability("osVersion", ConfigReader.get(deviceKey + ".osVersion"));
        caps.setCapability("app", ConfigReader.get(deviceKey + ".app"));

        if ("Android".equalsIgnoreCase(platform)) {
            caps.setCapability("appPackage", ConfigReader.get(deviceKey + ".appPackage"));
            caps.setCapability("appActivity", ConfigReader.get(deviceKey + ".appActivity"));
        } else {
            String bundleId = ConfigReader.get(deviceKey + ".bundleId");
            if (bundleId != null) caps.setCapability("bundleId", bundleId);
        }
        return caps;
    }

    public static AppiumDriver getDriver() {
        return driver.get();
    }

    public static void quit() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
