package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.*;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;


public class Listener extends Utils implements ITestListener {
    ExtentTest test;
    static String tester;


    static ExtentReports extent = ExtentReporter.getReportObj (tester);


    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
        String filePath = null;
        try {
            filePath = getScreenshot(result.getMethod().getMethodName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName() );


    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test Faied");
        test.fail(result.getThrowable());
        String filePath = null;
        try {
            filePath = getScreenshot(result.getMethod().getMethodName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName() );

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test Skipped");
        test.skip(result.getThrowable());



    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }

}
