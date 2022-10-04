package Old_Pages_Models.BasicLogin_Page;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BasicLoginPageObjects extends Utils {

    @FindBy (xpath = "/html[1]/body[1]")
    @CacheLookup
    WebElement erorMessageLocator;

}
