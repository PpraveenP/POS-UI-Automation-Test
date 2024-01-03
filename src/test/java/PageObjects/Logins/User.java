package PageObjects.Logins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User {
WebDriver ldriver;
public User(WebDriver rdriver)
{
    ldriver=rdriver;
    PageFactory.initElements(rdriver,this);
}

}
