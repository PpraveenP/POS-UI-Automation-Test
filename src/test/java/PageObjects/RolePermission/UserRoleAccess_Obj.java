package PageObjects.RolePermission;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRoleAccess_Obj {
    WebDriver ldrivre;
    public UserRoleAccess_Obj(WebDriver rdriver)
    {
        ldrivre=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Role Permission']")
    WebElement RolePermition;
    public void ClickOnRolePermition()
    {
        RolePermition.click();
    }
    @FindBy(xpath = "//span[normalize-space()='User Role Access']")
    WebElement UserRoleAccess;
    public void ClickOnUserRoleAccess()
    {
        UserRoleAccess.click();
    }
    @FindBy(xpath = "//h5[normalize-space()='Dashboard']//input[@type='checkbox']")
    WebElement Dasboard;
    public void ClickOnDasboard()
    {
        Dasboard.click();
    }
    @FindBy(xpath = "//h5[normalize-space()='Cash Register']//input[@type='checkbox']")
    WebElement Cashregister;
    public void ClickOnCashregister()
    {
        Cashregister.click();
    }
    @FindBy(xpath = "//h5[normalize-space()='Sales']//input[@type='checkbox']")
    WebElement Sales;
    public void ClickOnSales()
    {
        Sales.click();
    }
    @FindBy(xpath = "//h5[normalize-space()='Inventory']//input[@type='checkbox']")
    WebElement Inventory;
    public void ClickOnInventory()
    {
        Inventory.click();
    }
    @FindBy(xpath = "//h5[normalize-space()='Purchase']//input[@type='checkbox']")
    WebElement Parchage;
    public void ClickOnParchage()
    {
        Parchage.click();
    }
    @FindBy(xpath = "//h5[normalize-space()='Food Management']//input[@type='checkbox']")
    WebElement Foodmanagement;
    public void ClickOnFoodmanagement()
    {
        Foodmanagement.submit();
    }
    @FindBy(xpath = "//h5[normalize-space()='Reports']//input[@type='checkbox']")
    WebElement Reports;
    public void ClickOnReports()
    {
        Reports.submit();
    }
    @FindBy(xpath = "//h5[normalize-space()='User']//input[@type='checkbox']")
    WebElement User;
    public void ClickOnUser()
    {
        User.submit();
    }
    @FindBy(xpath = "//h5[normalize-space()='Role Permission']//input[@type='checkbox']")
    WebElement RolePermition1;
    public void ClickOnRolePermition1()
    {
        RolePermition1.submit();
    }
    @FindBy(xpath = "//h5[normalize-space()='Profile Settings']//input[@type='checkbox']")
    WebElement ProfileSetting;
    public void ClickOnProfileSetting()
    {
        ProfileSetting.submit();
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Submitbutton;
    public void ClickOnSubmitbutton()
    {
        Submitbutton.submit();
    }

}
