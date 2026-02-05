package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public abstract class BasePage {

    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    //  clé --> locator
    // "login.username" → By.id("com.app:id/username")
    protected MobileElement find(String key) {
        return driver.findElement(getLocator(key));
    }

}
