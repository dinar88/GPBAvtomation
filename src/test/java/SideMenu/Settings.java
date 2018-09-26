package SideMenu;

//Проверка кнопки Настройка

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Settings extends Base {

    @Test
    public void Balanse() {

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();

        //Расскрываем по класснейму боковое меню
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.name("Настройки")).click();
        driver.findElement(By.name("Безопасность")).click();
        //По имени класса находим свитч и записываем его результат в переменную
        String result = driver.findElement(By.xpath("//android.widget.Switch[@index='1']")).getText();
        System.out.println("Свитч был в положении " + result);
        //По имени класса находим свитч и кликаем по нему
        driver.findElement(By.xpath("//android.widget.Switch[@index='1']")).click();
        // driver.findElement(By.name("ВКЛ.")).click(); Можно найти свитч по имени
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.name("Мои карты и счета")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }


    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }

}
