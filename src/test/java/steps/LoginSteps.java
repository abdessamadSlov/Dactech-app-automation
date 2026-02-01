package steps;

import config.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    @Given("le technicien est authentifié")
    public void le_technicien_est_authentifié() {
        // Ici on peut mettre des identifiants fictifs pour demo
        loginPage.authenticate("technicien1", "Password123");
    }

    @When("il se connecte avec {string} et {string}")
    public void il_se_connecte_avec_et(String user, String pwd) {
        loginPage.authenticate(user, pwd);
    }
}
