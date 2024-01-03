package PageObjects.Inventory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_InventoryObj {
    WebDriver ldriver;
    public Add_InventoryObj(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[1]")
    @CacheLookup
    WebElement SideBarbutton;
    public void ClickonSideBarButton()
    {
        SideBarbutton.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Inventory']")
    WebElement InventoryDropdownButton;
    public void ClickOnInventoryDropdownButton()
    {
        InventoryDropdownButton.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Add Inventory']")
    WebElement AddInventoryButton;
    public void ClickOnAddInventoryButton()
    {
        AddInventoryButton.click();
    }

    @FindBy(xpath = "//input[@name='name']")
    WebElement ProductName;
    public void setProductName(String productName)
    {
        ProductName.sendKeys(productName);
    }

    @FindBy(xpath = "//input[@name='inventory_code']")
    WebElement ProductCode;

    public void setProductCode(String productCode)
    {
        ProductCode.sendKeys(productCode);
    }

    @FindBy(xpath = "//select[@name='category']")
    WebElement SelectCategory;
    public void selectCategoryDropdown()
    {
        SelectCategory.click();
    }

    @FindBy(xpath = "//option[@value='dairy prouduct']")
    WebElement DairyProduct;
    public void ClickOnDairyProduct()
    {
        DairyProduct.click();
    }

    @FindBy(xpath = "//input[@name='price']")
    WebElement Price;
    public void setPrice(String price)
    {
        Price.sendKeys(price);
    }

    @FindBy(xpath = "//input[@name='quantity']")
    WebElement Quantity;
    public void setQuantity(String quantity)
    {
        Quantity.sendKeys(quantity);
    }

    @FindBy(xpath = "//select[@name='unit']")
    WebElement SelectUnitDropdown;
    public void ClickOnUnitDropDown()
    {
        SelectUnitDropdown.click();
    }

    @FindBy(xpath = "//option[@value='kg']")
    WebElement KGoption;
    public void setKgOption()
    {
        KGoption.click();
    }

    @FindBy(xpath = "//input[@name='expirydate']")
    WebElement ExpireDateDropdown;
    public void ClickOnExpireDateDropdown()
    {
        ExpireDateDropdown.click();
    }
    public void setExpireDate(String date)
    {
        ExpireDateDropdown.sendKeys(date);
    }

    @FindBy(xpath = "//input[@name='minlevel']")
    WebElement MinimumLevel;
    public void setMinimumLevel(String level)
    {
        MinimumLevel.sendKeys(level);
    }

    @FindBy(xpath = "//select[@name='minlevelunit']")
    WebElement MiniLevelUnit;
    public void clickOnminiLevelUnitDropdown()
    {
        MiniLevelUnit.click();
    }

    @FindBy(xpath = "//select[@name='minlevelunit']//option[@value='gram'][normalize-space()='Gram']")
    WebElement Gram;
    public void setGram()
    {
        Gram.click();
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement SubmitButton;
    public void ClickOnSubmitButton()
    {
        SubmitButton.click();
    }

}
