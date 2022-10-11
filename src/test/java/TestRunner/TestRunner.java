package TestRunner;



import Tools_QA_Page_Model.Book_Store_Register_Page.BSRegisterPageMethods;
import Tools_QA_Page_Model.Frames_And_Windows.FramesAndWindowsMethods;
import Tools_QA_Page_Model.Home_Page.HomePageMethods;
import Tools_QA_Page_Model.Interactions.InteractionPageMethods;
import Tools_QA_Page_Model.Wdget_Page.WidgetPageMethods;
import Utilities.Utils;
import com.sun.net.httpserver.Authenticator;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class TestRunner extends Utils {

    String TestDataFilePath = "/home/user/Desktop/Udemy/Personal_Project/Test Data/Personal_Project_test_data.xls";
    FileInputStream fs2 = new FileInputStream(TestDataFilePath);
    Workbook wb2 = Workbook.getWorkbook(fs2);

    Sheet DataSeetSh = wb2.getSheet("DataSeet");



    public TestRunner() throws IOException, BiffException {
    }




    @Parameters({"url", "browser"})
    @BeforeTest
    public void validateCurrentURL (String url, String browser){
        if (driver.getCurrentUrl().equals(url)){
            System.out.println("Correct URL hit on "+ browser);
        }
        else  {
            System.out.println("Incorrect URL hit on " + browser);
            driver.close();

        }
    }

    @Test ( priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void registerForBookStoreApplication () {
        String firstName = DataSeetSh.getCell("C3").getContents();
        String lastName = DataSeetSh.getCell("D3").getContents();
        String userName = DataSeetSh.getCell("E3").getContents();
        String password = DataSeetSh.getCell("F3").getContents();


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        BSRegisterPageMethods newbsregisterpage = PageFactory.initElements(driver, BSRegisterPageMethods.class);
        scrollDown();
        newhomepage.clickBookStoreApplicationLocator();
        scrollDown();
        newhomepage.clickBSAProfileLocator();
        newhomepage.clickBSAProfileRegisterLocator();
        newbsregisterpage.enterfirstName(firstName);
        newbsregisterpage.enterlastName(lastName);
        newbsregisterpage.enteruserName(userName);
        newbsregisterpage.enterpassword(password);
        newbsregisterpage.clickOnCaptcha();
        newbsregisterpage.clickOnRegisterButton();
    }


    @Test ( priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToWdgetsScreen () {
        String date = DataSeetSh.getCell("C4").getContents();
        String month = DataSeetSh.getCell("D4").getContents();
        String year = DataSeetSh.getCell("E4").getContents();


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        WidgetPageMethods newwidgetpage = PageFactory.initElements(driver, WidgetPageMethods.class);
        newhomepage.clickWidgetsLocator();
        scrollDown();
        newwidgetpage.clickDatePickerButton();
        newwidgetpage.clickDatePicker();
        newwidgetpage.selectMonthInCalanderDropDown(month);
        newwidgetpage.selectYearInCalanderDropDown(year);
        newwidgetpage.selectDepartureDateFrom(Integer.parseInt(date));


    }

    @Test ( priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToWdgetsScreen2 () {
        String date = DataSeetSh.getCell("C4").getContents();
        String month = DataSeetSh.getCell("D4").getContents();
        String year = DataSeetSh.getCell("E4").getContents();
        String timeSlot = DataSeetSh.getCell("F4").getContents();


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        WidgetPageMethods newwidgetpage = PageFactory.initElements(driver, WidgetPageMethods.class);
        scrollDown();
        newwidgetpage.clickDatePickerButton();
        newwidgetpage.clickDatePicker2();
        newwidgetpage.clickMonthDropDownInCalanser2();
        newwidgetpage.selectMonthInCalanderDropDown2(month);
        newwidgetpage.clickYearDropDownInCalanser2();
        newwidgetpage.selectYearInCalanderDropDown2(year);
        newwidgetpage.selectDepartureDateFrom2(Integer.parseInt(date));
        newwidgetpage.clickdatesDropDownInCalander2(timeSlot);


    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToAccordian () {

        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        WidgetPageMethods newwidgetpage = PageFactory.initElements(driver, WidgetPageMethods.class);
        scrollDown();
        newwidgetpage.clickAccordianButton();
        newwidgetpage.clickOnAccordian1();
    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToSlider () {
        String requiredPixelToMove = DataSeetSh.getCell("C5").getContents();

        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        WidgetPageMethods newwidgetpage = PageFactory.initElements(driver, WidgetPageMethods.class);
        scrollDown();
        newwidgetpage.clickSliderButton();
        newwidgetpage.clickOnSliderPointerAndMove(Integer.parseInt(requiredPixelToMove));
    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToProgressBar () throws InterruptedException {
        String requiredProgressBarValue = DataSeetSh.getCell("C5").getContents();

        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        WidgetPageMethods newwidgetpage = PageFactory.initElements(driver, WidgetPageMethods.class);
        scrollDown();
        newwidgetpage.clickProgressBarButton();
        newwidgetpage.startAndStopProgressBar(Integer.parseInt(requiredProgressBarValue));
    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToToolTipsScreen () throws InterruptedException {
        String tooltipTextValue = DataSeetSh.getCell("C5").getContents();


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        WidgetPageMethods newwidgetpage = PageFactory.initElements(driver, WidgetPageMethods.class);
        newhomepage.clickWidgetsLocator();
        newwidgetpage.clickToolTipsButton();
        //newwidgetpage.goToToolTip1();
        newwidgetpage.goToToolTip2(tooltipTextValue);
        //newwidgetpage.goToToolTip3();


    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToNewTab () throws InterruptedException {
        //String tooltipTextValue = DataSeetSh.getCell("C5").getContents();


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newhomepage.clickFramewsAndWindowsLocator();
        newframesandwindowspage.clickOnbrowserWindowList1Locator();
        newframesandwindowspage.clicknewTabButtonLocator();


    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToNewWindow () throws InterruptedException {


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newhomepage.clickFramewsAndWindowsLocator();
        newframesandwindowspage.clickOnbrowserWindowList1Locator();
        newframesandwindowspage.clicknewWindowButtonLocator();


    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToNewMessageWindow () throws InterruptedException {


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newhomepage.clickFramewsAndWindowsLocator();
        newframesandwindowspage.clickOnbrowserWindowList1Locator();
        newframesandwindowspage.clickNewMessageWindowButtonLocator();


    }

    @Test (groups = { "alert" })
    public void goToalert1 () throws InterruptedException {


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newhomepage.clickFramewsAndWindowsLocator();
        newframesandwindowspage.clickOnAlertList1Locator();
        newframesandwindowspage.clickalertButtonLocator1();


    }

    @Test (groups = { "alert" })
    public void goToalert2 () {


        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newframesandwindowspage.clickOnAlertList1Locator();
        newframesandwindowspage.clickalertButtonLocator2();


    }

    @Test (groups = { "alert" })
    public void goToalert3 () {


        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newframesandwindowspage.clickOnAlertList1Locator();
        newframesandwindowspage.clickalertButtonLocator3();


    }

    @Test (groups = { "alert" })
    public void goToalert4 () {


        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newframesandwindowspage.clickOnAlertList1Locator();
        newframesandwindowspage.clickalertButtonLocator4();


    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToNewFrameWindow ()  {


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newhomepage.clickFramewsAndWindowsLocator();
        newframesandwindowspage.clickOnFrameList1Locator();
        switchToFramesByID("frame1");
        newframesandwindowspage.getFrame1Text();
        newframesandwindowspage.switchToDefaultFrame();
        switchToFramesByID("frame2");
        newframesandwindowspage.getFrame2Text();



    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToNewNestedFrameWindow ()  {


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newhomepage.clickFramewsAndWindowsLocator();
        newframesandwindowspage.clickOnNestedFrameList1Locator();
        switchToFramesByID("frame1");
        newframesandwindowspage.getPerantFrameText();
        switchToFramesByElement(driver.findElement(By.tagName("iframe")));
        newframesandwindowspage.getChildFrameText();
        newframesandwindowspage.swithcToDefaultContent();



    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToModalDialogsWindow ()  {


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        FramesAndWindowsMethods newframesandwindowspage = PageFactory.initElements(driver, FramesAndWindowsMethods.class);
        newhomepage.clickFramewsAndWindowsLocator();
        newframesandwindowspage.clickModalDialogsList1Locator();
        newframesandwindowspage.clickSmallModalDialogButtonLocator();
        newframesandwindowspage.getSmallModalDialogContent();
        newframesandwindowspage.clickSmallModalDialogCloseButtonLocator();




    }

    @Test (  priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToInteractionsWindow ()  {


        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        InteractionPageMethods newinteractionspage = PageFactory.initElements(driver, InteractionPageMethods.class);
        newhomepage.clickInteractionsLocator();
        newinteractionspage.clicksortableButtonLocator();
        newinteractionspage.clickSortableGridViewButtonLocator();




    }



}
