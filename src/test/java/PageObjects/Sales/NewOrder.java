package PageObjects.Sales;

import PageObjects.Logins.Admin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrder {
    WebDriver ldriver;
   public NewOrder(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    // Sales

    @FindBy(xpath = "//div[@class='sc-ikkxIA bTRxoz ml-2 cicon fixed']//*[name()='svg']")
    @CacheLookup
    WebElement SideBar;
    public void ClickonSedeBar()
    {
        SideBar.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Sales']")
    @CacheLookup
    WebElement SalesButton;
    public void ClickonSalesButton()
    {
        SalesButton.click();
    }

    @FindBy(xpath = "//i[@class='icon text-black mr-2 fa-solid fa-bowl-food']")
    @CacheLookup
    WebElement SalesDropdownButton;
    public WebElement ClickonSalesDropdownButton()
    {
        return SalesDropdownButton;
    }

    @FindBy(xpath = "//span[normalize-space()='New Order']")
    @CacheLookup
    WebElement NewOrderButtno;
    public void ClickonNewOrderButton()
    {
        NewOrderButtno.click();
    }

    @FindBy(xpath = "//div[@class='col']//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]")
    WebElement Pohe;
    public void Clickon_Pohe_Order()
    {
        Pohe.click();
    }

    @FindBy(xpath = "//select[@name='ordertype']")
    WebElement OrderType;
    public void ClickonOrderTypeDropdown()
    {
        OrderType.click();
    }

    @FindBy(xpath = "//option[@value='take-away']")
    WebElement TakeAwayOption;
    public void ClickonTakeAwayOption()
    {
        TakeAwayOption.click();
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement PlaceOrderButton;
    public void CliciOnPlaceOrderButton()
    {
        PlaceOrderButton.click();
    }

    @FindBy(xpath = "//div[contains(@class,'row22')]//div[2]//div[1]//div[1]//div[1]//button[1]")
    WebElement upama;
    public void setUpamaOrder()
    {
        upama.click();
    }
    @FindBy(xpath = "//option[@value='dine-in']")
    WebElement Dine_In;
    public void ClickOnDine_In_Option()
    {
        Dine_In.click();
    }
}
