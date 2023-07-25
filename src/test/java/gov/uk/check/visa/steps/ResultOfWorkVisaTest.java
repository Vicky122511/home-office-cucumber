package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ResultPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ResultOfWorkVisaTest {
    @Then("User should see visa result {string}")
    public void userShouldSeeVisaResult(String wType) {
        Assert.assertEquals("Work Type Visa Status Not Matched",wType,new ResultPage().getResultTextMessage());
    }
}
