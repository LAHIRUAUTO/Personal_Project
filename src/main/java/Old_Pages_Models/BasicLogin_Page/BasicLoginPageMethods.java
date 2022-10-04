package Old_Pages_Models.BasicLogin_Page;

import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.network.Network;
import org.openqa.selenium.devtools.v104.network.model.Headers;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class BasicLoginPageMethods extends BasicLoginPageObjects{

    public void enterUserCredentials () throws AWTException {

        DevTools dev = driver.getDevTools();
        dev.createSession();
        dev.send(Network.enable(Optional.<Integer>empty(), Optional.<Integer>empty(), Optional.<Integer>empty()));
        Map<String, Object> map = new HashMap<>();
        map.put("Authorization", "Basic " + new String(new Base64().encode("admin:admin".getBytes())));
        dev.send(Network.setExtraHTTPHeaders(new Headers(map)));
        driver.navigate().to("https://the-internet.herokuapp.com/basic_auth");
        Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);


        /*Robot  keyRobot = new Robot();


        keyRobot.keyPress(KeyEvent.VK_L);
        keyRobot.keyRelease(KeyEvent.VK_L);
        keyRobot.keyPress(KeyEvent.VK_A);
        keyRobot.keyRelease(KeyEvent.VK_A);



        keyRobot.keyPress(KeyEvent.VK_TAB);
        keyRobot.keyRelease(KeyEvent.VK_TAB);


        keyRobot.keyPress(KeyEvent.VK_1);
        keyRobot.keyRelease(KeyEvent.VK_1);

        keyRobot.keyPress(KeyEvent.VK_S);
        keyRobot.keyRelease(KeyEvent.VK_S);*/




        /*keyRobot.keyPress(KeyEvent.VK_TAB);
        keyRobot.keyRelease(KeyEvent.VK_TAB);

        keyRobot.keyPress(KeyEvent.VK_TAB);
        keyRobot.keyRelease(KeyEvent.VK_TAB);


        keyRobot.keyPress(KeyEvent.VK_ENTER);
        keyRobot.keyRelease(KeyEvent.VK_ENTER);*/

    }

    public void readErrorMessage () {
        System.out.println(erorMessageLocator.getText());
    }
}
