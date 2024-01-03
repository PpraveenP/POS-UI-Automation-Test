package PageObjects.ProfileSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pos_Setting_Obj {
    WebDriver ldriver;
    public Pos_Setting_Obj(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//span[normalize-space()='Profile Settings']")
    WebElement ProfileSetting;
    public void ClickOnProfileSetting()
    {
        ProfileSetting.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Pos Setting']")
    WebElement PosSetting;
    public void ClickOnPosSetting()
    {
        PosSetting.click();
    }


    @FindBy(xpath = "//input[@name='butName']")
    WebElement CategoryName;
    public void setCategoryName(String name)
    {
        CategoryName.sendKeys(name);
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Submitbutton;
    public void ClickOnSubmitButton()
    {

        Submitbutton.click();
    }

}
