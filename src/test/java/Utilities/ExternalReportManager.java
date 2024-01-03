package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class ExternalReportManager implements ITestListener {

    public ExtentSparkReporter sparkRepoter;
    public ExtentReports extent;
    public ExtentTest test;

    String repName;

    public void onStart(ITestContext testContext)
    {
        String timeStamp=new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date()); //time Stamp
        repName="Test_Report-"+timeStamp+".html";

        sparkRepoter=new ExtentSparkReporter(".//Reports//"+repName); //specify the location of the file

        sparkRepoter.config().setDocumentTitle("POS-Testing"); //title of the report
        sparkRepoter.config().setReportName("POS Indian server demo"); //name of report
        sparkRepoter.config().setTheme(Theme.DARK);

        extent=new ExtentReports();
        extent.attachReporter(sparkRepoter);
        extent.setSystemInfo("Application","POS Indian server demo ");
        extent.setSystemInfo("Operating System",System.getProperty("os.name"));
        extent.setSystemInfo("User Name",System.getProperty("user.name"));
        extent.setSystemInfo("Environment Name","QA");
        extent.setSystemInfo("User","Praveen");

    }

    public void onTestSuccess(ITestResult result)
    {
        test=extent.createTest(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.createNode(result.getName());
        test.log(Status.PASS,"Test Passed");


    }

    public void onTestFailure(ITestResult result)
    {
        test=extent.createTest(result.getName());
        test.createNode(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.FAIL,"Test Failed");
        test.log(Status.FAIL,result.getThrowable().getMessage());




    }

    public void onTestSkipped(ITestResult result)
    {
        test=extent.createTest(result.getName());
        test.createNode(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.SKIP,"Test Skipped");
        test.log(Status.SKIP,result.getThrowable().getMessage());

    }
    public void captureScreen(WebDriver rdriver, String tname) throws IOException {




            TakesScreenshot ts = (TakesScreenshot) rdriver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File target = new File(".//Screenshot//" + tname + ".png");
            FileUtils.copyFile(source, target);
            System.out.println("Screenshot taken. Path: " + target.getAbsolutePath());

        String absolutePath = new File(".//Screenshot//" + tname + ".png").getAbsolutePath();
        test.log(Status.FAIL, "Test failed. Here is the screenshot: " +
                test.addScreenCaptureFromBase64String("data:image/png;base64," + absolutePath));

            FileInputStream fi = new FileInputStream(target);
            byte[] ssBytes = IOUtils.toByteArray(fi);
            String base64 = Base64.getEncoder().encodeToString(ssBytes);

            // Make sure 'test' is not null before using it
            if (test != null) {
                test.log(Status.FAIL, "Test failed. Here is the screenshot: " +
                        test.addScreenCaptureFromBase64String("data:image/png;base64," + base64));
            } else {
                System.out.println("ExtentTest object is null. Make sure it is properly initialized.");
            }
        }



    public void onFinish(ITestContext testContext)
    {
        extent.flush();
        try {
            Desktop.getDesktop().browse(new File("report.html").toURI());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}


