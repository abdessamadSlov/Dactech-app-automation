package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.Duration;
import java.util.Arrays;

public class SignaturePage extends BasePage {

    @AndroidFindBy(id = "signature_pad")
    @iOSXCUITFindBy(accessibility = "signature_pad")
    private WebElement signaturePad;

    @AndroidFindBy(id = "btn_validate_signature")
    @iOSXCUITFindBy(accessibility = "btn_validate_signature")
    private WebElement validate;






    
    public void signByClient() {
        int centerX = signaturePad.getRect().x + signaturePad.getRect().width / 2;
        int centerY = signaturePad.getRect().y + signaturePad.getRect().height / 2;

        // W3C Actions : draw a simple line
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1)
            .addAction(finger.createPointerMove(Duration.ZERO,
                    PointerInput.Origin.viewport(), centerX - 50, centerY))
            .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
            .addAction(finger.createPointerMove(Duration.ofMillis(300),
                    PointerInput.Origin.viewport(), centerX + 50, centerY))
            .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(swipe));

        validate.click();
    }
}
