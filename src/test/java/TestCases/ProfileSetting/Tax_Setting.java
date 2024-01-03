package TestCases.ProfileSetting;

import PageObjects.ProfileSetting.Tax_Setting_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tax_Setting extends BaseClass {
    @Test()
    public void validatingTaxSettingForm() throws InterruptedException {
        AdminLogin();
        Tax_Setting_Obj ts=new Tax_Setting_Obj(driver);
        ts.ClickOnProfileSetting();
        ts.ClickOnTsxSetting();
        ts.ClickOnAddTaxButton();
        ts.setTaxName("CGST");
        ts.setTaxRate("18");
        ts.ClickOnSubmitButton();
        driver.findElement(By.className("btn-close")).click();
    }
}
