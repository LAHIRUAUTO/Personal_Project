package Tools_QA_Page_Model.Interactions;

public class InteractionPageMethods extends InteractionPageObjects{

    public void clicksortableButtonLocator () {
        explicitWaitElementClickable(sortableButtonLocator);
        sortableButtonLocator.click();
    }

    public void clickSortableGridViewButtonLocator () {
        explicitWaitElementClickable(sortableGridViewButtonLocator);
        sortableGridViewButtonLocator.click();
    }


}
