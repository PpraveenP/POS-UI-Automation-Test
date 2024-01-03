package TestCases.Sales;

import PageObjects.Sales.NewOrder;
import TestCases.BaseClass;
import TestCases.Logins.AdminLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NewOrderProcess extends BaseClass {

    @Test()
    public void Validating_New_Order_Process() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //both take away and dine in food orders
//        WebDriver ad = AdminLogin();
//        NewOrder no=new NewOrder(driver);
//        no.ClickonSalesButton();
//        no.ClickonSalesDropdownButton();
//        no.ClickonNewOrderButton();
//
//        List<WebElement> list1 = driver.findElements(By.xpath("(//div[@class='col-md-3 p-1'])"));
//       int count= list1.size();
//       int t=10;
//
//        for (int j=0;j<=5;j++)
//        {
//
//            for(int i=0;i<=2;i++)
//            {
//                list1.get(fk.number().randomDigit()).click();
//
//            }
//            if(j%2==0) {
//                no.ClickonOrderTypeDropdown();
//                no.ClickonTakeAwayOption();
//            }
//            else {
//                no.ClickonOrderTypeDropdown();
//                no.ClickOnDine_In_Option();
//                Thread.sleep(2000);
//                WebElement table=driver.findElement(By.xpath("//option[@value='"+t+"']"));
//                table.click();
////                List<WebElement> tableNo = driver.findElements(By.xpath("//option[normalize-space()='Select']"));
////                tableNo.get(tableNo.size()-1).click();
//                t++;
//            }
//
//            no.CliciOnPlaceOrderButton();
//            Thread.sleep(2000);



        //only for take awa food
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriver ad = AdminLogin();
        NewOrder no=new NewOrder(driver);
        no.ClickonSalesButton();
        no.ClickonSalesDropdownButton();
        no.ClickonNewOrderButton();

        List<WebElement> list1 = driver.findElements(By.xpath("(//div[@class='col-md-3 p-1'])"));
        int count= list1.size();
        int t=10;

        for (int j=0;j<=5;j++) {

            for (int i = 0; i <= 2; i++) {
                list1.get(fk.number().randomDigit()).click();

            }

            no.ClickonOrderTypeDropdown();
            no.ClickonTakeAwayOption();
            no.CliciOnPlaceOrderButton();
            Thread.sleep(2000);
        }

//    {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebDriver ad = AdminLogin();
//        NewOrder no = new NewOrder(driver);
//        no.ClickonSalesButton();
//        no.ClickonSalesDropdownButton();
//        no.ClickonNewOrderButton();
//
////        List<WebElement> list1 = driver.findElements(By.xpath("(//div[@class='col-md-3 p-1'])"));
//        List<WebElement> list1 = driver.findElements(By.xpath("(//div[@class='button_div d-flex justify-content-center'])"));
//        int count = list1.size();
//
//        for (int j = 0; j <= 2; j++) {
//
//            for (int i = 0; i <= 1; i++) {
//                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//                List<WebElement> list = driver.findElements(By.xpath("(//div[@class='button_div d-flex justify-content-center'])"));
//                Thread.sleep(5000);
//                list.get(fk.number().randomDigit()).click();
//
//            }
//
//            no.ClickonOrderTypeDropdown();
//
//            no.ClickonTakeAwayOption();
//
//            no.CliciOnPlaceOrderButton();
//            Thread.sleep(5000);
//
//        }
    }
}
