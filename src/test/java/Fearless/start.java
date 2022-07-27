package Fearless;

import Listeners.TestAllureListeners;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.springframework.core.annotation.Order;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.text.html.Option;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

import java.net.URL;

import static io.qameta.allure.Allure.addAttachment;

public class start {

    WebDriver driver;

    @BeforeTest

    public void Step0Launch() throws MalformedURLException {
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
         //jp.co.soramitsu.fearless.staging:id/action_bar_root
      // capabilities.setCapability("appActivity","root_touch_interceptor");
       // capabilities.setCapability("resource-id","jp.co.soramitsu.fearless.staging:id/dotsProgressView");

        // Created object of RemoteWebDriver will all set capabilities.
        // Set appium server address and port number in URL string.
        // It will launch calculator app in android device.

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    @Attachment
     void Step1Mnemonic() {

        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/storyCloseIcon")).click();
        Selenide.sleep(5000);
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/importAccountBtn")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/inputField")).sendKeys("123");
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/importMnemonicContent")).sendKeys("present brick service spin vivid catalog wrestle life year husband warm certain");
       // driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/nextBtn")).click();



       // Это закрывает алерт  driver.findElement(By.id("android:id/button2")).click();

    }

    @Test
    @Description("re")
    @DisplayName("dd")
    @Attachment

    public void Step3TrueOrFalse() {
        Selenide.sleep(2000);
        // driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/accountView")).click();
        // Это ищет элемент и если находит то isPresent = true если нет то false
        boolean isPresent = driver.findElements(By.id("jp.co.soramitsu.fearless.staging:id/usernameHintTv")).size() > 0;
        // тут Assert ожидает true если false то тест падает
        Assert.assertTrue(isPresent);




//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            // Now you can do whatever you need to do with it, for example copy somewhere
//            FileUtils.copyFile(scrFile, new File("//Users//dinarabdulkaderov//Documents//Скрин//screenshot.png"));






    }


    @Test
    @Attachment
    void Step6Mnemonic() throws Exception{


//это находит и записывает текст в переменную по имени класса и resource-id
        String Str2 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='jp.co.soramitsu.fearless.staging:id/usernameHintTv']")).getText();

String Str1 = "his name will be displayed only for you and stored locally on your mobile device.";

        System.out.println("Фактический текст: " + Str1);
        System.out.println("Должно быть: " + Str2);
        //сравниваем Str1 и Str2
        boolean retVal;
        retVal = Str1.equals(Str2);
        System.out.println("Текст есть: " + retVal );
        Assert.assertTrue(retVal);
        System.out.println(retVal + "вот такой текст");

    }

}

