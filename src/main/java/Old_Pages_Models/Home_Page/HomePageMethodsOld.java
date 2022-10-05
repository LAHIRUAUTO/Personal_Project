package Old_Pages_Models.Home_Page;

public class HomePageMethodsOld extends HomePageObjectsOld {

    public void getBannerText () {
        explicitWaitElementVisible (bannerLocator);
        System.out.println(bannerLocator.getText());

    }
    public void clickABTestingPageLink () {
        explicitWaitElementClickable(ABTestingPageLocator);
        ABTestingPageLocator.click();
    }

    public void clickaddRemoveElementPageLink () {
        explicitWaitElementClickable(AddRemoveElementPageLocator);
        AddRemoveElementPageLocator.click();
    }

    public void clickbasicLogingPageLink () {
        explicitWaitElementClickable(BasicLoginPageLocator);
        BasicLoginPageLocator.click();
    }

    public void clickCheckboxesPageLink () {
        explicitWaitElementClickable(CheckboxesPageLocator);
        CheckboxesPageLocator.click();
    }

    public void clickCotextMenuPageLink (){
        explicitWaitElementClickable(ContextMenuPageLocator);
        ContextMenuPageLocator.click();
    }

    public void clickDragAndDropPageLink () {
        DragAndDropPageLocator.click();
    }



}
