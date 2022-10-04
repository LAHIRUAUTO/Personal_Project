package Pages_Models.Home_Page;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects extends Utils {

    @FindBy(xpath = "/html/body/div[2]/div/h1\n")
    @CacheLookup
    WebElement bannerLocator;

    @FindBy (xpath = "/html/body/div[2]/div/ul/li[1]/a\n")
    @CacheLookup
    WebElement ABTestingPageLocator;

    @FindBy (xpath = "/html/body/div[2]/div/ul/li[2]/a\n")
    @CacheLookup
    WebElement AddRemoveElementPageLocator;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    @CacheLookup
    WebElement BasicLoginPageLocator;

}
