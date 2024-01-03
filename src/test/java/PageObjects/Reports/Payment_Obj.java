package PageObjects.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Obj {
    WebDriver ldriver;
    public Payment_Obj(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Reports']")
    WebElement ReportsButton;
    public void ClickOnReportsButton()
    {
        ReportsButton.click();
    }
    @FindBy(xpath = "//span[normalize-space()='Payment']")
    WebElement PaymentButton;
    public void ClickOnPaymentButton()
    {
        PaymentButton.click();
    }


    @FindBy(xpath ="//button[@type='submit']")
    WebElement Submit;
    public void ClickOnSubmitButton()
    {
        Submit.click();
    }
}
