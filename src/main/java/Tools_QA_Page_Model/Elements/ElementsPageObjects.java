package Tools_QA_Page_Model.Elements;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElementsPageObjects extends Utils {

    @FindBy (xpath = "//span[normalize-space()='Dynamic Properties']")
    @CacheLookup
    WebElement dynamicPropertiesLocator;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]")
    @CacheLookup
    WebElement fiveSecondsToEnableButtonLocator;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/button[3]")
    @CacheLookup
    WebElement fiveSecondsToVisibleButtonLocator;

    @FindBy (xpath = "//span[normalize-space()='Links']")
    @CacheLookup
    WebElement linksLocator;

    @FindBy (tagName = "a")
    @CacheLookup
    List<WebElement> tagName;

    @FindBy (xpath = "//a[@id='moved']")
    @CacheLookup
    WebElement linkMoved;

    @FindBy (xpath = "//p[@id='linkResponse']")
    @CacheLookup
    WebElement linksResponse;

    @FindBy (xpath = "//span[normalize-space()='Upload and Download']")
    @CacheLookup
    WebElement uploadAndDownloadLocator;

    @FindBy (id = "uploadFile")
    @CacheLookup
    WebElement chooseFileLocator;

}
