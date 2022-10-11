package Tools_QA_Page_Model.Frames_And_Windows;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FramesAndWindowsPageObjects extends Utils {

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/span[1]")
    @CacheLookup
    WebElement  browserWindowList1Locator;

    @FindBy (css = "button[id='tabButton']")
    @CacheLookup
    WebElement newTabButtonLocator;

    @FindBy (xpath = "/html[1]/body[1]/h1[1]")
    @CacheLookup
    WebElement childWindowTextLocator;


    @FindBy (css = "button[id='windowButton']")
    @CacheLookup
    WebElement newWindowButtonLocator;

    @FindBy (css = "button[id='messageWindowButton']")
    @CacheLookup
    WebElement newMessageWindowButtonLocator;

    @FindBy (xpath = "/html[1]/body[1]\n")
    @CacheLookup
    WebElement childMessageWindowTextLocator;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/span[1]")
    @CacheLookup
    WebElement  alertList1Locator;

    @FindBy (css = "button[id='alertButton']")
    @CacheLookup
    WebElement alertButtonLocator1;

    @FindBy (css = "button[id='timerAlertButton']")
    @CacheLookup
    WebElement alertButtonLocator2;

    @FindBy (css = "button[id='confirmButton']")
    @CacheLookup
    WebElement alertButtonLocator3;

    @FindBy (css = "button[id='promtButton']")
    @CacheLookup
    WebElement alertButtonLocator4;



}
