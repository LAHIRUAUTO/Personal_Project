package Pages_Models.PSS_Home_Page;

import java.io.IOException;

public class AdminHomePageMethods extends AdminHomePageObjects{

    public AdminHomePageMethods() throws IOException {
    }

    public void gotologgedInUserinfor() {
        explicitWaitElementVisible (userinfo);
        mouseHover(userinfo);
        //System.out.println(userinfo.getText());
    }

    public void clickToogleMenu () {
        explicitWaitElementClickable(tooglemenu);
        click(tooglemenu);
    }

    public void mouseHoweMaintenance () {
        fluentWaitElementVisible(maintenancetab);
        mouseHover(maintenancetab);
    }

    public void mouseHoweDashBooard () {
        fluentWaitElementVisible(dashboard);
        mouseHover(dashboard);
    }

    public void mouseHoweSecurity () {

        mouseHover(security);
    }

    public void clickrole () {
        explicitWaitElementVisible(role);
        click(role);
    }

    public void swithToIframe () {
        driver.switchTo().frame(1);

    }

    public void enterRoleName (String rolename) {
        //explicitWaitElementVisible(roleNameFieldLocator);
        roleNameFieldLocator.sendKeys(rolename);
    }

    public void clickSearchButton () {
        explicitWaitElementVisible(searchButtonLocator);
        searchButtonLocator.click();
    }

    public void clickRoleName () {
        explicitWaitElementVisible(roleNameLocator);
        doubleClick(roleNameLocator);
    }


    public void clickLogoutButton () {

        logoutbutton.click();
    }



}
