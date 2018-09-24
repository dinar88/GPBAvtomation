package SideMenu;

//Проверка видимости логина

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeeLogin extends Base{

    @Test
    public void see() {

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();

        //Расскрываем по класснейму боковое меню
        driver.findElement(By.className("android.widget.ImageButton")).click();

        String Str1 = "+7 (926) 000 00 05";
        //находим логин и запоминаем
        String Str2 = driver.findElement(By.name("+7 (926) 000 00 05")).getText();

        System.out.println("Фактический текст: " + Str1);
        System.out.println("Должно быть: " + Str2);
        //сравниваем Str1 и Str2
        boolean retVal;
        retVal = Str1.equals(Str2);
        System.out.println("Логин корректный? Ответ: " + retVal );

    }

    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }

}
