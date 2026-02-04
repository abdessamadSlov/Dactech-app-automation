package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "input_username")
    @iOSXCUITFindBy(accessibility = "input_username")
    private WebElement username;

    @AndroidFindBy(id = "input_password")
    @iOSXCUITFindBy(accessibility = "input_password")
    private WebElement password;

    @AndroidFindBy(id = "btn_login")
    @iOSXCUITFindBy(accessibility = "btn_login")
    private WebElement loginBtn;

    public void authenticate(String user, String pwd) {
        username.sendKeys(user);
        password.sendKeys(pwd);
        loginBtn.click();
    }
}
