
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class RegisterWithTheCorrectPassword extends Base {

    @Test
    public void Balanse() {

        driver.findElementByName("Пароль").sendKeys("Qwer1234)");
        driver.findElement(By.name("Далее")).click();

        //Расскрываем по класснейму боковое меню
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.name("Настройки")).click();


    }


    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }
}





