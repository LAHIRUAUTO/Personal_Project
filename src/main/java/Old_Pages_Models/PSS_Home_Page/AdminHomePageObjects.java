package Old_Pages_Models.PSS_Home_Page;

import Utilities.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class AdminHomePageObjects extends Utils {

    public AdminHomePageObjects() throws IOException {
    }


    @FindBy(xpath = "/html/body/header/div[2]/div[2]/a/div\n")
    @CacheLookup
    WebElement userinfo;

    @FindBy(xpath = "//div[@class='tr u-name']")
    @CacheLookup
    WebElement loggedinuser;

    @FindBy(xpath = "//a[@id='btnChangePassword']")
    @CacheLookup
    WebElement changepassword;

    @FindBy(xpath = "//a[@class='logout']")
    @CacheLookup
    WebElement logoutbutton;

    @FindBy(xpath = "//*[@id=\"ui-id-2\"]\n")
    @CacheLookup
    WebElement dashboard;

    @FindBy(xpath = "/html/body/header/a\n")
    @CacheLookup
    WebElement tooglemenu;

    @FindBy (xpath = "/html/body/header/nav/ul/li[2]/a\n")
    @CacheLookup
    WebElement maintenancetab;

    @FindBy (xpath = "/html/body/header/nav/ul/li[2]/ul/li[1]/a\n")
    @CacheLookup
    WebElement security;

    @FindBy (xpath = "/html/body/header/nav/ul/li[2]/ul/li[1]/ul/li[1]/a\n")
    @CacheLookup
    WebElement role;

    @FindBy (xpath = "/html/body/header/nav/ul/li[2]/ul/li[1]/ul/li[2]/a\n")
    @CacheLookup
    WebElement functionalUsage;

    @FindBy (xpath = "//*[@id=\"roleName\"]")
    @CacheLookup
    WebElement roleNameFieldLocator;

    @FindBy (xpath = "//*[@id=\"btnSearch\"]")
    @CacheLookup
    WebElement searchButtonLocator;

    @FindBy (xpath = "/html/body/section/section[1]/section[2]/section/div[1]/div/div/div[3]/div[3]/div/table/tbody/tr[2]/td[2]")
    @CacheLookup
    WebElement roleNameLocator;






}