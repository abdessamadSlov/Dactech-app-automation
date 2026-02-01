package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverFactory {

    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static void initDriver(String deviceKey) {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", ConfigReader.get("platformName"));
        caps.setCapability("automationName", ConfigReader.get("automationName"));
        caps.setCapability("deviceName", ConfigReader.get(deviceKey + ".deviceName"));
        caps.setCapability("osVersion", ConfigReader.get(deviceKey + ".osVersion"));
        caps.setCapability("app", ConfigReader.get("browserstack.app"));
        caps.setCapability("appPackage", ConfigReader.get("appPackage"));
        caps.setCapability("appActivity", ConfigReader.get("appActivity"));

        try {
            driver.set(new AndroidDriver<>(
                new URL("https://" +
                    ConfigReader.get("browserstack.user") + ":" +
                    ConfigReader.get("browserstack.key") +
                    "@hub.browserstack.com/wd/hub"),
                caps));
        } catch (Exception e) {
            throw new RuntimeException("Driver init failed", e);
        }
    }

    public static AppiumDriver getDriver() {
        return driver.get();
    }

    public static void quit() {
        driver.get().quit();
        driver.remove();
    }
}
