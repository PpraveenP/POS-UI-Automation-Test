package TestCases.FoodManagement;

import PageObjects.FoodManagement.Add_Menu_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Add_Menu extends BaseClass {
    @Test()
    public void validating_Add_Menu_Form() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AdminLogin();
        Add_Menu_Obj am=new Add_Menu_Obj(driver);
        am.ClickOnFoodManagementDropdown();
        am.ClickOnAddMenuButton();
        am.setFoodName(fk.food().ingredient());
        am.setFoodCode(fk.code().asin());
        am.setPrice(fk.number().digits(3));


        WebElement list= driver.findElement(By.xpath("//select[@name='category']"));
        Select s=new Select(list);
        s.selectByIndex(s.getOptions().size()-1);


        WebElement list1=driver.findElement(By.xpath("//select[@name='subcategory']"));
        Select s1=new Select(list1);
        s1.selectByIndex(s1.getOptions().size()-1);


        am.setDescription("yummy...");
//        File f=new File("./Data/Chicken Biryani.jpg");
//        String absoulutpath=f.getAbsolutePath();
//        am.setfoodImage(absoulutpath);

        am.selectImage();
        Thread.sleep(4000);
        Robot r=new Robot();

        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_P);
        r.keyPress(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_R);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_N);
        r.keyPress(KeyEvent.VK_1);
        r.keyRelease(KeyEvent.VK_1);
        r.keyPress(KeyEvent.VK_9);
        r.keyRelease(KeyEvent.VK_9);
        r.keyPress(KeyEvent.VK_9);
        r.keyRelease(KeyEvent.VK_9);
        r.keyPress(KeyEvent.VK_7);
        r.keyRelease(KeyEvent.VK_7);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_R);

        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_SHIFT);

        r.keyPress(KeyEvent.VK_G);
        r.keyRelease(KeyEvent.VK_G);
        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_M);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_I);
        r.keyRelease(KeyEvent.VK_I);
        r.keyPress(KeyEvent.VK_L);
        r.keyRelease(KeyEvent.VK_L);

        r.keyPress(KeyEvent.VK_PERIOD);
        r.keyRelease(KeyEvent.VK_PERIOD);
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_C);
        r.keyPress(KeyEvent.VK_O);
        r.keyRelease(KeyEvent.VK_O);
        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_M);


        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);

        r.keyPress(KeyEvent.VK_9);
        r.keyRelease(KeyEvent.VK_9);
        r.keyPress(KeyEvent.VK_8);
        r.keyRelease(KeyEvent.VK_8);
        r.keyPress(KeyEvent.VK_4);
        r.keyRelease(KeyEvent.VK_4);
        r.keyPress(KeyEvent.VK_4);
        r.keyRelease(KeyEvent.VK_4);
        r.keyPress(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_2);
        r.keyPress(KeyEvent.VK_6);
        r.keyRelease(KeyEvent.VK_6);
        r.keyPress(KeyEvent.VK_9);
        r.keyRelease(KeyEvent.VK_9);
        r.keyPress(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_2);
        r.keyPress(KeyEvent.VK_9);
        r.keyRelease(KeyEvent.VK_9);
        r.keyPress(KeyEvent.VK_0);
        r.keyRelease(KeyEvent.VK_0);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);



        Thread.sleep(4000);
        r.keyPress(KeyEvent.VK_RIGHT);
        r.keyRelease(KeyEvent.VK_RIGHT);
        Thread.sleep(4000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(4000);

        am.ClickOnCheckBoxButton();
        Thread.sleep(4000);
        am.ClickOnSubmitButton();
        Thread.sleep(5000);
        driver.navigate().refresh();
    }
    @Test()
    public void validating_Food_Name_Text_Box() throws IOException, InterruptedException {
//        AdminLogin();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Add_Menu_Obj am=new Add_Menu_Obj(driver);
        am.ClickonSideBarButton();
        am.ClickOnFoodManagementDropdown();
        am.ClickOnAddMenuButton();

        WebElement food_name = driver.findElement(By.xpath("//input[@name='food_name']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        food_name.sendKeys(generatedbank_branch);

        String enteredbank_branch=food_name.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_Food_Name_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test()
    public void validating_Food_Code_Text_Box() throws IOException {

        WebElement foodcode = driver.findElement(By.xpath("//input[@name='foodcode']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        foodcode.sendKeys(generatedbank_branch);

        String enteredbank_branch=foodcode.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_Food_Code_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test()
    public void validating_Food_Price_Text_Box() throws IOException {

        WebElement price = driver.findElement(By.xpath("//input[@name='price']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        price.sendKeys(generatedbank_branch);

        String enteredbank_branch=price.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_Food_Price_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
    @Test()
    public void validating_Food_description_Text_Box() throws IOException {

        WebElement description = driver.findElement(By.xpath("//input[@name='description']"));
        String generatedbank_branch=("10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj");
        description.sendKeys(generatedbank_branch);

        String enteredbank_branch=description.getAttribute("value");

        String expectedbank_branch="10/10/2023kljfsafafljslfjljfsffjfsl344641sfljfkfjflkj44f4sf4fkfjffjsdlfksfojdggkljdgjdgkljdsgijgkjfdgjsdlgjdgioj";

        if (enteredbank_branch.equals(expectedbank_branch)) {
            captureScreen(driver,"validating_Food_description_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }
}
