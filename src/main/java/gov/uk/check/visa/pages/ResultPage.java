package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "h2[class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;
    @CacheLookup
    @FindBy(xpath = " //h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessage1;
    @CacheLookup
    @FindBy(xpath = " //h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement resultMessage2;



    //ResultPage - resultMessage locator and create methods 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)

    public String getResultMessage() {
        return getTextFromElement(resultMessage);
    }


    public void confirmResultMessage(String expectedMessage) {
        Assert.assertTrue(getResultMessage().equalsIgnoreCase(expectedMessage));

    }


    public String getResultTextMessage() {
        return getTextFromElement(resultMessage1);
    }


    public String getResultTextMessages1() {
        return getTextFromElement(resultMessage2);
    }

}
