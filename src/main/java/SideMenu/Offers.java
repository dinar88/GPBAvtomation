package SideMenu;

//Проверка кнопки Предложения банка

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Offers extends Base{

    @Test
    public void exit() {

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();

        //Расскрываем по класснейму боковое меню
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.name("Предложения банка")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        String Str1 = "Для вас пока нет персональных предложений";
        //находим логин и запоминаем
        String Str2 = driver.findElement(By.name("Для вас пока нет персональных предложений")).getText();

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