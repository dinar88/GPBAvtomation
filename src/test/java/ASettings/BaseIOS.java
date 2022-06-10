package ASettings;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.fail;

public class BaseIOS {

    @SuppressWarnings("rawtypes")
    //IOSDriver driver;
    WebDriver driver;

    @BeforeClass
    public void beforeTest() throws MalformedURLException{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("deviceName", "iPhone (Dinar)");
        caps.setCapability("platformVersion", "15.5");
        caps.setCapability("bundleId", "jp.co.soramitsu.fearless.staging"); //staging
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("xcodeOrgId", "782D6VNV97");
        caps.setCapability("xcodesigningId", "iPhone Developer");
        caps.setCapability("udid", "00008020-0014381C2241402E");

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        //driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub")), caps;
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

}
