package ASettings;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class qwer extends BaseAndroid{


    @Test(description = "Screenshot in Step")
    public void screenshotInStepTest() {


    }

    @Step("Step 1")
    public void step1(){
        System.out.println("step 1");
    }
    @Step("Step 2 with screenshot")
    public void step2(){
        System.out.println("step 2");
        screenshot();
    }
    @Step("Step 3")
    public void step3(){
        System.out.println("step 3");
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot( ){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
