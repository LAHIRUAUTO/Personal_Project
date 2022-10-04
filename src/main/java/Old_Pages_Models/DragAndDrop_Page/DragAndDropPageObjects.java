package Old_Pages_Models.DragAndDrop_Page;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPageObjects extends Utils {

    @FindBy(xpath = "//*[@id=\"draggable\"]\n")
    @CacheLookup
    WebElement dragElelemnt;

    @FindBy(xpath = "//*[@id=\"droppable\"]\n")
    @CacheLookup
    WebElement dropElement;
}
