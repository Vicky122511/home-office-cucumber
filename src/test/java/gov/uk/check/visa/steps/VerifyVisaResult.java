package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ResultPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifyVisaResult {
    @Then("User should see Visa Result {string}")
    public void userShouldSeeVisaResult(String resultVisa) {

        //new ResultPage().getResultMessage();
        Assert.assertEquals("Visa Result Not Matched",resultVisa,new ResultPage().getResultMessage());
    }


}
