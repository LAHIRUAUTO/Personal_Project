package Tools_QA_Page_Model.Home_Page;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects extends Utils {




    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[1]\n")
    @CacheLookup
    WebElement ElementsDroDownLocator;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]\n")
    @CacheLookup
    WebElement FormsDroDownLocator;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[3]\n")
    @CacheLookup
    WebElement AlertsDroDownLocator;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[4]\n")
    @CacheLookup
    WebElement WidgetsDroDownLocator;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[6]\n")
    @CacheLookup
    WebElement BookStoreApplicationLocator;

    @FindBy(xpath = "//li[.='Profile']")
    @CacheLookup
    WebElement BSAProfileLocator;

    @FindBy(xpath = "//a[.='register']")
    @CacheLookup
    WebElement BSAProfileRegisterLocator;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/*[name()='svg'][1]\n")
    @CacheLookup
    WebElement FramewsAndWindowsLocator;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/*[name()='svg'][1]/*[name()='path'][1]")
    @CacheLookup
    WebElement InteractionsLocator;



}
