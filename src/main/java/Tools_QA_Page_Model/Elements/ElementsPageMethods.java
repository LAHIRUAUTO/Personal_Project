package Tools_QA_Page_Model.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

public class ElementsPageMethods extends ElementsPageObjects{

    public void clickdynamicPropertiesLocator (){
        explicitWaitElementClickable(dynamicPropertiesLocator);
        dynamicPropertiesLocator.click();
    }

    public void clickFiveSecondsButton () {
        explicitWaitElementClickable(fiveSecondsToEnableButtonLocator);
        System.out.println("Hit so far");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(fiveSecondsToEnableButtonLocator.isEnabled(), "Second soft assert failed");
        fiveSecondsToEnableButtonLocator.click();
        System.out.println(fiveSecondsToEnableButtonLocator.getText());

    }

    public void clickAfterFiveSecondsButton () {
        explicitWaitElementVisible(fiveSecondsToVisibleButtonLocator);
        fiveSecondsToVisibleButtonLocator.click();
        System.out.println(fiveSecondsToVisibleButtonLocator.getText());
    }

    public void clickLinksLocator (){
        explicitWaitElementClickable(linksLocator);
         linksLocator.click();
    }

    public void getAllLinks (){
        if (tagName.size()>0) {
            System.out.println("Following Links Found \n");
            for (WebElement link : tagName){
                System.out.println(link.getAttribute("id"));
                if (link.getAttribute("id").equals("moved")) {
                    link.click();
                    System.out.println(linksResponse.getText());
                }

            }
        }
    }

    public void getLink (){
        explicitWaitElementClickable(linkMoved);
        System.out.println(linkMoved.getText());
        linkMoved.click();
        explicitWaitElementVisible(linksResponse);
        System.out.println(linksResponse.getText());

    }

    public void clickUploadAndDownloadLocator (){
        explicitWaitElementClickable(uploadAndDownloadLocator);
        uploadAndDownloadLocator.click();
    }

    public void clickChooseFileLocator (String textToBeInserted) throws FindFailed {
        explicitWaitElementClickable(chooseFileLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(chooseFileLocator).click().build().perform();
        actions.moveToElement(chooseFileLocator).click().build().perform();
        System.out.println(chooseFileLocator.getText());

        Screen scr = new Screen();
        Pattern searchButton = new Pattern(System.getProperty("user.dir")+"/Sikuli_Images/search_button.png");
        Pattern textField = new Pattern(System.getProperty("user.dir")+"/Sikuli_Images/text_field.png");
        Pattern openButton = new Pattern(System.getProperty("user.dir")+"/Sikuli_Images/open_button.png");

        scr.click(searchButton);
        scr.wait(textField, 20);
        scr.type(textField, textToBeInserted);
        scr.click(openButton);






    }



}
