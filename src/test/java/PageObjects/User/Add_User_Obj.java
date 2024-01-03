package PageObjects.User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_User_Obj {
    WebDriver ldriver;
    public Add_User_Obj(WebDriver rdriver)
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

    @FindBy(xpath = "//span[normalize-space()='User']")
    WebElement UserButton;
    public void ClickOnUserDropdownButton()
    {
        UserButton.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Add User']")
    WebElement AddUser;
    public void ClickOnAddUserButton()
    {
        AddUser.click();
    }
    @FindBy(xpath = "//input[@name='username']")
    WebElement UserName;
    public void setUserName(String name)
    {
        UserName.sendKeys(name);
    }
    @FindBy(xpath = "//input[@title='valid only for @gmail.com']")
    WebElement Email;
    public void setEmail(String name)
    {
        Email.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='contact']")
    WebElement Contact;
    public void setContact(String name)
    {
        Contact.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='address']")
    WebElement Address;
    public void setAddress(String name)
    {
        Address.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;
    public void setPassword(String name)
    {
        Password.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='comfirmpassword']")
    WebElement ConformPassword;
    public void setConformPassword(String name)
    {
        ConformPassword.sendKeys(name);
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement SubmitButton;
    public void ClickOnSubmitButton()
    {
        SubmitButton.click();
    }
}
