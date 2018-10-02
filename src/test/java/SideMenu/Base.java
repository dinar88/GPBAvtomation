package SideMenu;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Base {

    //Object reference of AndroidDriver.
    AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name. ттт9878798787о
        capabilities.setCapability("deviceName", "D6503");

        // Set BROWSER_NAME desired capability. It's Android in our case here.
        capabilities.setCapability("browserName", "Android");

        // Set android VERSION desired capability. Set your mobile device's OS version.
        capabilities.setCapability("platformVersion", "6.0.1");

        // Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");

        // Это смотрим в андроид студио
        capabilities.setCapability("appPackage", "ru.gazprombank.android.mobilebank");

        // это смотрим в приложении appinfo поле Activity
        capabilities.setCapability("appActivity", "ru.gazprombank.android.mobilebank.splash.view.SplashScreenActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

}






