package PageObjects.Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendor_Inventory_Obj {
    WebDriver ldriver;
    public Vendor_Inventory_Obj(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[name()='path' and contains(@d,'M16 132h41')]")
    @CacheLookup
    WebElement SideBarbutton;
    public void ClickonSideBarButton()
    {
        SideBarbutton.click();
    }
    @FindBy(xpath = "//span[normalize-space()='Purchase']")
    WebElement PurchageButton;
    public void ClickOnPurchaseDropdownButton()
    {
        PurchageButton.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Vendor Inventory']")
    WebElement VendorInventoryButton;
    public void ClickOnVendorInventoryButton()
    {
        VendorInventoryButton.click();
    }

    @FindBy(xpath = "//select[@name='vendor_name']")
    WebElement SelectVendorDropdown;
    public void ClickOnSelectVendorDropdown()
    {
        SelectVendorDropdown.click();
    }
    @FindBy(xpath = "//option[@value='Francisca']")
    WebElement Option1;
    public void ClickOnOption1()
    {
        Option1.click();
    }

    @FindBy(xpath = "//select[@name='item_name']")
    WebElement ItemName;
    public void ClickOnItemDropdown()
    {
        ItemName.click();
    }

    @FindBy(xpath = "//option[@value='Vegetable Stock']")
    WebElement Vegetable;
    public void ClickOnVagetable()
    {
        Vegetable.click();
    }
    @FindBy(xpath = "//input[@name='inventory_code']")
    WebElement InventoryCode;
    public void setInventoryCode(String inventoryCode)
    {
        InventoryCode.sendKeys(inventoryCode);
    }

    @FindBy(xpath = "//input[@name='quantity']")
    WebElement Quantity;
    public void setQuantity(String quantity){
        Quantity.sendKeys(quantity);
    }
    @FindBy(xpath = "//select[@name='unit']")
    WebElement UnitDropdown;
    public void ClickOnUnitDorpdown()
    {
        UnitDropdown.click();
    }
    @FindBy(xpath = "//option[@value='gram']")
    WebElement Gram;
    public void setGram()
    {
        Gram.click();
    }
    @FindBy(xpath = "//input[@name='price']")
    WebElement Price;
    public void setPrice(String price)
    {
        Price.sendKeys(price);
    }

    @FindBy(xpath = "//input[@name='total']")
    WebElement TotalAmount;
    public void setTotalAmount(String amount)
    {
        TotalAmount.sendKeys(amount);
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SubmitButton;
    public void ClickOnSubmitButton()
    {
        SubmitButton.click();
    }

}
