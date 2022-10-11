package Tools_QA_Page_Model.Interactions;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class InteractionPageObjects extends Utils {

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[1]/span[1]")
    @CacheLookup
    WebElement sortableButtonLocator;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/nav[1]/a[2]")
    @CacheLookup
    WebElement sortableGridViewButtonLocator;


    @FindBy (xpath = "//div[text()='One']")
    @CacheLookup
    WebElement sortableGridBoxOne;

    @FindBy (xpath = "//div[text()='Two']")
    @CacheLookup
    WebElement sortableGridBoxTwo;

    @FindBy (xpath = "//div[text()='Three']")
    @CacheLookup
    WebElement sortableGridBoxThree;

    @FindBy (xpath = "//div[text()='Four']")
    @CacheLookup
    WebElement sortableGridBoxFour;

    @FindBy (xpath = "//div[text()='Five']")
    @CacheLookup
    WebElement sortableGridBoxFive;

    @FindBy (xpath = "//div[text()='Six']")
    @CacheLookup
    WebElement sortableGridBoxSix;

    @FindBy (xpath = "//div[text()='Seven']")
    @CacheLookup
    WebElement sortableGridBoxSeven;

    @FindBy (xpath = "//div[text()='Eight']")
    @CacheLookup
    WebElement sortableGridBoxEight;

    @FindBy (xpath = "//div[text()='Nine']")
    @CacheLookup
    WebElement sortableGridBoxNine;
}
