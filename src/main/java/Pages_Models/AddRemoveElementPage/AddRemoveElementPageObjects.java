package Pages_Models.AddRemoveElementPage;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElementPageObjects extends Utils {
    @FindBy(xpath = "/html/body/div[2]/div/div/button\n")
    @CacheLookup
    WebElement AddElementLocator;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/button[1]")
    @CacheLookup
    WebElement DeleteElementLocator;




}
