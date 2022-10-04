package Pages_Models.Home_Page;

import Utilities.Utils;

public class HomePageMethods extends HomePageObjects {

    public void getBannerText () {
        explicitWaitElementVisible (bannerLocator);
        System.out.println(bannerLocator.getText());

    }
}
