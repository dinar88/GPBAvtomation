
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class RegistrationYes extends Base{

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





