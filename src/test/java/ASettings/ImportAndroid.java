package ASettings;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ImportAndroid extends BaseAndroid{
    @Test
    public void Step1Import (){

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
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();

        driver.findElement(By.id("android:id/button2")).click();

        Selenide.sleep(3000);



    }

    @Test
    @Description("next test")


    public void Step2ChooseAsset(){
        Selenide.sleep(5000);
        // xpath тут класс в аппиум сканер смотрим потом прописать bounds
        //driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[42,474][1038,684]']")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[@bounds='[228,456][588,517]']")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Settings\"]")).click();
    }



}
