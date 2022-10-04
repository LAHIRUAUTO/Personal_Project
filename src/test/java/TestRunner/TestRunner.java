package TestRunner;


import Pages_Models.ABTesting_Page.ABTestingPageMethods;
import Pages_Models.AddRemoveElementPage.AddRemoveElementPageMethods;
import Pages_Models.BasicLoginPage.BasicLoginPageMethods;
import Pages_Models.Home_Page.HomePageMethods;
import Pages_Models.PSS_Home_Page.AdminHomePageMethods;
import Pages_Models.PSS_Login_Page.AdminLoginPageMethods;
import Utilities.Utils;
import com.sun.net.httpserver.Authenticator;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
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

    @Test (dependsOnMethods = {"LogInToThePSSAdmin"}, priority = 2, retryAnalyzer = Authenticator.Retry.class, description = "PSS Log out test case")
    public void LogOutFromThePSSAdmin (){

        AdminHomePageMethods newadminhomepage = PageFactory.initElements(driver, AdminHomePageMethods.class);
        newadminhomepage.gotologgedInUserinfor();
        newadminhomepage.clickLogoutButton();


    }


    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void ReadTheBannerOnHomePage (){
        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        newhomepage.getBannerText();




    }
    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToABTestingPage () {
        ABTestingPageMethods newabtestingpage = PageFactory.initElements(driver, ABTestingPageMethods.class);
        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        newhomepage.clickABTestingPageLink();
        newabtestingpage.getTextOfABTestingDes();
        newabtestingpage.goBackFromABTestingPage();


    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToAddRemoveElementPage () {
        AddRemoveElementPageMethods newaddremoveelementpage = PageFactory.initElements(driver, AddRemoveElementPageMethods.class);
        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        newhomepage.addRemoveElementPageLink();
        newaddremoveelementpage.addRemoveElementPageLink();
        newaddremoveelementpage.goBackFromAddRemoveElementPage();


    }

    @Test (priority = 1, retryAnalyzer = Authenticator.Retry.class, description = "Read the banner text on home page")
    public void GoToBasicLoginPage () throws AWTException {
        BasicLoginPageMethods newbasicloginpage = PageFactory.initElements(driver, BasicLoginPageMethods.class);
        HomePageMethods newhomepage = PageFactory.initElements(driver, HomePageMethods.class);
        newhomepage.basicLogingPageLink();
        newbasicloginpage.enterUserCredentials();
        //newbasicloginpage.readErrorMessage();
        //navigateBack();

    }


}
