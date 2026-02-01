package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WorkOrderFormPage extends BasePage {

    @AndroidFindBy(id = "input_comment")
    WebElement comment;

    @AndroidFindBy(id = "checkbox_completed")
    WebElement completed;

    @AndroidFindBy(id = "btn_submit_ot")
    WebElement submit;

    public void fillWorkOrder() {
        comment.sendKeys("Intervention réalisée avec succès");
        completed.click();
        swipeUp();
        submit.click();
    }
}
