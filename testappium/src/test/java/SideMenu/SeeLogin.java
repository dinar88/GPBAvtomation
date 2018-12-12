package SideMenu;

//Проверка видимости логина

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class SeeLogin extends Base {
    @Description("Здесь проверяется отображается ли логин на боковом меню")
    @Test
    public void see() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //
        Selenide.sleep(2000);
        driver.findElementByName("Пароль").sendKeys("Qwer1234)");

        driver.findElement(By.name("Далее")).click();

        //Расскрываем по класснейму боковое меню
        driver.findElement(By.className("android.widget.ImageButton")).click();

        String Str1 = "+7 (926) 000 00 35";
        //находим логин и запоминаем
        String Str2 = driver.findElement(By.name("+7 (926) 000 00 35")).getText();

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
