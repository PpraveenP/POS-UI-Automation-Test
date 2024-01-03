package TestCases.Logins;

import PageObjects.Logins.Admin;
import TestCases.BaseClass;
import Utilities.ReadConfiger;
import org.testng.annotations.Test;

public class AdminLogin extends BaseClass {

    @Test(priority = 1)
    public void Validating_Admin_Login() throws InterruptedException
    {
       AdminLogin();


    }
    @Test(priority = 2)
    public void validating_Admin_Logout() throws InterruptedException {

    }
}
