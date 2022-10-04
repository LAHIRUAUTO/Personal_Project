package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Browser_Base {
    public static WebDriver driver;

    @Parameters({"browser", "url"})
    @BeforeTest
    public static void Intialize(String browser, String url) throws Exception {

        //Load Property File
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/App.properties");
        Properties obj = new Properties();
        obj.load(objfile);

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

            default:
                throw new Exception("Browser is not correct");



        }
        driver.get(url);
        driver.manage().window().maximize();


    }

    @AfterTest
    public static void close() {

        driver.close();
    }
}
