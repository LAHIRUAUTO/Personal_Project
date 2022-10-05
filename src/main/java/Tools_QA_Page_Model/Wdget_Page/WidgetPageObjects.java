package Tools_QA_Page_Model.Wdget_Page;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WidgetPageObjects extends Utils {

    @FindBy(xpath = "//span[.='Date Picker']")
    @CacheLookup
    WebElement datePickerButton;

    @FindBy (xpath = "//input[@id='datePickerMonthYearInput']")
    @CacheLookup
    WebElement datepicker;

    @FindBy (xpath = "//select[@class='react-datepicker__month-select']")
    @CacheLookup
    WebElement monthDropDownInCalander;

    @FindBy (xpath = "//select[@class='react-datepicker__year-select']")
    @CacheLookup
    WebElement yearDropDownInCalander;


    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]\n")
    @CacheLookup

    WebElement dateInCalander;

    @FindBy (xpath = "//*[@id=\"dateAndTimePickerInput\"]\n")
    @CacheLookup
    WebElement datepicker2;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]\n")
    @CacheLookup
    WebElement monthDropDownInCalander2;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]\n")
    @CacheLookup
    WebElement yearDropDownInCalander2;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[1]\n")
    @CacheLookup
    WebElement startTime;




}
