
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class TelekardBalanseTest {

    //Object reference of AndroidDriver.
    AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name.
        capabilities.setCapability("deviceName", "D6503");

        // Set BROWSER_NAME desired capability. It's Android in our case here.
        capabilities.setCapability("browserName", "Android");

        // Set android VERSION desired capability. Set your mobile device's OS version.
        capabilities.setCapability("platformVersion", "6.0.1");

        // Set android platformName desired capability. It's Android in our case here.
        capabilities.setCapability("platformName", "Android");

        // Это смотрим в андроид студио
        capabilities.setCapability("appPackage", "ru.gazprombank.android.mobilebank");

        // это смотрим в приложении appinfo поле Activity
        capabilities.setCapability("appActivity", "ru.gazprombank.android.mobilebank.splash.view.SplashScreenActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

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





