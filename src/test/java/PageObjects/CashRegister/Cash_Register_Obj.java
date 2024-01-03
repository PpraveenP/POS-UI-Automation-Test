package PageObjects.CashRegister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cash_Register_Obj {
    WebDriver ldriver;
    public Cash_Register_Obj(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//*[name()='path' and contains(@d,'M16 132h41')]")
    WebElement SideBar;
    public void ClickOnSideBar()
    {
        SideBar.click();
    }
    @FindBy(xpath = "//span[normalize-space()='Cash Register']")
    WebElement CashRegisteButton;
    public void ClickOnCashRegisterButton()
    {
        CashRegisteButton.click();
    }
    @FindBy(xpath = "//input[@name='addmoreamounts']")
    WebElement AddMoreAmount;
    public void setAddMoreAmount(String amount)
    {
        AddMoreAmount.sendKeys(amount);
    }
    @FindBy(xpath = "//i[@class='fa-solid fa-plus']")
    WebElement AddSymbol;
    public void ClickOnAddSymbolButton()
    {
        AddSymbol.click();
    }
    @FindBy(xpath = "//input[@name='expense']")
    WebElement ExpanceName;
    public void setExpanceName(String name)
    {
        ExpanceName.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='amount']")
    WebElement Amount;
    public void setAmount(String amount)
    {
        Amount.sendKeys(amount);
    }
    @FindBy(xpath = "//form[2]//div[1]//button[1]")
    WebElement SubmitButton;
    public void ClickOnSubmitButton()
    {
        SubmitButton.click();
    }
    @FindBy(xpath = "//input[@name='final_handed_over_to']")
    WebElement HandedOverName;
    public void setHandedOverName(String name)
    {
        HandedOverName.sendKeys(name);
    }
    @FindBy(xpath = "//input[@name='final_amount']")
    WebElement FinalAmount;
    public void setFinalAmount(String amount)
    {
        FinalAmount.sendKeys(amount);
    }

    @FindBy(xpath = "//form[3]//div[1]//button[1]")
    WebElement FinalAmountSubmitButton;
    public void ClickOnFinalAmountSubmitButton()
    {
        FinalAmountSubmitButton.click();
    }
    @FindBy(xpath = "//button[normalize-space()='Final']")
    WebElement SetUpFinalAmount;
    public void ClickOnSetUpFinalAmountButton()
    {
        SetUpFinalAmount.click();
    }



}
