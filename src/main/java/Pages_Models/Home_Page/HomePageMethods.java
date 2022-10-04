package Pages_Models.Home_Page;

import Utilities.Utils;

public class HomePageMethods extends HomePageObjects {

    public void getBannerText () {
        explicitWaitElementVisible (bannerLocator);
        System.out.println(bannerLocator.getText());

    }
    public void clickABTestingPageLink () {
        explicitWaitElementClickable(ABTestingPageLocator);
        ABTestingPageLocator.click();
    }

    public void addRemoveElementPageLink () {
        explicitWaitElementClickable(AddRemoveElementPageLocator);
        AddRemoveElementPageLocator.click();
    }

    public void basicLogingPageLink () {
        explicitWaitElementClickable(BasicLoginPageLocator);
        BasicLoginPageLocator.click();
    }
}
