package TestCases.Inventory;

import PageObjects.Inventory.Add_InventoryObj;
import PageObjects.Logins.Admin;
import TestCases.BaseClass;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Add_Inventory extends BaseClass {
    @Test()
    public void validating_Add_InventoryForm() throws InterruptedException {
      AdminLogin();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Add_InventoryObj ai=new Add_InventoryObj(driver);
        ai.ClickOnInventoryDropdownButton();
        ai.ClickOnAddInventoryButton();
        ai.setProductName(fk.food().ingredient());
        ai.setProductCode("ss"+String.valueOf(fk.number().randomDigit())+"p");
        ai.selectCategoryDropdown();
        ai.ClickOnDairyProduct();
        ai.setPrice(String.valueOf(fk.number().randomDigit()));
        ai.setQuantity(String.valueOf(fk.number().randomDigit()));
        ai.ClickOnUnitDropDown();
        ai.setKgOption();
        ai.ClickOnExpireDateDropdown();
        ai.setExpireDate("11/11/2023");
        ai.setMinimumLevel(String.valueOf(fk.number().randomDigit()));
        ai.clickOnminiLevelUnitDropdown();
        ai.setGram();
      ai.ClickOnSubmitButton();
      Thread.sleep(5000);
    }
    @Test()

    public void validating_Add_Inventory_Product_Name() throws InterruptedException, IOException {

      // Add an implicit wait for the driver (optional)
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Add_InventoryObj ai=new Add_InventoryObj(driver);
      ai.ClickonSideBarButton();
      ai.ClickOnInventoryDropdownButton();
      ai.ClickOnAddInventoryButton();

      // Find the product name input field by XPath
      WebElement productname = driver.findElement(By.xpath("//input[@name='name']"));

      // Generate a product name and set it in the input field
      String generatedProductName = fk.food().ingredient() + "skgsjkdgskdjsiodgsrigjsfdkgskdgjfdkljdfklgjsfdlgkjsddgsfdgsgsdfg";
      productname.sendKeys(generatedProductName);

      // Retrieve the entered product name
      String enteredProductName = productname.getAttribute("value");
//      System.out.println(enteredProductName);

      // Define the expected product name
      String expectedProductName = "skgsjkdgskdjsiodgsrigjsfdkgskdgjfdkljdfklgjsfdlgkjsddgsfdgsgsdfg"; // Replace with the expected name

      // Perform the validation
      if (enteredProductName.contains(expectedProductName)) {
        captureScreen(driver,"validating_Add_Inventory_Product_Name");
        Assert.assertTrue(false);
      } else {
        Assert.assertTrue(true);
      }
    }
    @Test()
  public void validating_Product_Code_Text_Field() throws InterruptedException, IOException {


      WebElement productcode = driver.findElement(By.xpath("//input[@name='inventory_code']"));
      WebElement ProductCode=driver.findElement(By.xpath("//input[@name='inventory_code']"));
      String generatedproductcode=("ssd"+String.valueOf(fk.number().randomDigit())+"pkljdslfakjdaklfjdklfjfjdajkfhdajkh");
      productcode.sendKeys(generatedproductcode);

      String enteredproductcode=productcode.getAttribute("value");

      String expectedproductcode="pkljdslfakjdaklfjdklfjfjdajkfhdajkh";

      if (enteredproductcode.contains(expectedproductcode)) {
        captureScreen(driver,"validating_Product_Code_Text_Field");
          Assert.assertTrue(false);
      } else {
          Assert.assertTrue(true);
      }

    }
    @Test()
    public void validating_Price_Per_Unit_Text_Box() throws IOException {
        WebElement Price = driver.findElement(By.xpath("//input[@name='price']"));

        String generatedPrice=("1234567891010022122pkljdslfakjdaklfjdklfjfjdajkfhdajkh");
        Price.sendKeys(generatedPrice);

        String enteredPrice=Price.getAttribute("value");

        String expectedPrice="1234567891010022122pkljdslfakjdaklfjdklfjfjdajkfhdajkh";

        if (enteredPrice.contains(expectedPrice)) {
            captureScreen(driver,"validating_Price_Per_Unit_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }

    }
    @Test()
    public void validating_Quantity_Text_Box() throws IOException {
        WebElement Quantity = driver.findElement(By.xpath("//input[@name='quantity']"));

        String generatedQuantity=("1234567891010022122pkljdslfakjdaklfjdklfjfjdajkfhdajkh");
        Quantity.sendKeys(generatedQuantity);

        String enteredQuantity=Quantity.getAttribute("value");

        String expectedQuantity="1234567891010022122pkljdslfakjdaklfjdklfjfjdajkfhdajkh";

        if (enteredQuantity.contains(expectedQuantity)) {
            captureScreen(driver,"validating_Quantity_Text_Box");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }

    }

}
