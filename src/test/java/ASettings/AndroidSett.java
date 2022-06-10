package ASettings;


import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AndroidSett extends BaseAndroid {
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
        //driver.findElement(By.id("android:id/button2")).click();

        Selenide.sleep(3000);


    }

    @Test
    @Description("This test checks the functionality of the Settings button")

    public void Step2ChooseSettings() {
        Selenide.sleep(5000);
        // xpath тут класс в аппиум сканер смотрим потом прописать bounds
        //driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[42,474][1038,684]']")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[@bounds='[228,456][588,517]']")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Settings\"]")).click();
    }

    @Test
    @Description("This test checks the transition to the details of the wallet by clicking on the name of the wallet")


    public void Step3NameOfWallet() {
        Selenide.sleep(2000);
        // xpath тут класс в аппиум сканер смотрим потом прописать bounds
        //driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[42,474][1038,684]']")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[@bounds='[228,456][588,517]']")).click();
        //driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Settings\"]")).click();
        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/accountView")).click();


    }


    @Test
    @Description("This test checks the tap on three dots")

    public void Step5ThreeDots() {
        Selenide.sleep(2000);

        // тут элемент находится классу и по тексту элемента
        driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[948,542][1058,652]']")).click();
    }


    @Test
    @Description("This test verifies address copying")

    public void Step6CopyAddress() {
        Selenide.sleep(2000);

        // тут элемент находится классу и по тексту элемента
        driver.findElement(By.xpath("//android.widget.TextView[@text='Copy address']")).click();

    }


    @Test
    @Description("This test checks the tap on three dots")

    public void Step7ThreeDots() {
        Selenide.sleep(2000);


        driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[948,542][1058,65]']")).click();
    }

    @Test
    @Description("Close the screen")

    public void Step8GoBack() {
        Selenide.sleep(2000);


        driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/fixedListSheetItemContainer")).click();
    }

}