package Cards;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BlockUnBlocCardForPeriod extends Base {
    @Description("Здесь проверяется блокировка и разблокировка карты на период")
    @Test
    public void BlockUnBlocForPeriod() {

        Selenide.sleep(5000);
        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();
        Selenide.sleep(3000);

// выбираем карту по имени
      //  driver.findElement(By.name("Дебетовая карта")).click();
        driver.findElement(By.name("* 6655")).click();
            Selenide.sleep(5000);
            // переходим на безопасность
        driver.findElement(By.name("Безопасность")).click();

       // записываем по всей иерархии значение текста в переменную
         String result =
                driver.findElement
                        (By.xpath("//android.widget.FrameLayout[@index='1']/android.widget.ScrollView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='1']")).getText();

     // выводим это значение
        System.out.println("Свитч был в положении - " + result);

        // сохраняем в переменную второй вариант как можетбыть
        String zt = "Заблокировать";
        //сравниваем две переменные и переводим это в значение булин
        boolean retVal;
        retVal = result.equals(zt);

        System.out.println("положение" + retVal);

     //в зависимости от значения отрабатывает та или иная функция, заблокировать это true
        if (retVal == true){
    driver.findElement(By.name("Заблокировать")).click();
    driver.findElement(By.xpath("//android.widget.Switch[@index='1']")).click();
    driver.findElement(By.name("На период")).click();
            Selenide.sleep(2000);
    driver.findElement(By.name("Выберите период")).click();
            driver.findElement(By.xpath("//android.view.View[@index='27']")).click();
            driver.findElement(By.name("ОК")).click();
            driver.findElement(By.name("ОК")).click();
            driver.findElement(By.name("Сохранить")).click();

} else {
            driver.findElement(By.name("Разблокировать")).click();
            driver.findElement(By.xpath("//android.widget.Switch[@index='1']")).click();
            driver.findElement(By.name("На период")).click();
            driver.findElement(By.name("Выберите период")).click();
            driver.findElement(By.xpath("//android.view.View[@index='26']")).click();
            driver.findElement(By.name("ОК")).click();
            driver.findElement(By.name("ОК")).click();
            driver.findElement(By.name("Сохранить")).click();
            driver.findElement(By.xpath("//android.widget.EditText[@index='1']")).sendKeys("Qwer1234)");
            driver.findElement(By.name("Подтвердить")).click();
        }
    }

    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }
}
