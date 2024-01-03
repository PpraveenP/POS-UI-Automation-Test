package TestCases.Sales;

import PageObjects.Sales.Order_List_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Order_List extends BaseClass {
    @Test()
    public void validating_Order_List() throws InterruptedException, AWTException {

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        AdminLogin();
//        Order_List_Obj ol=new Order_List_Obj(driver);
//        ol.ClickOnSalesDropdown();
//        ol.ClickOnOrderListButton();
//
//        List<WebElement> list = driver.findElements(By.xpath("(//a[@title='Print Bill'])"));
//        int count=list.size();
//        System.out.println(count);
//        for (WebElement li1:list)
//        {
//            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//            WebElement li = driver.findElement(By.xpath("(//a[@title='Print Bill'])"));
//            Thread.sleep(5000);
//            System.out.println(li.getText());
//            li.click();
//            Thread.sleep(5000);
//            ol.ClickonSelectPaymentMode();
//            Thread.sleep(5000);
//            ol.ClickOnCashOption();
//            ol.setContactNyumber(fk.number().digits(10));
////            Thread.sleep(5000);
//            Robot r=new Robot();
//            r.keyPress(KeyEvent.VK_TAB);
//            r.keyRelease(KeyEvent.VK_TAB);
//            Thread.sleep(2000);
//            r.keyPress(KeyEvent.VK_ENTER);
//            r.keyRelease(KeyEvent.VK_ENTER);
//            Thread.sleep(2000);
//
//            r.keyPress(KeyEvent.VK_TAB);
//            r.keyRelease(KeyEvent.VK_TAB);
//            Thread.sleep(1000);
//            r.keyPress(KeyEvent.VK_ENTER);
//            r.keyRelease(KeyEvent.VK_ENTER);
//            Thread.sleep(5000);
//            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////            driver.navigate().refresh();
//            WebElement elements = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//            elements.click();
//            Thread.sleep(5000);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AdminLogin();
        Order_List_Obj ol=new Order_List_Obj(driver);
        ol.ClickOnSalesDropdown();
        ol.ClickOnOrderListButton();

        int i=1;
        List<WebElement> list = driver.findElements(By.xpath("(//a[@title='Print Bill'])"));
        int count=list.size();
        System.out.println(list);
        System.out.println(count);
        for (WebElement li1:list)
        {
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            List<WebElement> li = driver.findElements(By.xpath("(//a[@title='Print Bill'])[" + i + "]"));
            Thread.sleep(5000);
            li.get(0).click();

            Thread.sleep(5000);
            ol.ClickonSelectPaymentMode();
            Thread.sleep(5000);
            ol.ClickOnCashOption();
            ol.setContactNyumber(fk.number().digits(10));
//            Thread.sleep(5000);
            Robot r=new Robot();
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(2000);

            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(5000);
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//            driver.navigate().refresh();
            WebElement elements = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
            elements.click();
            Thread.sleep(5000);



//        WebElement list = driver.findElement(By.xpath("(//a[@title='Print Bill'])"));
//        Select s=new Select(list);
//        List<WebElement> all = s.getOptions();
//        for (WebElement l:all)
//        {
//            l.click();
//            Thread.sleep(5000);
//            ol.ClickonSelectPaymentMode();
//            Thread.sleep(5000);
//            ol.ClickOnCashOption();
//            ol.setContactNyumber(fk.number().digits(10));
////            Thread.sleep(5000);
//            Robot r=new Robot();
//            r.keyPress(KeyEvent.VK_TAB);
//            r.keyRelease(KeyEvent.VK_TAB);
//            Thread.sleep(2000);
//            r.keyPress(KeyEvent.VK_ENTER);
//            r.keyRelease(KeyEvent.VK_ENTER);
//            Thread.sleep(2000);
//
//            r.keyPress(KeyEvent.VK_TAB);
//            r.keyRelease(KeyEvent.VK_TAB);
//            Thread.sleep(1000);
//            r.keyPress(KeyEvent.VK_ENTER);
//            r.keyRelease(KeyEvent.VK_ENTER);
//            Thread.sleep(2000);
//
//            ol.ClickonSideBarButton();
//            ol.ClickOnSalesDropdown();
//            ol.ClickOnOrderListButton();
//            Thread.sleep(2000);
//
        }

    }

}
