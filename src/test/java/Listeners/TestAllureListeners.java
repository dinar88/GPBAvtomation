package Listeners;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestAllureListeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshotOnFailure(WebDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }


    @Attachment(value = "0", type = "text/plain")
    public static String saveLogs(String message){
        return message;
    }
    
}
