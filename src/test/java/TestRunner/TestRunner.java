package TestRunner;


import Old_Pages_Models.ABTesting_Page.ABTestingPageMethods;
import Old_Pages_Models.AddRemoveElement_Page.AddRemoveElementPageMethods;
import Old_Pages_Models.BasicLogin_Page.BasicLoginPageMethods;
import Old_Pages_Models.Checkboxes_Page.CheckboxesPageMethods;
import Old_Pages_Models.ContextMenu_Page.ContextMenuPageMethods;
import Old_Pages_Models.DragAndDrop_Page.DragAndDropPageMethods;
import Old_Pages_Models.Home_Page.HomePageMethodsOld;
import Old_Pages_Models.PSS_Home_Page.AdminHomePageMethods;
import Old_Pages_Models.PSS_Login_Page.AdminLoginPageMethods;
import Tools_QA_Page_Model.Book_Store_Register_Page.BSRegisterPageMethods;
import Tools_QA_Page_Model.Home_Page.HomePageMethods;
import Tools_QA_Page_Model.Wdget_Page.WidgetPageMethods;
import Utilities.Utils;
import com.sun.net.httpserver.Authenticator;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class TestRunner extends Utils {

    String FilePath = "/home/user/Desktop/Udemy/Personal_Project/Test Data/PSStestdata.xls";
    String TestDataFilePath = "/home/user/Desktop/Udemy/Personal_Project/Test Data/Personal_Project_test_data.xls";
    FileInputStream fs = new FileInputStream(FilePath);
    FileInputStream fs2 = new FileInputStream(TestDataFilePath);
    Workbook wb = Workbook.getWorkbook(fs);
    Workbook wb2 = Workbook.getWorkbook(fs2);
    Sheet PSSAdminLogginSh = wb.getSheet("PssAdminLoggin");
    Sheet PSSAdminHomaPageSh = wb.getSheet("PssAdminHomePage");

    Sheet DataSeetSh = wb2.getSheet("DataSeet");



    public TestRunner() throws IOException, BiffException {
    }



    @Parameters({"title"})
    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "PSS Log in test case")
    public void LogInToThePSSAdmin (String title){
        String username = PSSAdminLogginSh.getCell("A2").getContents();
        String password = PSSAdminLogginSh.getCell("B2").getContents();

        AdminLoginPageMethods newadminloginpage = PageFactory.initElements(driver, AdminLoginPageMethods.class);
        AdminHomePageMethods newadminhomepage = PageFactory.initElements(driver, AdminHomePageMethods.class);
        newadminloginpage.enterUsername(username);
        newadminloginpage.enterPassword(password);
        newadminloginpage.clickLoginbutton();
        System.out.println(driver.getTitle());
        newadminhomepage.mouseHoweDashBooard();
    }

    @Test (dependsOnMethods = {"LogInToThePSSAdmin"},priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Click on toogle menu test case")
    public void ClickOnToogleMenu (){
        AdminHomePageMethods newadminhomepage = PageFactory.initElements(driver, AdminHomePageMethods.class);
        newadminhomepage.clickToogleMenu();


    }

    @Test (dependsOnMethods = {"LogInToThePSSAdmin", "ClickOnToogleMenu"}, priority = 2, retryAnalyzer = Authenticator.Retry.class, description = "Click on toogle menu test case")
    public void SearchForRoles () {
        String rolename = PSSAdminHomaPageSh.getCell("A2").getContents();

        AdminHomePageMethods newadminhomepage = PageFactory.initElements(driver, AdminHomePageMethods.class);
        newadminhomepage.mouseHoweMaintenance();
        newadminhomepage.mouseHoweSecurity();
        newadminhomepage.clickrole();
        newadminhomepage.swithToIframe();
        newadminhomepage.enterRoleName(rolename);
        newadminhomepage.clickSearchButton();
        newadminhomepage.clickRoleName();

    }


    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void ReadTheBannerOnHomePage (){

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        HomePageMethodsOld newhomepage = PageFactory.initElements(driver, HomePageMethodsOld.class);
        newhomepage.getBannerText();






    }
    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToABTestingPage () {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        ABTestingPageMethods newabtestingpage = PageFactory.initElements(driver, ABTestingPageMethods.class);
        HomePageMethodsOld newhomepage = PageFactory.initElements(driver, HomePageMethodsOld.class);
        newhomepage.clickABTestingPageLink();
        newabtestingpage.getTextOfABTestingDes();
        navigateBack();


    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToAddRemoveElementPage () {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        AddRemoveElementPageMethods newaddremoveelementpage = PageFactory.initElements(driver, AddRemoveElementPageMethods.class);
        HomePageMethodsOld newhomepage = PageFactory.initElements(driver, HomePageMethodsOld.class);
        newhomepage.clickaddRemoveElementPageLink();
        newaddremoveelementpage.addRemoveElementPageLink();
        navigateBack();

    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToBasicLoginPage () throws AWTException {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        BasicLoginPageMethods newbasicloginpage = PageFactory.initElements(driver, BasicLoginPageMethods.class);
        HomePageMethodsOld newhomepage = PageFactory.initElements(driver, HomePageMethodsOld.class);
        newhomepage.clickbasicLogingPageLink();
        newbasicloginpage.enterUserCredentials();
        newbasicloginpage.readErrorMessage();
        navigateBack();

    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToCheckboxesPage () {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        CheckboxesPageMethods newcheckboxespage = PageFactory.initElements(driver, CheckboxesPageMethods.class);
        HomePageMethodsOld newhomepage = PageFactory.initElements(driver, HomePageMethodsOld.class);
        newhomepage.clickCheckboxesPageLink();
        newcheckboxespage.selectCheckBox1();
        newcheckboxespage.deselectCheckBox2();
        navigateBack();
    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToContextMenuPage ()  {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        ContextMenuPageMethods newcontextmenupage = PageFactory.initElements (driver, ContextMenuPageMethods.class);
        HomePageMethodsOld newhomepage = PageFactory.initElements (driver, HomePageMethodsOld.class);
        newhomepage.clickCotextMenuPageLink();
        newcontextmenupage.clickContextMenu();
    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToDragAndDropPage () {
        //System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        DragAndDropPageMethods newdraganddroppage = PageFactory.initElements (driver, DragAndDropPageMethods.class);
        //HomePageMethodsOld newhomepage = PageFactory.initElements (driver, HomePageMethodsOld.class);
        //newhomepage.clickDragAndDropPageLink();
        newdraganddroppage.dragAndDrop();

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
        newhomepage.clickWidgetsLocator();
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

    @Test ( priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToAccordian () {

        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        WidgetPageMethods newwidgetpage = PageFactory.initElements(driver, WidgetPageMethods.class);
        newhomepage.clickWidgetsLocator();
        scrollDown();
        newwidgetpage.clickAccordianButton();
        newwidgetpage.clickOnAccordian1();
    }

    @Test ( priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToSlider () {
        String requiredPixelToMove = DataSeetSh.getCell("C5").getContents();

        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        WidgetPageMethods newwidgetpage = PageFactory.initElements(driver, WidgetPageMethods.class);
        newhomepage.clickWidgetsLocator();
        scrollDown();
        newwidgetpage.clickSliderButton();
        newwidgetpage.clickOnSliderPointerAndMove(Integer.parseInt(requiredPixelToMove));
    }

    @Test ( priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Register for the book store")
    public void goToProgressBar () throws InterruptedException {
        String requiredProgressBarValue = DataSeetSh.getCell("C5").getContents();

        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        WidgetPageMethods newwidgetpage = PageFactory.initElements(driver, WidgetPageMethods.class);
        newhomepage.clickWidgetsLocator();
        scrollDown();
        newwidgetpage.clickProgressBarButton();
        newwidgetpage.startAndStopProgressBar(Integer.parseInt(requiredProgressBarValue));
    }


}
