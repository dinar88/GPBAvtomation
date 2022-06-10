package SideMenu;

//Проверка кониакта

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Contacts extends Base {

    @Test
    public void contacts() {

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();

        //Расскрываем по класснейму боковое меню
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.name("Контакты")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        String Str1 = "+7 495 980 41 41";
        //находим логин и запоминаем
        String Str2 = driver.findElement(By.name("+7 495 980 41 41")).getText();

        System.out.println("Фактический текст: " + Str1);
        System.out.println("Должно быть: " + Str2);
        //сравниваем Str1 и Str2
        boolean retVal;
        retVal = Str1.equals(Str2);
        System.out.println("Номер обратной связи есть: " + retVal );


    }

    @AfterTest
    public void End() {
        // Quit
        driver.quit();

    }
}