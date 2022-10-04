package Old_Pages_Models.DragAndDrop_Page;

import org.openqa.selenium.interactions.Actions;

public class DragAndDropPageMethods extends DragAndDropPageObjects{
    public void dragAndDrop () {
        explicitWaitElementVisible(dragElelemnt);
        explicitWaitElementVisible(dropElement);
        Actions action1 = new Actions(driver);
        /*Action draganddrop = action1.clickAndHold(dropElement).moveToElement(dragElelemnt).release(dropElement).build();
        draganddrop.perform();*/

        action1.dragAndDrop(dragElelemnt, dropElement).build().perform();
    }
}
