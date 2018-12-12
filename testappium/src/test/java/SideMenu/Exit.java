package SideMenu;

//Проверка кнопки Выход

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class Exit extends Base {
    @Description("Здесь проверяется работоспособность кнопки ВЫХОД")
    @Test


    public void exit() {

        //try {

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");

        //driver.findElement (By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']")).sendKeys("Qwer1234)");

        driver.findElement(By.name("Далее")).click();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //Расскрываем по класснейму боковое меню
        driver.findElement(By.className("android.widget.ImageButton")).click();

        driver.findElement(By.name("Выйти")).click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

       // } catch (Exception e) {
        //    logger.error("\n   Тест на проверку обязательных для заполнения полей не пройден\n");
       // }
    }

    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }
}
