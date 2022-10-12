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
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Optional;
import java.util.Properties;

public class Browser_Base {

    public static WebDriver driver;



    @Parameters({"browser", "platform","url"})
    @BeforeTest
    public static void Intialize(String browser, String platform, String url) throws Exception {

        //java -jar selenium-server-4.5.0.jar hub (Start the Hub)
        //java -jar selenium-server-4.5.0.jar node --detect-drivers true (Start the nodes with selected browser)

        DesiredCapabilities desiredcapabilities = new DesiredCapabilities();
        desiredcapabilities.setCapability(CapabilityType.BROWSER_NAME, browser);
        desiredcapabilities.setCapability(CapabilityType.PLATFORM_NAME, platform);
        driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444"), desiredcapabilities);

        driver.get(url);
        driver.manage().window().maximize();


    }





    @AfterTest
    public static void close() {

        //driver.close();
    }
}