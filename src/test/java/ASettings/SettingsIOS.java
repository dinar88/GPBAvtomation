package ASettings;


import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SettingsIOS extends BaseIOS {


    @Test
    @Description("next test")
    //Работает и как указано внизу
    // public void test() throws InterruptedException, IOException {
    public void Step1typePinCode() {
        // WebDriverWait wait = new WebDriverWait(driver, 20);
        // driver.findElementByAccessibilityId("new").Click();
        //  driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/storyCloseIcon")).click();
        Selenide.sleep(1000);
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"9\"]")).click();
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"9\"]")).click();
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"9\"]")).click();
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"9\"]")).click();
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"9\"]")).click();
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"9\"]")).click();

    }


    @Test
    @Description("next test")
    //Работает и как указано внизу
    // public void test() throws InterruptedException, IOException {
    public void Step2Settings() {
        // WebDriverWait wait = new WebDriverWait(driver, 20);
        // driver.findElementByAccessibilityId("new").Click();
        //  driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/storyCloseIcon")).click();
        Selenide.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Settings\"]")).click();
       // driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"KSM\"])[1]")).click();

    }


    @Test
    @Description("next test")
    //Работает и как указано внизу
    // public void test() throws InterruptedException, IOException {
    public void Step3NameOfWallet() {
        // WebDriverWait wait = new WebDriverWait(driver, 20);
        // driver.findElementByAccessibilityId("new").Click();
        //  driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/storyCloseIcon")).click();
        Selenide.sleep(1000);
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]")).click();

    }


    @Test
    @Description("next test")
    //Работает и как указано внизу
    // public void test() throws InterruptedException, IOException {
    public void Step4Dots() {
        // WebDriverWait wait = new WebDriverWait(driver, 20);
        // driver.findElementByAccessibilityId("new").Click();
        //  driver.findElement(By.id("jp.co.soramitsu.fearless.staging:id/storyCloseIcon")).click();
        Selenide.sleep(1000);
        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Statemint\"]")).click();


    }
}