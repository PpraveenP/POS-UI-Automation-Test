package TestCases.Reports;

import PageObjects.Reports.Payment_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Payment extends BaseClass {
    @Test()
    public void validating_Payment_Form() throws InterruptedException {
        AdminLogin();
        Payment_Obj po=new Payment_Obj(driver);
        po.ClickOnReportsButton();
        po.ClickOnPaymentButton();
//        List<WebElement> list = driver.findElements(By.xpath("(//i[contains(@class,'fa fa-credit-card')])"));
//        int i=0;
//        for (WebElement li:list)
//        {
//            List<WebElement> list1 = driver.findElements(By.xpath("(//i[contains(@class,'fa fa-credit-card')])"));
//            list1.get(i).click();
//            i++;
//            WebElement cash = driver.findElement(By.xpath("//option[@value='cash']"));
//            Thread.sleep(5000);
//            cash.click();
//            Thread.sleep(5000);
//            po.ClickOnSubmitButton();
//            Thread.sleep(5000);
//            driver.navigate().back();
//        }

        List<WebElement> list = driver.findElements(By.xpath("(//i[contains(@class,'fa fa-credit-card')])"));
        int i=1;
        for (WebElement li:list)
        {
            Thread.sleep(5000);
            List<WebElement> list1 = driver.findElements(By.xpath("(//i[contains(@class,'fa fa-credit-card')])[" + i + "]"));
            Thread.sleep(5000);
            list1.get(0).click();
            WebElement cash = driver.findElement(By.xpath("//option[@value='cash']"));
            Thread.sleep(5000);
            cash.click();
            Thread.sleep(5000);
            po.ClickOnSubmitButton();
            Thread.sleep(5000);
            driver.navigate().back();
            i++;
        }



    }
}
