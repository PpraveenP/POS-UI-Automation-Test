package TestCases.User;

import PageObjects.User.Add_User_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Add_User extends BaseClass {

    @Test()
    public void validating_Add_User_Form() throws InterruptedException {
        AdminLogin();
        Add_User_Obj au=new Add_User_Obj(driver);
        au.ClickOnUserDropdownButton();
        au.ClickOnAddUserButton();
        au.setUserName(fk.name().firstName());
        au.setEmail(fk.name().firstName()+"@gmail.com");
        au.setContact("9"+fk.number().digits(9));
        au.setAddress(fk.address().streetAddress());
        au.setPassword("Praveen@01");
        au.setConformPassword("Praveen@01");
        au.ClickOnSubmitButton();
        Thread.sleep(5000);
        driver.navigate().refresh();

    }
    @Test()
    public void validating_User_Name_Text_Box() throws IOException {
        Add_User_Obj au=new Add_User_Obj(driver);
        au.ClickonSideBarButton();
        au.ClickOnUserDropdownButton();
        au.ClickOnAddUserButton();


        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        username.sendKeys(generatedbank_branch);

        String enteredbank_branch=username.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_User_Name_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test()
    public void validating_User_Email_Text_Box() throws IOException {

        WebElement gmail = driver.findElement(By.xpath("//input[@title='valid only for @gmail.com']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        gmail.sendKeys(generatedbank_branch);

        String enteredbank_branch=gmail.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_User_Email_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test()
    public void validating_User_Contact_Text_Box() throws IOException {

        WebElement contact = driver.findElement(By.xpath("//input[@name='contact']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        contact.sendKeys(generatedbank_branch);

        String enteredbank_branch=contact.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_User_Contact_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test()
    public void validating_User_Address_Text_Box() throws IOException {

        WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        address.sendKeys(generatedbank_branch);

        String enteredbank_branch=address.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_User_Address_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test()
    public void validating_User_Password_Text_Box() throws IOException {

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        password.sendKeys(generatedbank_branch);

        String enteredbank_branch=password.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_User_Password_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test()
    public void validating_User_Conform_Password_Text_Box() throws IOException {

        WebElement comfirmpassword = driver.findElement(By.xpath("//input[@name='comfirmpassword']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        comfirmpassword.sendKeys(generatedbank_branch);

        String enteredbank_branch=comfirmpassword.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_User_Conform_Password_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
}
