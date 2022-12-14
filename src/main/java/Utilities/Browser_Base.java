package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.emulation.Emulation;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Optional;
import java.util.Properties;

public class Browser_Base {
    public static WebDriver driver;


    @Parameters({"browser", "url"})
    @BeforeSuite
    public static void Intialize(String browser, String url) throws Exception {

        // End loading app proerty file

        switch (browser) {
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                //System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"/Drivers/chromedriver_linux64/chromedriver"));
                //create chrome instance
                //driver = new ChromeDriver();
                break;
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge" :
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "chromeheadless" :
                WebDriverManager.chromedriver().setup();
                ChromeOptions option = new ChromeOptions();
                option.setHeadless(true);
                driver = new ChromeDriver(option);

            case "CDTchrome" :
                //WebDriverManager.chromedriver().setup();
                //driver = new ChromeDriver();
                //System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"/Drivers/chromedriver_linux64/chromedriver"));
                //driver = new ChromeDriver();
                //DevTools devTools = driver.getDevTools();
                //devTools.createSession();
                //send command to CDP Methods-> CDP Methods will invoke and get access to chrome dev tools
                //devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), Optional.empty()));

                break;

            default:
                throw new Exception("Browser is not correct");



        }
        driver.get(url);
        //driver.navigate().to(url);
        driver.manage().window().maximize();


    }

    @AfterTest
    public static void close() {

        //driver.close();
    }
}
