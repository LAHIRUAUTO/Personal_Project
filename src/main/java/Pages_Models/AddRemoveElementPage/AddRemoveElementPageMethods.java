package Pages_Models.AddRemoveElementPage;

public class AddRemoveElementPageMethods extends AddRemoveElementPageObjects{

    public void addRemoveElementPageLink () {
        explicitWaitElementClickable(AddElementLocator);
        AddElementLocator.click();
        AddElementLocator.click();
        AddElementLocator.click();
        fluentWaitElementVisible(DeleteElementLocator);
        DeleteElementLocator.click();

    }

    public void goBackFromAddRemoveElementPage () {
        driver.navigate().back();

    }
}
