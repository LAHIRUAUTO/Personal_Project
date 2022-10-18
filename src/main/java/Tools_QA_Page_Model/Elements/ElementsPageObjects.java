package Tools_QA_Page_Model.Elements;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElementsPageObjects extends Utils {

    @FindBy (xpath = "//span[normalize-space()='Dynamic Properties']")
    @CacheLookup
    WebElement dynamicPropertiesLocator;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]")
    @CacheLookup
    WebElement fiveSecondsToEnableButtonLocator;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/button[3]")
    @CacheLookup
    WebElement fiveSecondsToVisibleButtonLocator;



}
