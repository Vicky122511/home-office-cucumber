package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.WorkTypePage;
import io.cucumber.java.en.And;

public class WorkTypeTest {
    @And("Select have planning to Work for {string}")
    public void selectHavePlanningToWorkFor(String wType) {
        new WorkTypePage().selectJobType(wType);
    }

    @And("Click on Continue Button of planning for Work")
    public void clickOnContinueButtonOfPlanningForWork() {
        new WorkTypePage().clickNextStepButton();
    }
}
