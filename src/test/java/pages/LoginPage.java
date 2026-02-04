package pages;

public class LoginPage extends BasePage {

    public void authenticate(String user, String pwd) {
        find("login.username").sendKeys(user);
        find("login.password").sendKeys(pwd);
        find("login.loginBtn").click();
    }
}
