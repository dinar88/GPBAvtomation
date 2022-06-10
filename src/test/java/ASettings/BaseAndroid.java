package ASettings;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

import java.net.URL;

public class BaseAndroid {

    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name.
        // -----capabilities.setCapability("deviceName", "D6503");

        // Set BROWSER_NAME desired capability. It's Android in our case here.
        // capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

        // Set android VERSION desired capability. Set your mobile device's OS version.
        //-----capabilities.setCapability(CapabilityType.VERSION, "6.0.1");

        // Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");

        // Set android appPackage desired capability. It is
        // com.android.calculator2 for calculator application.
        // Set your application's appPackage if you are using any other app.
        //  Эту иннфу смотрим в андроид сдк поле package
        capabilities.setCapability("appPackage", "jp.co.soramitsu.fearless.staging");

        // Set android appActivity desired capability. It is
        // com.android.calculator2.Calculator for calculator application.
        // Set your application's appPackage if you are using any other app.
        // эту инфу мы смотрим в приложении на поле Activities
        capabilities.setCapability("appActivity", "jp.co.soramitsu.app.root.presentation.RootActivity");
        // capabilities.setCapability("appActivity","com.journeyapps.barcodescanner.CaptureActivity");
        // capabilities.setCapability("resource-id","jp.co.soramitsu.fearless.staging:id/dotsProgressView");

        // Created object of RemoteWebDriver will all set capabilities.
        // Set appium server address and port number in URL string.
        // It will launch calculator app in android device.
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

}

