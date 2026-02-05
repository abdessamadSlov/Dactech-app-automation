package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignaturePage;
import pages.WorkOrderFormPage;

public class WorkOrderSteps {

    private WorkOrderFormPage formPage = new WorkOrderFormPage();
    private SignaturePage signaturePage = new SignaturePage();

    @When("il remplit un ordre de travail")
    public void il_remplit_un_OT() {
        formPage.fillWorkOrder();
    }

    @When("le client signe")
    public void le_client_signe() {
        signaturePage.signByClient();
    }

    @Then("l'ordre de travail est envoyé au manager")
    public void ot_envoye_au_manager() {
        System.out.println("OT envoyé (simulation)");
        // Ici tu pourrais ajouter vérif via notificationPage ou API si nécessaire
    }
}
