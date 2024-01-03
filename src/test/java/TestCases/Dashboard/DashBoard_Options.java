package TestCases.Dashboard;

import PageObjects.AdminDashboard.DashboardObj;
import TestCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DashBoard_Options extends BaseClass {
    WebDriver ad;
    @Test(priority = 1)
    public void validating_DashboardButton() throws InterruptedException
    {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        DashboardObj db=new DashboardObj(driver);
//        db.ClickonDashboardButton();


    }
    @Test(priority = 2)
    public void validating_New_Order_Button () throws InterruptedException {
        AdminLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DashboardObj db=new DashboardObj(driver);
        db.ClickonNewOrderButton();
        driver.switchTo().parentFrame();
    }
    @Test(priority = 3)
    public void validating_Pending_Order() throws InterruptedException {
//        AdminLogin();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        DashboardObj db=new DashboardObj(driver);
//        db.ClickonPendingOrder();
//        driver.switchTo().parentFrame();

    }

}
