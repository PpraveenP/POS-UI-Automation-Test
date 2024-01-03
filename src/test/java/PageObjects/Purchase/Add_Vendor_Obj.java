package PageObjects.Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Vendor_Obj {
    WebDriver ldriver;

    public Add_Vendor_Obj(WebDriver rdriver)
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

    @FindBy(xpath = "//span[normalize-space()='Add Vendor']")
    WebElement AddVendorButton;

    public void ClickOnAddVendorButton()
    {
        AddVendorButton.click();
    }

    @FindBy(xpath = "//input[@name='vendor_name']")
    WebElement VendorName;
    public void setVendorName(String vendorName)
    {
        VendorName.sendKeys(vendorName);
    }

    @FindBy(xpath = "//input[@name='vendor_code']")
    WebElement VendorCode;
    public void setVendorCode(String vendorCode)
    {
        VendorCode.sendKeys(vendorCode);
    }

    @FindBy(xpath = "//input[@name='vendor_address']")
    WebElement VendorAddress;
    public void setVendorAddress(String vendorAddress)
    {
        VendorAddress.sendKeys(vendorAddress);
    }

    @FindBy(xpath = "//input[@title='Must contain at least 13 digits']")
    WebElement MobileNumber;
    public void setMobileNumber(String mobileNumber)
    {
        MobileNumber.sendKeys(mobileNumber);
    }

    @FindBy(xpath = "//input[@name='bank_name']")
    WebElement BankName;
    public void setBankName(String bankName)
    {
        BankName.sendKeys(bankName);
    }

    @FindBy(xpath = "//input[@name='branch']")
    WebElement Branch;
    public void setBranch(String branch)
    {
        Branch.sendKeys(branch);
    }

    @FindBy(xpath = "//input[@title='Please enter valid account number']")
    WebElement AccountNumber;
    public void setAccountNumber(String accountNumber)
    {
        AccountNumber.sendKeys(accountNumber);
    }

    @FindBy(xpath = "//input[@name='ifsc_code']")
    WebElement IFSCcode;
    public void setIFSCcode(String ifsCcode)
    {
        IFSCcode.sendKeys(ifsCcode);
    }

    @FindBy(xpath = "//input[@title='Please enter valid UPI ID']")
    WebElement UPIid;
    public void setUPIid(String upIid)
    {
        UPIid.sendKeys(upIid);
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement SubmitButton;
    public void ClickOnSubmitButton()
    {
        SubmitButton.click();
    }
}
