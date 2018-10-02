package Avtorization;

//Авторизация с кривым паролем

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

//НУЖНО ДОРАБОТАТЬ КЕЙС

public class WithTheWrongPassword extends Base {

    @Test
    public void Authorization() {

        driver.findElementByName("Пароль").sendKeys("Qwer0000))");
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


