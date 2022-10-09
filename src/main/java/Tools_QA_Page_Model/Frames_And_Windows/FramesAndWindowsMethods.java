package Tools_QA_Page_Model.Frames_And_Windows;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FramesAndWindowsMethods extends FramesAndWindowsPageObjects{

    public void clickOnbrowserWindowList1Locator () {
        explicitWaitElementClickable(browserWindowList1Locator);
        browserWindowList1Locator.click();
    }


}
