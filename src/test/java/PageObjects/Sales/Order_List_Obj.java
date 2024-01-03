package PageObjects.Sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_List_Obj {
    WebDriver ldriver;
    public Order_List_Obj(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Sales']")
    WebElement SalesButton;
    public void ClickOnSalesDropdown()
    {
        SalesButton.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Order List']")
    WebElement OrderListButton;
    public void ClickOnOrderListButton()
    {
        OrderListButton.click();
    }


//    @FindBy(xpath = "(//button)[9]")
//    WebElement PrintButton;
//    public void ClickOnPrintButton()
//    {
//        PrintButton.click();
//    }
//    @FindBy(xpath = "//option[normalize-space()='Thai curry']")
//    WebElement PrintBuuton1;
//    public void ClickOnPrintBuuton1()
//    {
//        PrintBuuton1.click();
//    }

    @FindBy(xpath = "//option[normalize-space()='Select payment mode']")
    WebElement SelectPaymentMode;
    public void ClickonSelectPaymentMode()
    {
        SelectPaymentMode.click();
    }

    @FindBy(xpath = "//option[@value='cash']")
    WebElement CashOption;
    public void ClickOnCashOption()
    {
        CashOption.click();
    }

    @FindBy(xpath = "//input[@placeholder='Enter Contact number']")
    WebElement ContactNyumber;
    public void setContactNyumber(String number)
    {
        ContactNyumber.sendKeys(number);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/a[3]/button[1]")
    WebElement PrintButton;
    public void ClickOnPrintButton()
    {
        PrintButton.click();
    }
    @FindBy(xpath = "//a[@href='/overView/order_list']")
    WebElement OrderList2Button;
    public void ClickOnOrderList2Button()
    {
        OrderList2Button.click();
    }
    @FindBy(xpath = "//*[name()='path' and contains(@d,'M16 132h41')]")
    @CacheLookup
    WebElement SideBarbutton;
    public void ClickonSideBarButton()
    {
        SideBarbutton.click();
    }

}
