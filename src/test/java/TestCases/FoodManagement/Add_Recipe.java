package TestCases.FoodManagement;

import PageObjects.FoodManagement.Add_Recipe_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Add_Recipe extends BaseClass {
    @Test()
    public void validating_Add_Recipe_Form() throws InterruptedException {
        AdminLogin();
        Add_Recipe_Obj ar=new Add_Recipe_Obj(driver);
        ar.ClickOnFoodManagementDropdown();
        ar.ClickOnAddRecipeButton();
//        ar.ClickOnProductNameDropdown();
//        Thread.sleep(2000);
//        ar.ClickOnProduct();
        WebElement products = driver.findElement(By.xpath("//div[@class='col-md-6']//select[@name='name']"));
        Select s=new Select(products);
       int count= s.getOptions().size();
       s.selectByIndex(count-fk.number().randomDigit());

//        ar.ClickOnIngredientName();
//        ar.ClickOnIngredient();

        WebElement ingredients = driver.findElement(By.xpath("(//select[@name='name'])[2]"));
        Select s1=new Select(ingredients);
        int count1= s1.getOptions().size();
        s1.selectByIndex(count1-1);


        ar.setQuantity(fk.number().digits(2));
        ar.ClickOnUnitBuutonDropdown();
        ar.selectUnit();
        Thread.sleep(4000);
        ar.ClickOnSubmitButton();
        Thread.sleep(4000);
    }
}
