package PageObjects.Logins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {

    WebDriver ldriver;
    public Admin(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//a[normalize-space()='Admin Login']")
    @CacheLookup
    WebElement adminloginbtn;
    public void Clickon_AdminBtn()
    {
        adminloginbtn.click();
    }

    @FindBy(xpath = "//button[@id='dropdownMenuButton']")
    @CacheLookup
    WebElement DropdownBtn;
    public void ClickOn_LoginDropdown()
    {
        DropdownBtn.click();
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    @CacheLookup
    WebElement Username;
    public void setUsername(String username)
    {
        Username.sendKeys(username);
    }

    @FindBy(xpath = "//input[@placeholder='Password']")
    @CacheLookup
    WebElement Password;
    public void setPassword(String password)
    {
        Password.sendKeys(password);
    }

    @FindBy(xpath = "//span[normalize-space()='Log In']")
    @CacheLookup
    WebElement LoginButton;
    public void ClickonLoginButton()
    {
        LoginButton.click();
    }

    @FindBy(xpath = "//i[@class='fa-solid fa-circle-user fa-lg mr-1']")
    @CacheLookup
    WebElement LogoutDropdown;
    public void ClickOn_LogoutDropdown()
    {
        LogoutDropdown.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Logout here']")
    @CacheLookup
    WebElement LogoutButton;
    public void ClickOnLogout()
    {
        LogoutButton.click();
    }

    @FindBy(xpath = "//*[name()='path' and contains(@d,'M16 132h41')]")
    @CacheLookup
    WebElement SideBarbutton;
    public void ClickonSideBarButton()
    {
        SideBarbutton.click();
    }
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    public void ClickOnLogin_Button()
    {
        loginButton.click();
    }
}
