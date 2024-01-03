package PageObjects.FoodManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Menu_Obj {
    WebDriver ldriver;
    public Add_Menu_Obj(WebDriver rdriver)
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

    @FindBy(xpath = "//span[normalize-space()='Food Management']")
    WebElement FoodManagement;
    public void ClickOnFoodManagementDropdown()
    {
        FoodManagement.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Add Menu']")
    WebElement AddMenuButton;
    public void ClickOnAddMenuButton()
    {
        AddMenuButton.click();
    }

    @FindBy(xpath = "//input[@name='food_name']")
    WebElement FoodName;
    public void setFoodName(String foodName)
    {
        FoodName.sendKeys(foodName);
    }

    @FindBy(xpath = "//input[@name='foodcode']")
    WebElement FoodCode;
    public void setFoodCode(String foodCode)
    {
        FoodCode.sendKeys(foodCode);
    }

    @FindBy(xpath = "//input[@name='price']")
    WebElement Price;
    public void setPrice(String price)
    {
        Price.sendKeys(price);
    }

    @FindBy(xpath = "//select[@name='category']")
    WebElement SelectCategory;
    public void ClickOnSelectCategory()
    {
        SelectCategory.click();
    }

    @FindBy(xpath = "//option[@value='Indian']")
    WebElement Option1;
    public void ClickOnIndianOption()
    {
        Option1.click();
    }

    @FindBy(xpath = "//select[@name='subcategory']")
    WebElement SubCategory;
    public void ClickOnSubCategory()
    {
        SubCategory.click();
    }

    @FindBy(xpath = "//option[@value='South Indian']")
    WebElement option2;
    public void ClickOnOption2()
    {
        option2.click();
    }

    @FindBy(xpath = "//input[@name='description']")
    WebElement Description;
    public void setDescription(String description)
    {
        Description.sendKeys(description);
    }

    @FindBy(xpath = "//input[@name='image']")
    WebElement ChoseFile;
    public void setfoodImage(String image)
    {
        ChoseFile.sendKeys(image);
    }

    @FindBy(xpath = "//button[normalize-space()='Image']")
    WebElement Image;
    public void selectImage()
    {
        Image.click();
    }

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement CheckBox;
    public void ClickOnCheckBoxButton()
    {
        CheckBox.click();
    }

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement SubmitButton;
    public void ClickOnSubmitButton()
    {
        SubmitButton.click();
    }

}
