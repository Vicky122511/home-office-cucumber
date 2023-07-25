package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.DurationOfStayPage;
import io.cucumber.java.en.And;

public class DurationOfStayTest {
    @And("Select Duration of Stay {string}")
    public void selectDurationOfStay(String duration) {
        new DurationOfStayPage().selectLengthOfStay(duration);
    }

    @And("Click on Continue Button of Duration Page")
    public void clickOnContinueButtonOfDurationPage() {
        new DurationOfStayPage().clickNextStepButton();
    }
}
