package Utilities;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.Factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestNGDataProvider extends Utils {
    String FilePath = "/home/user/Desktop/Udemy/Personal_Project/Test Data/Personal_Project_test_data.xls";
    FileInputStream fs = new FileInputStream(FilePath);
    Workbook wb = Workbook.getWorkbook(fs);
    Sheet DataFeed  = wb.getSheet("DataFeed");
    Sheet DataFeed2  = wb.getSheet("DataFeed2");

    public TestNGDataProvider() throws IOException, BiffException {


    }


    @org.testng.annotations.DataProvider (name="SearchProvider")
    public Object[][] getDataFromDataprovider (Method methodName) throws Exception {

        if (methodName.getName().equalsIgnoreCase("networkTestCase001")) {

            return new Object[][] {
                    {DataFeed.getCell("A1").getContents(),DataFeed.getCell("B1").getContents(),DataFeed.getCell("C1").getContents(),DataFeed.getCell("D1").getContents()   },
                    {DataFeed.getCell("A2").getContents(),DataFeed.getCell("B2").getContents(),DataFeed.getCell("C2").getContents(),DataFeed.getCell("D2").getContents()   },
                    {DataFeed.getCell("A3").getContents(),DataFeed.getCell("B3").getContents(),DataFeed.getCell("C3").getContents(),DataFeed.getCell("D3").getContents()   },
                    {DataFeed.getCell("A4").getContents(),DataFeed.getCell("B4").getContents(),DataFeed.getCell("C4").getContents(),DataFeed.getCell("D4").getContents()   }
            };

        } else if (methodName.getName().equalsIgnoreCase("networkTestCase002")) {
            return new Object[][] {
                    {DataFeed2.getCell("A1").getContents(),DataFeed2.getCell("B1").getContents()},
                    {DataFeed2.getCell("A2").getContents(),DataFeed2.getCell("B2").getContents()},
                    {DataFeed2.getCell("A3").getContents(),DataFeed2.getCell("B3").getContents()},
            };
        } else if (methodName.getName().equalsIgnoreCase("goToElementsWindow_FileUpload")) {
            return new Object[][] {
                    {DataFeed2.getCell("A5").getContents()}

            };
        } else {
            throw new Exception("Incorrect Method name identified");
        }



    }





}
