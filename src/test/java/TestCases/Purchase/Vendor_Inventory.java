package TestCases.Purchase;

import PageObjects.Purchase.Vendor_Inventory_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Vendor_Inventory extends BaseClass {

    @Test(priority = 1)
    public void validating_Vendor_Inventory_Form() throws InterruptedException {
        AdminLogin();
        Vendor_Inventory_Obj vi=new Vendor_Inventory_Obj(driver);
        vi.ClickOnPurchaseDropdownButton();
        vi.ClickOnVendorInventoryButton();

        WebElement list2 = driver.findElement(By.xpath("//select[@name='vendor_name']"));
        Select s=new Select(list2);
        List<WebElement> all = s.getOptions();
        int count1 = all.size();
        System.out.println(all.size());
        s.selectByIndex(count1-1);

        WebElement list = driver.findElement(By.xpath("//select[@name='item_name']"));
        Select s1=new Select(list);
        List<WebElement> all1 = s1.getOptions();
        int count = all1.size();
        System.out.println(all1.size());
        s1.selectByIndex(count-1);

        vi.setInventoryCode(fk.code().asin());
        vi.setQuantity(fk.number().digits(3));
        vi.ClickOnUnitDorpdown();
        vi.setGram();
        vi.setPrice(fk.number().digits(2));
        vi.setTotalAmount(fk.number().digits(4));
        Thread.sleep(10000);
        vi.ClickOnSubmitButton();
        Thread.sleep(10000);
        driver.navigate().refresh();
        Thread.sleep(10000);

    }
    @Test(priority = 2)
    public void validating_Inventory_Code_Text_Fild() throws IOException {
        Vendor_Inventory_Obj vi=new Vendor_Inventory_Obj(driver);
        vi.ClickonSideBarButton();
        vi.ClickOnPurchaseDropdownButton();
        vi.ClickOnVendorInventoryButton();

        WebElement inventory_code = driver.findElement(By.xpath("//input[@name='inventory_code']"));
        String generatedbank_name=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        inventory_code.sendKeys(generatedbank_name);

        String enteredbank_name=inventory_code.getAttribute("value");

        String expectedbank_name="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_name.equals(expectedbank_name)) {
            captureScreen(driver,"validating_Inventory_Code_Text_Fild");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 3)
    public void validating_Quantity_Text_Box() throws IOException {

        WebElement quantity = driver.findElement(By.xpath("//input[@name='quantity']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        quantity.sendKeys(generatedbank_branch);

        String enteredbank_branch=quantity.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_Quantity_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 4)
    public void validating_Price_Per_Unit_Text_Box() throws IOException {
        WebElement price = driver.findElement(By.xpath("//input[@name='price']"));
        String generated_account_no=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        price.sendKeys(generated_account_no);

        String entered_account_no=price.getAttribute("value");

        String expected_account_no="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_account_no.equals(expected_account_no)) {
            captureScreen(driver,"validating_Price_Per_Unit_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 5)
    public void validating_Discount_Text_Box() throws IOException {
        WebElement discount = driver.findElement(By.xpath("//input[@name='discount']"));
        String generated_IFSC_Code=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        discount.sendKeys(generated_IFSC_Code);

        String entered_IFSC_Code=discount.getAttribute("value");

        String expected_IFSC_Code="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_IFSC_Code.equals(expected_IFSC_Code)) {
            captureScreen(driver,"validating_Descount_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 6)
    public void validating_Total_Price_Text_Box() throws IOException {
        WebElement total = driver.findElement(By.xpath("//input[@name='total']"));
        String generated_UPI_ID=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        total.sendKeys(generated_UPI_ID);

        String entered_UPI_ID=total.getAttribute("value");

        String expected_UPI_ID="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (entered_UPI_ID.equals(expected_UPI_ID)) {
            captureScreen(driver,"validating_Total_Price_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
}
