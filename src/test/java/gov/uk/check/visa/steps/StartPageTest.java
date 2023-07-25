package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StartPageTest {
    @Given("User on Home Page")
    public void userOnHomePage() {
    }

    @When("Click On Start Page")
    public void clickOnStartPage() {
        new StartPage().clickStartNow();
    }
}
