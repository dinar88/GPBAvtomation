package Avtorization;

//Авторизация с корректным паролем

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WithTheCorrectPassword extends Base {

    @Test
    public void Authorization() {

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();

        //Расскрываем по класснейму боковое меню
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.name("Настройки")).click();


    }


    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }
}


