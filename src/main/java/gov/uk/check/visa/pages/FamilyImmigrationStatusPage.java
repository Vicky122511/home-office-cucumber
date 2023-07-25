package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility
{
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement statusYes;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1'] ")
    WebElement statusNo;


    public void selectImmigrationStatus(String immigrationStatus) {

        switch (immigrationStatus) {
            case "Yes":
                clickOnElement(statusYes);
                break;
            case "No":
                clickOnElement(statusNo);
                break;

        }

    }

    public void clickNextStepButton() {
        clickOnElement(continueButton);

    }
}
