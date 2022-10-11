package Tools_QA_Page_Model.Home_Page;

public class HomePageMethods extends HomePageObjects {
    public void clickBookStoreApplicationLocator () {
        explicitWaitElementClickable(BookStoreApplicationLocator);
        BookStoreApplicationLocator.click();
    }

    public void clickWidgetsLocator () {
        explicitWaitElementClickable(WidgetsDroDownLocator);
        WidgetsDroDownLocator.click();
    }

    public void clickBSAProfileLocator () {
        explicitWaitElementClickable(BSAProfileLocator);
        BSAProfileLocator.click();
    }

    public void clickBSAProfileRegisterLocator () {
        explicitWaitElementClickable(BSAProfileRegisterLocator);
        BSAProfileRegisterLocator.click();
    }

    public void clickFramewsAndWindowsLocator () {
        explicitWaitElementClickable(FramewsAndWindowsLocator);
        FramewsAndWindowsLocator.click();
    }

    public void clickInteractionsLocator () {
        explicitWaitElementClickable(InteractionsLocator);
        InteractionsLocator.click();
    }
}
