package utils;

import config.DriverFactory;
import org.openqa.selenium.By;

public class MediaUtils {

    public static void takePhoto() {
        DriverFactory.getDriver().findElement(By.id("btn_photo")).click();
        DriverFactory.getDriver().findElement(By.id("camera_capture")).click();
    }

    public static void recordAudio() {
        DriverFactory.getDriver().findElement(By.id("btn_audio")).click();
        try { Thread.sleep(3000); } catch(Exception e){}
        DriverFactory.getDriver().findElement(By.id("btn_stop_audio")).click();
    }
}
