package Tools_QA_Page_Model.Book_Store_Register_Page;

public class BSRegisterPageMethods extends BSRegisterPageObjects{

    public void enterfirstName (String firstName) {
        explicitWaitElementClickable(firstNameFeildLocator);
        firstNameFeildLocator.sendKeys(firstName);
    }

    public void enterlastName (String lastName) {
        explicitWaitElementClickable(lastNameFeildLocator);
        lastNameFeildLocator.sendKeys(lastName);
    }

    public void enteruserName (String userName) {
        explicitWaitElementClickable(userNameFeildLocator);
        userNameFeildLocator.sendKeys(userName);
    }

    public void enterpassword (String password) {
        explicitWaitElementClickable(passwordFeildLocator);
        passwordFeildLocator.sendKeys(password);
    }

    public void clickOnCaptcha () {
        explicitWaitElementClickable(captchaLocator);
        captchaLocator.click();
    }

    public void clickOnRegisterButton () {
        explicitWaitElementClickable(registerButtonLocator);
        registerButtonLocator.click();
    }

}
