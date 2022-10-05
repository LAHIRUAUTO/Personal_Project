package Tools_QA_Page_Model.Book_Store_Register_Page;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BSRegisterPageObjects extends Utils {

    @FindBy(xpath = "//input[@id='firstname']")
    @CacheLookup
    WebElement firstNameFeildLocator;

    @FindBy(xpath = "//input[@id='lastname']")
    @CacheLookup
    WebElement lastNameFeildLocator;

    @FindBy(xpath = "//input[@id='userName']")
    @CacheLookup
    WebElement userNameFeildLocator;

    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    WebElement passwordFeildLocator;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")
    @CacheLookup
    WebElement captchaLocator;

    @FindBy(xpath = "//button[@id='register']")
    @CacheLookup
    WebElement registerButtonLocator;
}
