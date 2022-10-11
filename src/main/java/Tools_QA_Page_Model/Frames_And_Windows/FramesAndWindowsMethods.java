package Tools_QA_Page_Model.Frames_And_Windows;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class FramesAndWindowsMethods extends FramesAndWindowsPageObjects{

    public void clickOnbrowserWindowList1Locator () {
        explicitWaitElementClickable(browserWindowList1Locator);
        browserWindowList1Locator.click();
    }

    public void clicknewTabButtonLocator () {
        explicitWaitElementClickable(newTabButtonLocator);

        newTabButtonLocator.click();
        System.out.println(driver.getWindowHandles().size());
        System.out.println(driver.getCurrentUrl());

        Set<String> windows = driver.getWindowHandles();
        Iterator <String> windowiDs = windows.iterator();
        String parantWindowID = windowiDs.next();
        String childWindowID = windowiDs.next();
        driver.switchTo().window(childWindowID);

        String childWindowText =  childWindowTextLocator.getText();
        driver.switchTo().window(parantWindowID);
        System.out.println(childWindowText);


        }

    public void clicknewWindowButtonLocator () {
        explicitWaitElementClickable(newWindowButtonLocator);
        newWindowButtonLocator.click();
        System.out.println(driver.getWindowHandles().size());
        System.out.println(driver.getCurrentUrl());

        String mainWindow = driver.getWindowHandle();
        Set<String> childWindows = driver.getWindowHandles();
        Iterator <String> windowiDs = childWindows.iterator();
        System.out.println("Main window handle is " + mainWindow);
        System.out.println("Child window handle is " + childWindows);



        while (windowiDs.hasNext()) {
            String ChildWindow = windowiDs.next();
            if (!mainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                System.out.println("Heading of child window is " + childMessageWindowTextLocator.getText());
            }
        }

        String childWindowText =  childMessageWindowTextLocator.getText();
        System.out.println(childWindowText);
        driver.switchTo().window(mainWindow);

    }

    public void clickNewMessageWindowButtonLocator () {
        explicitWaitElementClickable(newMessageWindowButtonLocator);
        newMessageWindowButtonLocator.click();
        System.out.println(driver.getWindowHandles().size());
        System.out.println(driver.getCurrentUrl());

        String mainWindow = driver.getWindowHandle();
        Set<String> childWindows = driver.getWindowHandles();
        Iterator <String> windowiDs = childWindows.iterator();
        System.out.println("Main window handle is " + mainWindow);
        System.out.println("Child window handle is " + childWindows);

        String parantWindowID = windowiDs.next();
        String childWindowID = windowiDs.next();

        driver.switchTo().window(childWindowID);



        /*while (windowiDs.hasNext()) {
            String ChildWindow = windowiDs.next();
            if (!mainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                System.out.println("Heading of child window is " + childMessageWindowTextLocator.getText());
            }
        }*/

        WebElement childWindowTextArea = driver.findElement(By.xpath("/html[1]/body[1]\n"));
        String childWindowText =  childWindowTextArea.getText();
        System.out.println(childWindowText);
        driver.switchTo().window(mainWindow);

    }

    public void clickOnAlertList1Locator ()  {
        explicitWaitElementClickable(alertList1Locator);
        alertList1Locator.click();

    }

    public void clickalertButtonLocator1 ()  {
        explicitWaitElementClickable(alertButtonLocator1);
        alertButtonLocator1.click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();
    }

    public void clickalertButtonLocator2 ()  {
        explicitWaitElementClickable(alertButtonLocator2);
        alertButtonLocator2.click();
        explicitWaitAlertPresent();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.accept();


    }

    public void clickalertButtonLocator3 ()  {
        explicitWaitElementClickable(alertButtonLocator3);
        alertButtonLocator3.click();
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.accept();


    }

    public void clickalertButtonLocator4 ()  {
        explicitWaitElementClickable(alertButtonLocator4);
        alertButtonLocator4.click();
        Alert alert4 = driver.switchTo().alert();
        System.out.println(alert4.getText());
        alert4.sendKeys("Lahiru");
        alert4.dismiss();


    }

    public void clickOnFrameList1Locator ()  {
        explicitWaitElementClickable(framesList1Locator);
        framesList1Locator.click();

    }


    public void getFrame1Text ()  {
        System.out.println(textInFrame1Locator.getText());

    }

    public void swithcToDefaultContent ()  {
        driver.switchTo().defaultContent();
    }


    public void getFrame2Text ()  {
        System.out.println(textInFrame2Locator.getText());

    }

    public void clickOnNestedFrameList1Locator ()  {
        explicitWaitElementClickable(nestedFramesList1Locator);
        nestedFramesList1Locator.click();

    }


    public void getPerantFrameText ()  {
        System.out.println(textInPerantFrame.getText());

    }

    public void getChildFrameText ()  {
        System.out.println(textInChildFrame.getText());

    }

    public void clickModalDialogsList1Locator ()  {
        explicitWaitElementClickable(modalDialogsList1Locator);
        modalDialogsList1Locator.click();

    }

    public void clickSmallModalDialogButtonLocator ()  {
        explicitWaitElementClickable(smallModalDialogButtonLocator);
        smallModalDialogButtonLocator.click();

    }

    public void getSmallModalDialogContent ()  {
        explicitWaitElementClickable(smallModalDialogContentLocator);
        System.out.println(smallModalDialogContentLocator.getText());

    }

    public void clickSmallModalDialogCloseButtonLocator ()  {
        explicitWaitElementClickable(smallModalDialogCloseButtonLocator);
        smallModalDialogCloseButtonLocator.click();

    }






    }



