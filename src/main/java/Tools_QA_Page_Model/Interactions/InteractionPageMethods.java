package Tools_QA_Page_Model.Interactions;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;

public class InteractionPageMethods extends InteractionPageObjects{

    public void clicksortableButtonLocator () {
        explicitWaitElementClickable(sortableButtonLocator);
        sortableButtonLocator.click();
    }

    public void clickSortableGridViewButtonLocator () {
        explicitWaitElementClickable(sortableGridViewButtonLocator);
        sortableGridViewButtonLocator.click();
    }

    public void clickDragableGridViewButtonLocator () {
        explicitWaitElementClickable(dragableGridViewButtonLocator);
        dragableGridViewButtonLocator.click();
    }

    public void dragMeMethod () throws AWTException, InterruptedException {
        explicitWaitElementClickable(dragMeButtonLocator);
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.dragAndDropBy(dragMeButtonLocator, 450, 250).perform();
        }

    public void clickDragAndDropGridViewButtonLocator () {
        explicitWaitElementClickable(dropableGridViewButtonLocator);
        dropableGridViewButtonLocator.click();
    }


    public void dragAndDropMeMethod () throws AWTException, InterruptedException {
        explicitWaitElementClickable(draggerButtonLocator);
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.dragAndDrop(draggerButtonLocator, dropperButtonLocator).perform();
    }

}
