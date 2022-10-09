package Tools_QA_Page_Model.Frames_And_Windows;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FramesAndWindowsPageObjects extends Utils {

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/span[1]")
    @CacheLookup
    WebElement  browserWindowList1Locator;

}
