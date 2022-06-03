package SideMenu;

//Проверка кнопки Предложения банка

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Offers extends Base {
    @Description("Здесь проверяется работоспособность кнопки ПРЕДЛОЖЕНИЯ БАНКА и то," +
            "что есть заглушка")
    @Test
    public void offers() {

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
        System.out.println("Текст корректный? Ответ: " + retVal );
        //если текст совпадает то ответ тру если нет то ответ фолс


    }

    @AfterTest
    public void End() {
        // Quit
        driver.quit();

    }

}
