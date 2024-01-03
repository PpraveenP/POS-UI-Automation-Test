package PageObjects.AdminDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardObj {
    WebDriver ldriver;
   public DashboardObj(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);

    }
    @FindBy(xpath = "//i[@class='icon text-black mr-2 fa-solid fa-house-chimney']")
    WebElement DashboardButton;
   public void ClickonDashboardButton()
   {
       DashboardButton.click();
   }

   @FindBy(xpath = "//p[normalize-space()='New Order']")
    WebElement NewOrder;
   public void ClickonNewOrderButton()
   {
       NewOrder.click();
   }

   @FindBy(xpath = "//p[normalize-space()='Order List']")
    WebElement PendingOrderButton;
   public void ClickonPendingOrder()
   {
       PendingOrderButton.click();
   }

    @FindBy(xpath = "//p[normalize-space()='Order List']")
    WebElement OrderListButton;
    public void ClickonOrderListButton()
    {
        OrderListButton.click();
    }
    @FindBy(xpath = "//p[normalize-space()='Add Food']")
    WebElement AddFoodButton;
    public void ClickonAddFoodButton()
    {
        AddFoodButton.click();
    }
    @FindBy(xpath = "//p[normalize-space()='Reports']")
    WebElement ReportsButton;
    public void ClickonReportsButton()
    {
        ReportsButton.click();
    }
    @FindBy(xpath = "//p[normalize-space()='Add User']")
    WebElement AddUserButton;
    public void ClickonAddUserButton()
    {
        AddUserButton.click();
    }
    @FindBy(xpath = "//p[normalize-space()='Add Inventory']")
    WebElement AddInventoryButton;
    public void ClickonAddInventoryButton()
    {
        AddInventoryButton.click();
    }
    @FindBy(xpath = "//p[normalize-space()='Profile Setting']")
    WebElement ProfileSettingButton;
    public void ClickonProfileSettingButton()
    {
        ProfileSettingButton.click();
    }

}
