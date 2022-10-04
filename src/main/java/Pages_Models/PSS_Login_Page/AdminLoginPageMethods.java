package Pages_Models.PSS_Login_Page;
import java.io.IOException;

public class AdminLoginPageMethods extends AdminLoginPageObjects {

    public AdminLoginPageMethods() throws IOException {
    }

    public void enterUsername (String username) {
        usernamelocator.sendKeys(username);

    }

    public void enterPassword (String password) {
        passwordlocator.sendKeys(password);
    }

    public void clickLoginbutton (){
        explicitWaitElementClickable(loginButtonlocator);
        click(loginButtonlocator);

    }

    public String title (){
        driver.getTitle();
        return title();
    }
}
