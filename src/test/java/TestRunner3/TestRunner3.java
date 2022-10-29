package TestRunner3;

import Utilities.TestNGDataProvider;
import Utilities.Utils;
import jxl.read.biff.BiffException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner3 extends Utils {

    @Test (dataProvider="SearchProvider",dataProviderClass= TestNGDataProvider.class, invocationCount = 2)
    public void networkTestCase002 (String vehicle, String wheels) {
        System.out.println("Network Test Case 002 Executed");
        System.out.println(vehicle);
        System.out.println(wheels);


    }


}
