package Old_Pages_Models.ContextMenu_Page;

public class ContextMenuPageMethods extends ContextMenuPageObjects{

    public void clickContextMenu () {
        explicitWaitElementVisible(contextElementLocator);
        rightClick(contextElementLocator);
    }

}
