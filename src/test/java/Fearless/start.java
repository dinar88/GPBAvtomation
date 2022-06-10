package Fearless;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.AfterTest;
import org.springframework.core.annotation.Order;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.text.html.Option;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

//import static com.codeborne.selenide.Selenide.open;
//import static com.codeborne.selenide.Selenide.$;

import java.net.URL;

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
     void Step1Mnemonic() {
        // Click on DELETE/CLR button to clear result text box before running test.
       // driver.findElements(By.xpath("//android.widget.Button")).get(5).click();//этоИщетПоИндексуКнопкуПропишет6
        // Click on number 2 button.
       // driver.findElement(By.name("Accounts upgraded to Wallets")).click();  //это ищет по названию кнопки


        // Click on + button.
//        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/storyCloseIcon")).click();
//        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/createAccountBtn")).click();
//        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/inputField")).sendKeys("123");
//        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/nextBtn")).click();
//        driver.findElement(By.id("android:id/button1")).click();
//        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/nextBtn")).click();
//        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/confirmMnemonicSkip")).click();


        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/storyCloseIcon")).click();
        Selenide.sleep(5000);
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/importAccountBtn")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/inputField")).sendKeys("123");
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/importMnemonicContent")).sendKeys("present brick service spin vivid catalog wrestle life year husband warm certain");
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/nextBtn")).click();


        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();

        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        Selenide.sleep(5000);
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();


        driver.findElement(By.id("android:id/button2")).click();


        // Click on number 5 button.
       // --driver.findElement(By.name("5")).click();

        // Click on = button.
        //--driver.findElement(By.name("=")).click();

        // Get result from result text box.
        // String result = driver.findElement(By.className("android.widget.TextView")) .getText();
       // String result =
             //   driver.findElement (By.xpath("//android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='1']")).getText();
        //driver.findElement (By.xpath("//android.widget.RelativeLayout/android.widget.TextView")).getText();можно без индекса так как классы уникальны
        //можно и без индексов

       // System.out.println("Number sum result is : " + result);

    }

   // @AfterTest
   // public void End() {
       // driver.quit();
   // }

    @Test
    @Description("next testtttt")

     void Step2ChooseSettings(){
        Selenide.sleep(2000);
       // driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/assetsManageAction")).click();
        // xpath тут класс в аппиум сканер смотрим потом пропишем bounds
        //driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[42,474][1038,684]']")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Settings\"]")).click();
    }



}
