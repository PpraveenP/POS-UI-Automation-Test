package TestCases.ProfileSetting;

import PageObjects.ProfileSetting.Payment_Setting_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Payment_Setting extends BaseClass {
    @Test()
    public void validating_Payment_Setting_Form() throws InterruptedException {
        AdminLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Payment_Setting_Obj ps=new Payment_Setting_Obj(driver);
        ps.ClickOnProfileSetting();
        ps.ClickOnPaymentSetting();
        ps.setBankname(fk.name().lastName());
        ps.setBranchName(fk.address().lastName());
        ps.setAccountNumber(fk.number().digits(10));
        ps.setIFSCcode("SYNB8088101");
        ps.setUPIid(fk.name().lastName()+"@ybl");
//        driver.findElement(By.xpath("//button[@class='btn btn-outline-light']")).submit();
        ps.ClickOnAddPaymentDetails();
        Thread.sleep(5000);
    }
}
