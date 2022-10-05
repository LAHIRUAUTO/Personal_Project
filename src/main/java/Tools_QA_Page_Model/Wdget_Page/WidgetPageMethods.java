package Tools_QA_Page_Model.Wdget_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WidgetPageMethods extends WidgetPageObjects{

    public void clickDatePickerButton () {
        explicitWaitElementClickable(datePickerButton);
        datePickerButton.click();
    }

    public void clickDatePicker () {
        explicitWaitElementClickable(datepicker);
        datepicker.click();
    }

    public void selectMonthInCalanderDropDown (String monthName) {
        explicitWaitElementClickable(monthDropDownInCalander);
        monthDropDownInCalander.click();
        Select month = new Select(monthDropDownInCalander);
        month.selectByVisibleText(monthName);
    }

    public void selectYearInCalanderDropDown (String years) {
        explicitWaitElementClickable(yearDropDownInCalander);
        yearDropDownInCalander.click();
        Select year = new Select(yearDropDownInCalander);
        year.selectByVisibleText(years);
        yearDropDownInCalander.click();
    }



    public void selectDepartureDateFrom(int departureDate) {
        if (departureDate >= 26) {
            for (int j = 2; j <= 7; j++) {

                for (int i = 1; i <= 7; i++) {

                    WebElement dateInCalanderxpath = elementByXpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[" + j + "]/div[" + i + "]\n");
                    System.out.println(dateInCalanderxpath.getText());
                    String returnText = dateInCalanderxpath.getText();
                    if (Integer.parseInt(returnText) == departureDate) {
                        dateInCalanderxpath.click();
                        break;
                    } else {
                        continue;
                    }

                }
            }
        }
        else {
            for (int j = 1; j <= 7; j++) {

                for (int i = 1; i <= 7; i++) {

                    WebElement dateInCalanderxpath = elementByXpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[" + j + "]/div[" + i + "]\n");
                    System.out.println(dateInCalanderxpath.getText());
                    String returnText = dateInCalanderxpath.getText();
                    if (Integer.parseInt(returnText) == departureDate) {
                        dateInCalanderxpath.click();
                        break;
                    } else {
                        continue;
                    }

                }
            }
        }
    }

    public void clickDatePicker2 () {
        explicitWaitElementClickable(datepicker2);
        datepicker2.click();
    }

    public void clickMonthDropDownInCalanser2 () {
        explicitWaitElementClickable(monthDropDownInCalander2);
        monthDropDownInCalander2.click();
    }

    public void selectMonthInCalanderDropDown2 (String monthName) {
        List<WebElement> monthDropDownInCalander3 = driver.findElements(By.className("react-datepicker__month-option"));
        //System.out.println(monthDropDownInCalander3.size());
        for (int i = 0; i<= monthDropDownInCalander3.size(); i++){
            String month = monthDropDownInCalander3.get(i).getText();
            if (month.equalsIgnoreCase(monthName)){
                monthDropDownInCalander3.get(i).click();
                break;
            }
        }

    }

    public void clickYearDropDownInCalanser2 () {
        explicitWaitElementClickable(yearDropDownInCalander2);
        yearDropDownInCalander2.click();
    }

    public void selectYearInCalanderDropDown2 (String years) {
        List<WebElement> yearDropDownInCalander2 = driver.findElements(By.className("react-datepicker__year-option"));
        for (int i = 0; i<= yearDropDownInCalander2.size(); i++){
            String month = yearDropDownInCalander2.get(i).getText();
            if (month.equalsIgnoreCase(years)){
                yearDropDownInCalander2.get(i).click();
                break;
            }
        }
    }

    public void selectDepartureDateFrom2(int departureDate) {
        if (departureDate >= 26) {
            for (int j = 2; j <= 7; j++) {

                for (int i = 1; i <= 7; i++) {

                    WebElement dateInCalanderxpath = elementByXpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[" + j + "]/div[" + i + "]\n");
                    System.out.println(dateInCalanderxpath.getText());
                    String returnText = dateInCalanderxpath.getText();
                    if (Integer.parseInt(returnText) == departureDate) {
                        dateInCalanderxpath.click();
                        break;
                    } else {
                        continue;
                    }

                }
            }
        }
        else {
            for (int j = 1; j <= 7; j++) {

                for (int i = 1; i <= 7; i++) {

                    WebElement dateInCalanderxpath = elementByXpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[" + j + "]/div[" + i + "]\n");
                    System.out.println(dateInCalanderxpath.getText());
                    String returnText = dateInCalanderxpath.getText();
                    if (Integer.parseInt(returnText) == departureDate) {
                        dateInCalanderxpath.click();
                        break;
                    } else {
                        continue;
                    }

                }
            }
        }
    }










}
