package utils;

import org.openqa.selenium.WebElement;
import pages.BasePage;

public class MediaUtils {

    private static BasePage basePage = new BasePage();

    public static void takePhoto() {
        WebElement btnPhoto = basePage.find("media.btn_photo");
        WebElement capture  = basePage.find("media.camera_capture");

        btnPhoto.click();
        capture.click();
    }

    public static void recordAudio() {
        basePage.find("media.btn_audio").click();
        try { Thread.sleep(3000); } catch (InterruptedException ignored) {}
        basePage.find("media.btn_stop_audio").click();
    }
}
