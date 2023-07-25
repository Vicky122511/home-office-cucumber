package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import io.cucumber.java.en.And;

public class FamilyImmigrationStatusTest {
    @And("State My Partner of Family memeber have uk immigration Status {string}")
    public void stateMyPartnerOfFamilyMemeberHaveUkImmigrationStatus(String yesno) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(yesno);
    }

    @And("Click on continue Button of Family Member Page")
    public void clickOnContinueButtonOfFamilyMemberPage() {
        new FamilyImmigrationStatusPage().clickNextStepButton();
    }
}
