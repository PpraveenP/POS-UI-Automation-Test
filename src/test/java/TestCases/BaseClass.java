package TestCases;
import PageObjects.Logins.Admin;
import Utilities.ExternalReportManager;
import Utilities.ReadConfiger;
import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class BaseClass extends ExternalReportManager {

    ReadConfiger rc=new ReadConfiger();
    public String baseURL=rc.getURL();
    public static WebDriver driver;
   public static Faker fk=new Faker();

    @Parameters("browser")
    @BeforeClass
    public void setup(String br)
    {

        if (br.equals("firefox"))
        {
            System.setProperty("webdriver.geco.driver", rc.getfirefox());
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        if (br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",rc.getchrome());
            driver=new ChromeDriver();
            driver.manage().window().maximize();
        }
        if (br.equals("ie"))
        {
            System.setProperty("webdriver.ie.driver","./Driver/internetexplorer.exe");
            driver=new InternetExplorerDriver();
            driver.manage().window().maximize();
        }
    }
    public WebDriver AdminLogin() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        Admin ad=new Admin(driver);
//        ad.ClickOn_LoginDropdown();
//        ad.Clickon_AdminBtn();
        ad.ClickOnLogin_Button();
        ad.setUsername(rc.getUserName());
        ad.setPassword(rc.getpassword());
        ad.ClickonLoginButton();
        Thread.sleep(2000);
        ad.ClickonSideBarButton();
        return driver;
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Admin ad=new Admin(driver);
        ad.ClickOn_LogoutDropdown();
        ad.ClickOnLogout();
        driver.quit();
    }


//    public void captureScreen(WebDriver rdriver, String tname ) throws IOException {
//        TakesScreenshot ts = (TakesScreenshot) rdriver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File target = new File(".//Screenshot//" + tname + ".png");
//        FileUtils.copyFile(source, target);
//        System.out.println("Screenshot teken");
//
//        FileInputStream fi = new FileInputStream(".//ScreenShot//" + tname + ".png");
//        byte[] ssbyts = IOUtils.toByteArray(fi);
//        String bse64 = Base64.getEncoder().encodeToString(ssbyts);
//        test.log(Status.FAIL,test.addScreenCaptureFromBase64String("date:image/png;base64")+bse64);
//    }

//    public void captureScreen(WebDriver rdriver, String tname) throws IOException {
//        TakesScreenshot ts = (TakesScreenshot) rdriver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File target = new File(".//Screenshot//" + tname + ".png");
//        FileUtils.copyFile(source, target);
//        System.out.println("Screenshot taken");
//
//        FileInputStream fi = new FileInputStream(".//Screenshot//" + tname + ".png");
//        byte[] ssBytes = IOUtils.toByteArray(fi);
//        String base64 = Base64.getEncoder().encodeToString(ssBytes);
//        test.log(Status.FAIL, "Test failed. Here is the screenshot: " +
//                test.addScreenCaptureFromBase64String("data:image/png;base64," + base64));
//    }

//    public void captureScreen(WebDriver rdriver, String tname) {
//        try {
//            TakesScreenshot ts = (TakesScreenshot) rdriver;
//            File source = ts.getScreenshotAs(OutputType.FILE);
//            File target = new File(".//Screenshot//" + tname + ".png");
//            FileUtils.copyFile(source, target);
//            System.out.println("Screenshot taken");
//
//            FileInputStream fi = new FileInputStream(".//Screenshot//" + tname + ".png");
//            byte[] ssBytes = IOUtils.toByteArray(fi);
//            String base64 = Base64.getEncoder().encodeToString(ssBytes);
//
//            // Make sure 'test' is not null before using it
//            if (test != null) {
//                test.log(Status.FAIL, "Test failed. Here is the screenshot: " +
//                        test.addScreenCaptureFromBase64String("data:image/png;base64," + base64));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            // Handle the exception according to your application's needs
//        }
//    }


}
