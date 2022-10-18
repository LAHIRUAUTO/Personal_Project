package Tools_QA_Page_Model.Elements;

import org.testng.asserts.SoftAssert;

public class ElementsPageMethods extends ElementsPageObjects{

    public void clickdynamicPropertiesLocator (){
        explicitWaitElementClickable(dynamicPropertiesLocator);
        dynamicPropertiesLocator.click();
    }

    public void clickFiveSecondsButton () {
        explicitWaitElementClickable(fiveSecondsToEnableButtonLocator);
        System.out.println("Hit so far");
       /* SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(fiveSecondsToEnableButtonLocator.isEnabled(), "Second soft assert failed");*/
        fiveSecondsToEnableButtonLocator.click();
        System.out.println(fiveSecondsToEnableButtonLocator.getText());

    }

    public void clickAfterFiveSecondsButton () {
        explicitWaitElementVisible(fiveSecondsToVisibleButtonLocator);
        fiveSecondsToVisibleButtonLocator.click();
        System.out.println(fiveSecondsToVisibleButtonLocator.getText());
    }



}
