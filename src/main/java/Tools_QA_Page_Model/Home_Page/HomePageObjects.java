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

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[5]\n")
    @CacheLookup
    WebElement InteractionsDroDownLocator;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[6]\n")
    @CacheLookup
    WebElement BookStoreApplicationLocator;

    @FindBy(xpath = "//li[.='Profile']")
    @CacheLookup
    WebElement BSAProfileLocator;

    @FindBy(xpath = "//a[.='register']")
    @CacheLookup
    WebElement BSAProfileRegisterLocator;




}
