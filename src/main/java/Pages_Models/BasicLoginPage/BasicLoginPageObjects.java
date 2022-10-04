package Pages_Models.BasicLoginPage;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class BasicLoginPageObjects extends Utils {

    @FindBy (xpath = "/html[1]/body[1]")
    @CacheLookup
    WebElement erorMessageLocator;

}
