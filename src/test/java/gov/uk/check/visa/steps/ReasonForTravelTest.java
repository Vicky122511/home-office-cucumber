package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import io.cucumber.java.en.And;

public class ReasonForTravelTest {
    @And("Select Reason for Travel  {string}")
    public void selectReasonForTravel(String reasonTravel) {
       new ReasonForTravelPage().selectReasonForVisit(reasonTravel);
    }

    @And("Click On Continue Button")
    public void clickOnContinueButton() {
       new ReasonForTravelPage().clickNextStepButton();
    }
}
