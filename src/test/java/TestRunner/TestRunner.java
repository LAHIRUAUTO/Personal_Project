package TestRunner;


import Old_Pages_Models.ABTesting_Page.ABTestingPageMethods;
import Old_Pages_Models.AddRemoveElement_Page.AddRemoveElementPageMethods;
import Old_Pages_Models.BasicLogin_Page.BasicLoginPageMethods;
import Old_Pages_Models.Checkboxes_Page.CheckboxesPageMethods;
import Old_Pages_Models.ContextMenu_Page.ContextMenuPageMethods;
import Old_Pages_Models.DragAndDrop_Page.DragAndDropPageMethods;
import Old_Pages_Models.Home_Page.HomePageMethods;
import Old_Pages_Models.PSS_Home_Page.AdminHomePageMethods;
import Old_Pages_Models.PSS_Login_Page.AdminLoginPageMethods;
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

    String FilePath = "/home/user/Desktop/Udemy/Test/Test Data/PSStestdata.xls";
    FileInputStream fs = new FileInputStream(FilePath);
    Workbook wb = Workbook.getWorkbook(fs);
    Sheet PSSAdminLogginSh = wb.getSheet("PssAdminLoggin");
    Sheet PSSAdminHomaPageSh = wb.getSheet("PssAdminHomePage");



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
        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        newhomepage.getBannerText();






    }
    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToABTestingPage () {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        ABTestingPageMethods newabtestingpage = PageFactory.initElements(driver, ABTestingPageMethods.class);
        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        newhomepage.clickABTestingPageLink();
        newabtestingpage.getTextOfABTestingDes();
        navigateBack();


    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToAddRemoveElementPage () {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        AddRemoveElementPageMethods newaddremoveelementpage = PageFactory.initElements(driver, AddRemoveElementPageMethods.class);
        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        newhomepage.clickaddRemoveElementPageLink();
        newaddremoveelementpage.addRemoveElementPageLink();
        navigateBack();

    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToBasicLoginPage () throws AWTException {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        BasicLoginPageMethods newbasicloginpage = PageFactory.initElements(driver, BasicLoginPageMethods.class);
        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        newhomepage.clickbasicLogingPageLink();
        newbasicloginpage.enterUserCredentials();
        newbasicloginpage.readErrorMessage();
        navigateBack();

    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToCheckboxesPage () {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        CheckboxesPageMethods newcheckboxespage = PageFactory.initElements(driver, CheckboxesPageMethods.class);
        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        newhomepage.clickCheckboxesPageLink();
        newcheckboxespage.selectCheckBox1();
        newcheckboxespage.deselectCheckBox2();
        navigateBack();
    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToContextMenuPage ()  {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        ContextMenuPageMethods newcontextmenupage = PageFactory.initElements (driver, ContextMenuPageMethods.class);
        HomePageMethods newhomepage = PageFactory.initElements (driver, HomePageMethods.class);
        newhomepage.clickCotextMenuPageLink();
        newcontextmenupage.clickContextMenu();
    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToDragAndDropPage () {
        //System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        DragAndDropPageMethods newdraganddroppage = PageFactory.initElements (driver, DragAndDropPageMethods.class);
        //HomePageMethods newhomepage = PageFactory.initElements (driver, HomePageMethods.class);
        //newhomepage.clickDragAndDropPageLink();
        newdraganddroppage.dragAndDrop();

    }


}
