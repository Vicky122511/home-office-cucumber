package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility
{
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage() {PageFactory.initElements(driver, this);}

    /**
     * WorkTypePage - nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'
     * and 'void clickNextStepButton()'
     */

    @FindBy(xpath = "//label[normalize-space()='Health and care professional']")
    List<WebElement> selectJobTypeList;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectJobType(String job) {
        for (WebElement jobType: selectJobTypeList)
        {if (jobType.getText().equalsIgnoreCase(job)){
            clickOnElement(jobType);
            break;
        }
        }

    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }

}
