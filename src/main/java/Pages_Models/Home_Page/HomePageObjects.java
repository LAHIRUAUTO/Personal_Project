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

}
