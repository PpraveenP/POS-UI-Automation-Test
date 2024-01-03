package TestCases.Purchase;

import PageObjects.Purchase.Add_Vendor_Obj;
import TestCases.BaseClass;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Add_Vendor extends BaseClass {
    @Test(priority = 1)
    public void validating_Add_Vendor_Form() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AdminLogin();
        Add_Vendor_Obj av=new Add_Vendor_Obj(driver);
        av.ClickOnPurchaseDropdownButton();
        av.ClickOnAddVendorButton();

        av.setVendorName(fk.name().firstName());
        av.setVendorCode(fk.code().asin());
        av.setVendorAddress(fk.address().streetAddress());
        av.setMobileNumber("91"+fk.number().digits(13));
        av.setBankName(fk.name().title());
        av.setBranch(fk.address().firstName());
        av.setAccountNumber(fk.number().digits(10));
        av.setIFSCcode("CANRB"+fk.number().digits(5));
        av.setUPIid(fk.name().lastName()+"@ybl");
        av.ClickOnSubmitButton();
        Thread.sleep(10000);
    }
    @Test(priority = 2)
    public void validating_VendorName_Text_Box() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Add_Vendor_Obj av=new Add_Vendor_Obj(driver);
        av.ClickonSideBarButton();
        av.ClickOnPurchaseDropdownButton();
        av.ClickOnAddVendorButton();


        WebElement VendorName = driver.findElement(By.xpath("//input[@name='vendor_name']"));

        String generatedVendorName=("ssd"+String.valueOf(fk.number().randomDigit())+"pkljdslfakjdaklfjdkl56456564565fjfjdajkfhdajkh");
        VendorName.sendKeys(generatedVendorName);

        String enteredVendorName=VendorName.getAttribute("value");

        String expectedVendorName="pkljdslfakjdaklfjdkl56456564565fjfjdajkfhdajkh";

        if (enteredVendorName.contains(expectedVendorName)) {
            captureScreen(driver,"validating_VendorName_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }

    }
    @Test(priority = 3)
    public void validting_Vendor_Code_Text_Box() throws IOException {

        WebElement VendorCode = driver.findElement(By.xpath("//input[@name='vendor_code']"));

        String generatedVendorCode=("ssd"+String.valueOf(fk.number().randomDigit())+"pkljdslfakjdaklfjdkl56456564565fjfjdajkfhdajkh");
        VendorCode.sendKeys(generatedVendorCode);

        String enteredVendorCode=VendorCode.getAttribute("value");

        String expectedVendorCode="pkljdslfakjdaklfjdkl56456564565fjfjdajkfhdajkh";

        if (enteredVendorCode.contains(expectedVendorCode)) {
            captureScreen(driver,"validting_Vendor_Code_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 4)
    public void validating_Vendor_Address_Text_Box() throws IOException {

        WebElement VendorAdress= driver.findElement(By.xpath("//input[@name='vendor_address']"));

        String generatedVendorAdress=("ssd"+String.valueOf(fk.number().randomDigit())+"dsfgkjgjsdfklgjsfdgfjghjfghjfghjfgjfgjfgjfgjfgjgjjfghjfghyiurwrgdgsdgsdjsdkgjsdlgjdgklsdjgsdlkgjdlgkjsdglsjdgsdjgsodigjslkgjsfdgjsdgjdgljsdgkldgjskgjsdflkgjsfdgjsdkgjsfdkgsjdgoisresgsjgsfkdgjsdgjsdkgjsdgsjdgkljdgljsogjslgk");
        VendorAdress.sendKeys(generatedVendorAdress);

        String enteredVendorAdress=VendorAdress.getAttribute("value");

        String expectedVendorAdress="dsfgkjgjsdfklgjsfdgfjghjfghjfghjfgjfgjfgjfgjfgjgjjfghjfghyiurwrgdgsdgsdjsdkgjsdlgjdgklsdjgsdlkgjdlgkjsdglsjdgsdjgsodigjslkgjsfdgjsdgjdgljsdgkldgjskgjsdflkgjsfdgjsdkgjsfdkgsjdgoisresgsjgsfkdgjsdgjsdkgjsdgsjdgkljdgljsogjslgk";

        if (enteredVendorAdress.contains(expectedVendorAdress)) {
            captureScreen(driver,"validating_Vendor_Address_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 5)
    public void validating_Vendor_Mobile_Number_Text_Box() throws IOException {

        WebElement VendorPhoneNumber = driver.findElement(By.xpath("//input[@title='Must contain at least 13 digits']"));

        String generatedVendorPhoneNumber=("12345678910");
        VendorPhoneNumber.sendKeys(generatedVendorPhoneNumber);

        String enteredVendorPhoneNumber=VendorPhoneNumber.getAttribute("value");

        String expectedVendorPhoneNumber="12345678910";

        if (enteredVendorPhoneNumber.contains(expectedVendorPhoneNumber)) {
            captureScreen(driver,"validating_Vendor_Mobile_Number_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 6)
    public void validating_Vendor_Bank_Name_Text_Box() throws IOException {

        WebElement VendorBankName= driver.findElement(By.xpath("//input[@name='bank_name']"));

        String generatedVendorBankName=("123456789106546565454656546545465465465465465465465465465465465465465465465465465465465465465456446465");
        VendorBankName.sendKeys(generatedVendorBankName);

        String enteredVendorBankName=VendorBankName.getAttribute("value");

        String expectedVendorBankName="123456789106546565454656546545465465465465465465465465465465465465465465465465465465465465465456446465";

        if (enteredVendorBankName.contains(expectedVendorBankName)) {
            captureScreen(driver,"validating_Vendor_Bank_Name_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 7)
    public void validating_BranchName_Text_Box() throws IOException {
        WebElement VendorBanchName= driver.findElement(By.xpath("//input[@name='branch']"));

        String generatedBranchName=("1234567891065465654546hfkjshafkjshdafkjhafjk56546545465465465465465465asdfsdafsdaf4654654654654654sadfsdafs65465465465465465465465465465456446465");
        VendorBanchName.sendKeys(generatedBranchName);

        String enteredVendorBanchName=VendorBanchName.getAttribute("value");

        String expectedVendorBanchName="1234567891065465654546hfkjshafkjshdafkjhafjk56546545465465465465465465asdfsdafsdaf4654654654654654sadfsdafs65465465465465465465465465465456446465";

        if (enteredVendorBanchName.contains(expectedVendorBanchName)){
            captureScreen(driver,"validating_BranchName_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 8)
    public void validating_Account_Number_TextBox() throws IOException {
        WebElement VendorAccountNumber= driver.findElement(By.xpath("//input[@title='Please enter valid account number']"));

        String generatedVendorAccountNumber=("1234567891065465654546hfkjshafkjshdafkjhafjk56546545465465465465465465asdfsdafsdaf4654654654654654sadfsdafs65465465465465465465465465465456446465");
        VendorAccountNumber.sendKeys(generatedVendorAccountNumber);

        String enteredVendorAccountNumber=VendorAccountNumber.getAttribute("value");

        String expectedVendorAccountNumber="1234567891065465654546hfkjshafkjshdafkjhafjk56546545465465465465465465asdfsdafsdaf4654654654654654sadfsdafs65465465465465465465465465465456446465";

        if (enteredVendorAccountNumber.contains(expectedVendorAccountNumber)){
            captureScreen(driver,"validating_Account_Number_TextBox");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 9)
    public void validating_IFSC_Code_Text_Box() throws IOException {
        WebElement VendorIFSC_CODE= driver.findElement(By.xpath("//input[@name='ifsc_code']"));

        String generatedVendorIFSC_CODE=("1234567891065465654546hfkjshafkjshdafkjhafjk56546545465465465465465465asdfsdafsdaf4654654654654654sadfsdafs65465465465465465465465465465456446465");
        VendorIFSC_CODE.sendKeys(generatedVendorIFSC_CODE);

        String enteredVendorIFSC_CODEr=VendorIFSC_CODE.getAttribute("value");

        String expectedVendorIFSC_CODE="1234567891065465654546hfkjshafkjshdafkjhafjk56546545465465465465465465asdfsdafsdaf4654654654654654sadfsdafs65465465465465465465465465465456446465";

        if (enteredVendorIFSC_CODEr.contains(expectedVendorIFSC_CODE)){
            captureScreen(driver,"validating_IFSC_Code_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 10)
    public void validating_UPI_ID_Text_Box() throws IOException {
        WebElement VendorUPI_Id= driver.findElement(By.xpath("//input[@title='Please enter valid UPI ID']"));

        String generatedVendorUPI_Id=("1234567891065465654546hfkjshafkjshdafkjhafjk56546545465465465465465465asdfsdafsdaf4654654654654654sadfsdafs65465465465465465465465465465456446465");
        VendorUPI_Id.sendKeys(generatedVendorUPI_Id);

        String enteredVendorUPI_Id=VendorUPI_Id.getAttribute("value");

        String expectedVendorUPI_Id="1234567891065465654546hfkjshafkjshdafkjhafjk56546545465465465465465465asdfsdafsdaf4654654654654654sadfsdafs65465465465465465465465465465456446465";

        if (enteredVendorUPI_Id.contains(expectedVendorUPI_Id)){
            captureScreen(driver,"validating_UPI_ID_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
}
