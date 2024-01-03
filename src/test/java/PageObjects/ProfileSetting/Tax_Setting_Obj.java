package PageObjects.ProfileSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tax_Setting_Obj {

WebDriver ldriver;
    public Tax_Setting_Obj(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//span[normalize-space()='Profile Settings']")
    WebElement ProfileSetting;
    public void ClickOnProfileSetting()
    {
        ProfileSetting.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Tax Setting']")
    WebElement TsxSetting;
    public void ClickOnTsxSetting()
    {
        TsxSetting.click();
    }


    @FindBy(xpath = "//button[normalize-space()='Add Tax']")
    WebElement AddTaxButton;
    public void ClickOnAddTaxButton()
    {
        AddTaxButton.click();
    }
    @FindBy(xpath = "//input[@placeholder='Ex. CGST, SGST']")
    WebElement TaxName;
    public void setTaxName(String name)
    {

        TaxName.sendKeys(name);
    }
    @FindBy(xpath = "//input[@placeholder='Ex. 18%']")
    WebElement TaxRate;
    public void setTaxRate(String name) {
        TaxRate.sendKeys(name);
    }
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement SubmitButton;
    public void ClickOnSubmitButton()
    {
        SubmitButton.click();
    }
}

