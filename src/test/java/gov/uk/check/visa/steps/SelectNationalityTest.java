package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.And;

public class SelectNationalityTest {
    @And("Select Nationality {string}")
    public void selectNationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("Click on Next Step")
    public void clickOnNextStep() {
        new SelectNationalityPage().clickNextStepButton();
    }
}
