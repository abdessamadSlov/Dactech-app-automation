package pages;

public class WorkOrderFormPage extends BasePage {

    public void fillWorkOrder() {
        find("workorder.comment").sendKeys("Intervention réalisée avec succès");
        find("workorder.completed").click();

        // Scroll jusqu’au bouton si besoin
        scrollToElement(find("workorder.submit"));

        find("workorder.submit").click();
    }
}
