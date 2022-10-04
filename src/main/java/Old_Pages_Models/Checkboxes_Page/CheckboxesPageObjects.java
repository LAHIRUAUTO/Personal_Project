package Old_Pages_Models.Checkboxes_Page;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPageObjects extends Utils {
    @FindBy (xpath = "/html/body/div[2]/div/div/form/input[1]\n")
    @CacheLookup
    WebElement checkbox1;

    @FindBy (xpath = "/html/body/div[2]/div/div/form/input[2]\n")
    @CacheLookup
    WebElement checkbox2;
}
