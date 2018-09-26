package SideMenu;

//Проверка кнопки Выход

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Exit extends Base {

    @Test
    public void exit() {

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Расскрываем по класснейму боковое меню
        driver.findElement(By.className("android.widget.ImageButton")).click();

        driver.findElement(By.name("Выйти")).click();


        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


    }

    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }
}
