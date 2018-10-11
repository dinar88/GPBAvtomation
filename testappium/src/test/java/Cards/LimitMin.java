package Cards;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class LimitMin extends Base {
    @Description("Здесь проверяется включение и выключение DSecure - если вкл -> выкл и наоборот")
    @Test
    public void Limit() {

//        try {
        Selenide.sleep(5000);

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();
        Selenide.sleep(3000);

        //Расскрываем по класснейму боковое меню
//        driver.findElement(By.className("android.widget.ImageButton")).click();
        //после 3сек кликаем на крту
        //driver.findElement(By.name("Дебетовая карта")).click();
        driver.findElement(By.name("* 6655")).click();
            Selenide.sleep(5000);
        driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[954,118][1023,193]']")).click();



        //driver.findElement(By.xpath("//android.widget.TextView[@Button='Лимиты']")).click();
        //driver.findElement(By.name("Лимиты")).click();
        //По имени класса находим свитч и записываем его результат в переменную
        String result = driver.findElement(By.xpath("//android.widget.Switch[@index='3']")).getText();
        System.out.println("Свитч был в положении - " + result);
//        //По имени класса находим свитч и кликаем по нему
        driver.findElement(By.xpath("//android.widget.Switch[@index='3']")).click();
        //по класснейму находим элемент и пишем текст
        driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("012345");

    }

    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }
}





