package PageObjects.Purchase;

import org.apache.poi.sl.draw.geom.GuideIf;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendor_Payment_Obj {
    WebDriver ldriver;
    public Vendor_Payment_Obj(WebDriver rdriver)
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

    @FindBy(xpath = "//span[normalize-space()='Vendor Payment']")
    WebElement VendorPayment;
    public void ClickOnVendorPaymentButton()
    {
        VendorPayment.click();
    }

    @FindBy(xpath = "//select[@name='vendor_name']")
    WebElement VendorName;
    public void ClickOnSelectVendorNameDropdown()
    {
        VendorName.click();
    }
    @FindBy(xpath = "//option[@value='Walker']")
    WebElement Option1;
    public void ClickOnOption1()
    {
        Option1.click();
    }

    @FindBy(xpath = "//input[@name='due_date']")
    WebElement Date;
    public void setDueDate(String date)
    {
        Date.click();
        Date.sendKeys(date);
    }

    @FindBy(xpath = "//input[@name='bank_name']")
    WebElement BankName;
    public void setBankName(String bankName)
    {
        BankName.sendKeys(bankName);
    }

    @FindBy(xpath = "//input[@name='branch']")
    WebElement BranchName;
    public void setBranchName(String branchName)
    {
        BranchName.sendKeys(branchName);
    }

    @FindBy(xpath = "//input[@name='account_no']")
    WebElement AccountNumber;
    public void setAccountNumber(String accountNumber)
    {
        AccountNumber.sendKeys(accountNumber);
    }

    @FindBy(xpath = "//input[@title='Please enter valid IFSC Code']")
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
