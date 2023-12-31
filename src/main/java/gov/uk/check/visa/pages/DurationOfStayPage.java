package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility
{
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
                break;
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                break;
        }
    }


    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }

}
