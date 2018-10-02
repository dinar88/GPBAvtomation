package Cards;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class On3DSecure extends Base {
    @Description("Здесь проверяется включение и выключение DSecure - если вкл -> выкл и наоборот")
    @Test
    public void DSecure() {

//        try {
        Selenide.sleep(5000);

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();
        Selenide.sleep(3000);

        //Расскрываем по класснейму боковое меню
//        driver.findElement(By.className("android.widget.ImageButton")).click();
        //после 3сек кликаем на крту
        driver.findElement(By.name("Дебетовая карта")).click();
            Selenide.sleep(5000);
        driver.findElement(By.name("Безопасность")).click();
        //По имени класса находим свитч и записываем его результат в переменную
        String result = driver.findElement(By.xpath("//android.widget.Switch[@index='3']")).getText();
        System.out.println("Свитч был в положении - " + result);
//        //По имени класса находим свитч и кликаем по нему
        driver.findElement(By.xpath("//android.widget.Switch[@index='3']")).click();
        //по класснейму находим элемент и пишем текст
        driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("012345)");

String a = "wer";
String b = "qwer";

if (a == "wker"){
    System.out.println("да");

}else {
    System.out.println(b);
}




        }





    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }

}





