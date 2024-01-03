package PageObjects.Logins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdmin {

    WebDriver ldriver;
    public SuperAdmin(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//a[normalize-space()='Super Admin Login']")
    @CacheLookup
    WebElement superloginbtn;

    @FindBy(xpath = "//button[@id='dropdownMenuButton']")
    @CacheLookup
    WebElement DropdownBtn;

}
