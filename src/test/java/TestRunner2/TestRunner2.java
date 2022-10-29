package TestRunner2;

import Utilities.TestNGDataProvider;
import Utilities.Utils;
import jxl.read.biff.BiffException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.io.IOException;

public class TestRunner2 extends Utils {



    public TestRunner2() throws IOException, BiffException {
    }


    /*@Test (invocationCount = 5)
    public void pmaintenanceTestCase001 () {
        System.out.println("PMaintenance Test Case 001 executed");
    }

    @Test (enabled = false)
    public void maintenanceTestCase001 () {
        System.out.println("Maintenance Test Case 001 executed");
    }

    @Test (dependsOnMethods = {"pmaintenanceTestCase001", "networkTestCase001"})
    public void maintenanceTestCase002 () {
        System.out.println("Maintenance Test Case 002 executed");

    }

    @Test (dependsOnMethods = {"pmaintenanceTestCase001"})
    public void networkTestCase001 () {
        System.out.println("Network Test Case 001 Executed");
    }*/

    @Test (dataProvider="SearchProvider",dataProviderClass= TestNGDataProvider.class, invocationCount = 1)
    public void networkTestCase001 (String username, String password, String name, String goods) {
        System.out.println("Network Test Case 001 Executed");
        System.out.println(username);
        System.out.println(password);
        System.out.println(name);
        System.out.println(goods);
        //throw new SkipException("Test case skipped");

    }

    @Test (dataProvider="SearchProvider",dataProviderClass= TestNGDataProvider.class, invocationCount = 1)
    public void networkTestCase002 (String vehicle, String wheels) {
        System.out.println("Network Test Case 002 Executed");
        System.out.println(vehicle);
        System.out.println(wheels);


    }



    @Test (invocationCount = 1)
    public void networkTestCase003 () {
        System.out.println("Network Test Case 003 Executed");


    }

    @Test (invocationCount = 1)
    public void networkTestCase004 () {
        System.out.println("Network Test Case 004 Executed");


    }

    @Test (invocationCount = 1)
    public void networkTestCase005 () {
        System.out.println("Network Test Case 005 Executed");


    }




}
