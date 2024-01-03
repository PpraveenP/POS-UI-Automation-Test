package TestCases.CashRegister;

import PageObjects.CashRegister.Cash_Register_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Cash_Register extends BaseClass {
    @Test(priority = 1)
    public void validating_Add_More_Amount() throws InterruptedException {
        AdminLogin();
        Cash_Register_Obj cr=new Cash_Register_Obj(driver);
        cr.ClickOnCashRegisterButton();
        cr.setAddMoreAmount("2000"+fk.number().digit());
        cr.ClickOnAddSymbolButton();
        Thread.sleep(5000);
        driver.navigate().refresh();
    }
    @Test(priority = 2)
    public void validating_Expense_Amount() throws InterruptedException {
        Cash_Register_Obj cr=new Cash_Register_Obj(driver);
        cr.setExpanceName(fk.name().firstName());
        cr.setAmount("20"+fk.number().digit());
        cr.ClickOnSubmitButton();
        driver.navigate().refresh();
        Thread.sleep(5000);
    }
    @Test(priority = 3)
    public void validating_Add_More_Amount_Text_Box() throws IOException {

        WebElement add_more_amounts = driver.findElement(By.xpath("//input[@name='addmoreamounts']"));
        String generated_account_no=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        add_more_amounts.sendKeys(generated_account_no);

        String entered_account_no=add_more_amounts.getAttribute("value");

        String expected_account_no="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_account_no.equals(expected_account_no)) {
            captureScreen(driver,"validating_Add_More_Amount_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 4)
    public void validating_Expense_Text_Box() throws IOException {
        WebElement expense = driver.findElement(By.xpath("//input[@name='expense']"));
        String generated_account_no=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        expense.sendKeys(generated_account_no);

        String entered_account_no=expense.getAttribute("value");

        String expected_account_no="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_account_no.equals(expected_account_no)) {
            captureScreen(driver,"validating_Expense_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 5)
    public void validating_Amount_Text_Box() throws IOException {
        WebElement amount = driver.findElement(By.xpath("//input[@name='amount']"));
        String generated_account_no=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        amount.sendKeys(generated_account_no);

        String entered_account_no=amount.getAttribute("value");

        String expected_account_no="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_account_no.equals(expected_account_no)) {
            captureScreen(driver,"validating_Amount_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 6)
    public void validating_Final_Given_amount() throws InterruptedException {
        Cash_Register_Obj cr=new Cash_Register_Obj(driver);
        cr.ClickOnSetUpFinalAmountButton();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
        Thread.sleep(3000);
        cr.setHandedOverName(fk.name().firstName());
        cr.setFinalAmount("20000"+fk.number().digit());
        driver.findElement(By.xpath("//form[3]//div[1]//button[1]")).submit();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

    }
    @Test(priority = 7)
    public void validating_Handed_Over_To_Text_Box() throws InterruptedException, IOException {
        Cash_Register_Obj cr=new Cash_Register_Obj(driver);
        cr.ClickOnSetUpFinalAmountButton();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
        Thread.sleep(3000);
        WebElement final_handed_over_to = driver.findElement(By.xpath("//input[@name='final_handed_over_to']"));
        String generated_account_no=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        final_handed_over_to.sendKeys(generated_account_no);

        String entered_account_no=final_handed_over_to.getAttribute("value");

        String expected_account_no="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_account_no.equals(expected_account_no)) {
            captureScreen(driver,"validating_Handed_Over_To_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 8)
    public void validating_Handed_Amount_Text_Box() throws InterruptedException, IOException {
        Cash_Register_Obj cr=new Cash_Register_Obj(driver);
        cr.ClickOnSetUpFinalAmountButton();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
        Thread.sleep(3000);
        WebElement final_amount = driver.findElement(By.xpath("//input[@name='final_amount']"));
        String generated_account_no=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        final_amount.sendKeys(generated_account_no);

        String entered_account_no=final_amount.getAttribute("value");

        String expected_account_no="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_account_no.equals(expected_account_no)) {
            captureScreen(driver,"validating_Handed_Amount_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
}
