package Tools_QA_Page_Model.Wdget_Page;

import Utilities.Utils;
import org.openqa.selenium.By;
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

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul\n")
    @CacheLookup
    WebElement startTimeListLocator;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]/span\n")
    @CacheLookup
    WebElement accordianButton;

    @FindBy(xpath = "//*[@id=\"section1Heading\"]")
    @CacheLookup
    WebElement sectionHeader1Button;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[4]/span\n")
    @CacheLookup
    WebElement sliderButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/form/div/div[1]/span/input\n")
    @CacheLookup
    WebElement sliderLocator;

    @FindBy(xpath = "//*[@id=\"sliderValue\"]\n")
    @CacheLookup
    WebElement sliderValue;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[5]/span\n")
    @CacheLookup
    WebElement progressBarButton;

    @FindBy(xpath = "//*[@id=\"startStopButton\"]\n")
    @CacheLookup
    WebElement startStopButtonLocator;

    @FindBy(xpath = "//*[@id=\"resetButton\"]\n")
    @CacheLookup
    WebElement resetButtonLocator;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[7]/span\n")
    @CacheLookup
    WebElement toolTipsButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]\n")
    @CacheLookup
    WebElement toolTip1;



    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/input[1]\n")
    @CacheLookup
    WebElement toolTip2;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/a[1]\n")
    @CacheLookup
    WebElement toolTip3;























}
