package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class SignaturePage extends BasePage {

    @AndroidFindBy(id = "signature_pad")
    WebElement signaturePad;

    @AndroidFindBy(id = "btn_validate_signature")
    WebElement validate;

    public void signByClient() {
        Rectangle r = signaturePad.getRect();

        new TouchAction<>(driver)
            .press(PointOption.point(r.x + 10, r.y + 10))
            .moveTo(PointOption.point(r.x + r.width - 10, r.y + r.height - 10))
            .release()
            .perform();

        validate.click();
    }
}
