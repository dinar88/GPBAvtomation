package ASettings;


import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AndroidSettPin extends BaseAndroid {
    @Test
    @Description("This test checks the wallet import")

    public void Step1Import() {

        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/storyCloseIcon")).click();
        Selenide.sleep(5000);
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/importAccountBtn")).click();
        Selenide.sleep(2000);
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/inputField")).sendKeys("123");
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/importMnemonicContent")).sendKeys("present brick service spin vivid catalog wrestle life year husband warm certain");
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/nextBtn")).click();

        Selenide.sleep(3000);
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();

        Selenide.sleep(3000);

        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();

        // only for real device
        driver.findElement(By.id("android:id/button2")).click();

        Selenide.sleep(3000);

        //Go to Settings
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Settings\"]")).click();


    }


    @Test
    @Description("This test checks properly working of Language button")

    public void Step2ChangePinCodeButton() {
        Selenide.sleep(2000);
        // xpath тут класс в аппиум сканер смотрим потом прописать bounds
        //driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[42,474][1038,684]']")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[@bounds='[228,456][588,517]']")).click();
        //driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Settings\"]")).click();
        //driver.findElement(By.id("jp.co.soramitsu.fearless:id/profileWallets")).click();

        // тут элемент находится классу и по тексту элемента
        driver.findElement(By.xpath("//android.widget.TextView[@text='Change pin code']")).click();


    }


    @Test
    @Description("This test checks Language changing")

    public void Step3EnterCurrentPinCode() {

        Selenide.sleep(2000);

        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn9")).click();

    }


    @Test
    @Description("This test checks Creating new Pin Code")

    public void Step4CreateNewPinCode() {

        Selenide.sleep(2000);

        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();

        Selenide.sleep(2000);

        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/btn8")).click();

    }


}