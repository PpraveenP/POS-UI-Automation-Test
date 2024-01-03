package PageObjects.FoodManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Recipe_Obj {

    WebDriver ldriver;
    public Add_Recipe_Obj(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Food Management']")
    WebElement FoodManagement;
    public void ClickOnFoodManagementDropdown()
    {
        FoodManagement.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Add Recipe']")
    WebElement AddRecipeButton;
    public void ClickOnAddRecipeButton()
    {
        AddRecipeButton.click();
    }

    @FindBy(xpath = "//div[@class='col-md-6']//select[@name='name']")
    WebElement ProductName;
    public void ClickOnProductNameDropdown()
    {
        ProductName.click();
    }
    @FindBy(xpath = "//option[normalize-space()='Thai curry']")
    WebElement Product;
    public void ClickOnProduct( )
    {
        Product.click();
    }

    @FindBy(xpath = "//tbody//tr//td//select[@name='name']")
    WebElement Ingredientname;
    public void ClickOnIngredientName( )
    {
        Ingredientname.click();
    }

    @FindBy(xpath = "//option[@value='salt']")
    WebElement Ingredient;
    public void ClickOnIngredient( )
    {
       Ingredient.click();
    }

    @FindBy(xpath = "//input[@placeholder='Quantity']")
    WebElement Quantity;
    public void setQuantity(String quantity)
    {
        Quantity.sendKeys(quantity);
    }

    @FindBy(xpath = "//select[@name='unit']")
    WebElement UnitButton;
    public void ClickOnUnitBuutonDropdown( )
    {
        UnitButton.click();
    }

    @FindBy(xpath = "//option[@value='per']")
    WebElement unit;
    public void selectUnit( )
    {
        unit.click();
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement Submit;
    public void ClickOnSubmitButton( )
    {
        Submit.click();
    }

}
