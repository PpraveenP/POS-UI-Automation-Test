package PageObjects.ProfileSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Setting_Obj {
    WebDriver ldriver;
    public Payment_Setting_Obj(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//span[normalize-space()='Profile Settings']")
    WebElement ProfileSetting;
    public void ClickOnProfileSetting()
    {
        ProfileSetting.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Payment Setting']")
    WebElement PaymentSetting;
    public void ClickOnPaymentSetting()
    {
        PaymentSetting.click();
    }


    @FindBy(xpath = "//input[@name='bankName']")
    WebElement Bankname;
    public void setBankname(String name)
    {
        Bankname.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='branchName']")
    WebElement BranchName;
    public void setBranchName(String name)
    {

        BranchName.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='accountNo']")
    WebElement AccountNumber;
    public void setAccountNumber(String name)
    {

        AccountNumber.sendKeys(name);
    }
    @FindBy(xpath = "//input[@title='Please enter valid IFSC Code']")
    WebElement IFSCcode;
    public void setIFSCcode(String name)
    {

        IFSCcode.sendKeys(name);
    }

    @FindBy(xpath = "//input[@name='upiId']")
    WebElement UPIid;
    public void setUPIid(String name)
    {

        UPIid.sendKeys(name);
    }

    @FindBy(xpath = "(//button[normalize-space()='Add Payment Details'])[1]")
    WebElement AddPaymentDetails;
    public void ClickOnAddPaymentDetails( )
    {
        AddPaymentDetails.submit();
    }

}
