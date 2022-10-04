package Old_Pages_Models.ABTesting_Page;

public class ABTestingPageMethods extends ABTestingPageObjects{


    public void getTextOfABTestingDes () {
        explicitWaitElementClickable(ABTestingDesLocator);
        System.out.println(ABTestingDesLocator.getText());

    }

    public void goBackFromABTestingPage () {
        driver.navigate().back();

    }
}
