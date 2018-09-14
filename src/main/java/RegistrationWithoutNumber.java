
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class RegistrationWithoutNumber {

    //Object reference of AndroidDriver.
    AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name. ттт9878798787о
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
    public void withoutNumber() {

        //Расскрываем по класснейму боковое меню
        //driver.findElement(By.className("android.widget.Button")).click();
        driver.findElement(By.name("Регистрация")).click();
        driver.findElement(By.name("Да, войти")).click();
        driver.findElement(By.name("Забыли пароль?")).click();
        String Str1 = driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).getText();
        String Str2 = "Введите зарегистрированный номер телефона и нажмите «Забыли пароль?» еще раз";
        System.out.println(Str1);
        System.out.println(Str2);
        boolean retVal;
        retVal = Str1.equals(Str2);
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal );

        driver.findElement(By.name("ОК")).click();

    }
    
    @AfterTest
    public void End() {
        // Quit
        driver.quit();
    }
}





