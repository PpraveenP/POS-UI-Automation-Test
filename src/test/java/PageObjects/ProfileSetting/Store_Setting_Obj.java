package PageObjects.ProfileSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Store_Setting_Obj {
    WebDriver ldriver;
    public Store_Setting_Obj(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Profile Settings']")
    WebElement ProfileSetting;
    public void ClickOnProfileSetting()
    {
        ProfileSetting.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Store Setting']")
    WebElement StoreSetting;
    public void ClickOnStoreSetting()
    {
        StoreSetting.click();
    }
    @FindBy(xpath = "//input[@name='store_name']")
    WebElement StoreName;
    public void setStoreName(String name)
    {
        StoreName.sendKeys(name);
    }
    @FindBy(xpath = "//input[@title='length must be between 3 to 20']")
    WebElement UserName;
    public void setUserName(String name)
    {
        UserName.clear();
        UserName.sendKeys(name);
    }
    @FindBy(xpath = "//input[@title='Please enter a valid Gmail address']")
    WebElement StoreEmail;
    public void setStoreEmail(String name)
    {
        StoreEmail.clear();
        StoreEmail.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='saddress']")
    WebElement StoreAddress;
    public void setStoreAddress(String name)
    {
        StoreAddress.clear();
        StoreAddress.sendKeys(name);
    }

    @FindBy(xpath = "//input[@name='contact']")
    WebElement StoreContact;
    public void setStoreContact(String name)
    {
        StoreContact.clear();
        StoreContact.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='logo']")
    WebElement StoreImage;
    public void setStoreImage(String name)
    {
        StoreImage.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='gstno']")
    WebElement StoreGstNumber;
    public void setStoreGstNumber(String name)
    {
        StoreGstNumber.clear();
        StoreGstNumber.sendKeys(name);
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SubmitBuuton;
    public void ClickOnUpdatetButton( )
    {
        SubmitBuuton.click();
    }
}
