package TestCases.Purchase;

import PageObjects.Purchase.Vendor_Payment_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Vendor_Payment extends BaseClass {
    @Test(priority = 1)
    public void validating_Vendor_Payment_Form() throws InterruptedException {
        AdminLogin();
        Vendor_Payment_Obj vp=new Vendor_Payment_Obj(driver);
        vp.ClickOnPurchaseDropdownButton();
        Thread.sleep(2000);
        vp.ClickOnVendorPaymentButton();
        Thread.sleep(2000);

        WebElement list = driver.findElement(By.xpath("//select[@name='vendor_name']"));
        Select s=new Select(list);
        List<WebElement> all = s.getOptions();
        int count=all.size();
        s.selectByIndex(count-1);

        Thread.sleep(2000);
        vp.setDueDate("11/22/2023");
        vp.setBankName(fk.name().title());
        vp.setBranchName(fk.address().firstName());
        vp.setAccountNumber(fk.number().digits(11));
        vp.setIFSCcode("HDFC"+fk.number().digits(7));
        vp.setUPIid(fk.name().lastName()+"@ybl");
        vp.setTotalAmount(fk.number().digits(4));
        Thread.sleep(10000);
        vp.ClickOnSubmitButton();
        Thread.sleep(10000);
        driver.navigate().refresh();
        Thread.sleep(10000);
    }

    @Test(priority = 2)
    public void validating_Due_Date_Text_Box() throws IOException, InterruptedException {
        Vendor_Payment_Obj vp=new Vendor_Payment_Obj(driver);
        vp.ClickonSideBarButton();
        vp.ClickOnPurchaseDropdownButton();
        Thread.sleep(2000);
        vp.ClickOnVendorPaymentButton();
        Thread.sleep(2000);

        WebElement Due_Date = driver.findElement(By.xpath("//input[@name='due_date']"));
        String generatedDue_Date=("10/10/2023");
        Due_Date.sendKeys(generatedDue_Date);

        String enteredDue_Date=Due_Date.getAttribute("value");

        String expectedDue_Date="10/10/2023";

        if (enteredDue_Date.equals(expectedDue_Date)) {
            captureScreen(driver,"validating_Due_Date_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }

    }
    @Test(priority = 3)
    public void validating_BankName_Text_Fild() throws IOException {

        WebElement bank_name = driver.findElement(By.xpath("//input[@name='bank_name']"));
        String generatedbank_name=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        bank_name.sendKeys(generatedbank_name);

        String enteredbank_name=bank_name.getAttribute("value");

        String expectedbank_name="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_name.equals(expectedbank_name)) {
            captureScreen(driver,"validating_BankName_Text_Fild");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 4)
    public void validating_Branch_Name_Text_Box() throws IOException {

        WebElement bank_branch = driver.findElement(By.xpath("//input[@name='branch']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        bank_branch.sendKeys(generatedbank_branch);

        String enteredbank_branch=bank_branch.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_Branch_Name_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 5)
    public void validating_Account_Number_Text_Box() throws IOException {
        WebElement account_no = driver.findElement(By.xpath("//input[@name='account_no']"));
        String generated_account_no=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        account_no.sendKeys(generated_account_no);

        String entered_account_no=account_no.getAttribute("value");

        String expected_account_no="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_account_no.equals(expected_account_no)) {
            captureScreen(driver,"validating_Account_Number_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 6)
    public void validating_IFSC_Code_Text_Box() throws IOException {
        WebElement IFSC_Code = driver.findElement(By.xpath("//input[@title='Please enter valid IFSC Code']"));
        String generated_IFSC_Code=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        IFSC_Code.sendKeys(generated_IFSC_Code);

        String entered_IFSC_Code=IFSC_Code.getAttribute("value");

        String expected_IFSC_Code="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_IFSC_Code.equals(expected_IFSC_Code)) {
            captureScreen(driver,"validating_IFSC_Code_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 7)
    public void validating_UPI_Id_Text_Box() throws IOException {
        WebElement UPI_ID = driver.findElement(By.xpath("//input[@title='Please enter valid UPI ID']"));
        String generated_UPI_ID=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        UPI_ID.sendKeys(generated_UPI_ID);

        String entered_UPI_ID=UPI_ID.getAttribute("value");

        String expected_UPI_ID="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_UPI_ID.equals(expected_UPI_ID)) {
            captureScreen(driver,"validating_UPI_Id_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 8)
    public void validating_Amount_total_Text_Box() throws IOException, InterruptedException {
        WebElement total = driver.findElement(By.xpath("//input[@name='total']"));
        String generated_UPI_ID=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        total.sendKeys(generated_UPI_ID);

        String entered_UPI_ID=total.getAttribute("value");

        String expected_UPI_ID="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_UPI_ID.equals(expected_UPI_ID)) {
            captureScreen(driver,"validating_Amount_total_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
//        vp.ClickOnSubmitButton();
//        Thread.sleep(5000);
    }

}
