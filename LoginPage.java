package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "input_username")
    WebElement username;

    @AndroidFindBy(id = "input_password")
    WebElement password;

    @AndroidFindBy(id = "btn_login")
    WebElement loginBtn;

    public void authenticate(String user, String pwd) {
        username.sendKeys(user);
        password.sendKeys(pwd);
        loginBtn.click();
    }
}
