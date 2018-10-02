
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class RegistrationYes extends Base {

    @Test
    public void registration() {

        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.name("Регистрация")).click();
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.name("Нет")).click();
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElement(By.name("Да")).click();

    }

    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }
}





