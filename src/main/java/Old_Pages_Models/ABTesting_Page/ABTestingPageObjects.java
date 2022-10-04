package Old_Pages_Models.ABTesting_Page;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ABTestingPageObjects extends Utils {


    @FindBy (xpath = "/html/body/div[2]/div/div/p")
    @CacheLookup
    WebElement ABTestingDesLocator;




}
