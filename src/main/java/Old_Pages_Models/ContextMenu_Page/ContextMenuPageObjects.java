package Old_Pages_Models.ContextMenu_Page;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPageObjects extends Utils {

    @FindBy(xpath = "//*[@id=\"hot-spot\"]")
    @CacheLookup
    WebElement contextElementLocator;
}
