package TestCases.RolePermission;

import PageObjects.RolePermission.UserRoleAccess_Obj;
import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class User_Role_Access extends BaseClass {
  @Test()
    public void validating_User_Role_Access() throws InterruptedException {
      AdminLogin();
      UserRoleAccess_Obj ur=new UserRoleAccess_Obj(driver);
      ur.ClickOnRolePermition();
      ur.ClickOnUserRoleAccess();

      WebElement list = driver.findElement(By.xpath("//select[@name='username']"));
      Select s=new Select(list);
      List<WebElement> all = s.getOptions();
      int count = all.size();
      s.getOptions().get(count-1).click();
//      Thread.sleep(5000);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      ur.ClickOnDasboard();
    Thread.sleep(2000);
      ur.ClickOnCashregister();
      ur.ClickOnSales();
      ur.ClickOnInventory();
      ur.ClickOnParchage();
    Thread.sleep(2000);
      ur.ClickOnFoodmanagement();
      ur.ClickOnReports();
      ur.ClickOnUser();
//      ur.ClickOnRolePermition();
      ur.ClickOnProfileSetting();
    ur.ClickOnSubmitbutton();
    Thread.sleep(2000);

  }
}
