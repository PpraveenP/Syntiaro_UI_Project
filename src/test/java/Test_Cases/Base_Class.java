package Test_Cases;
import Utilities.ExternalReportManager;
import Utilities.ReadConfiger;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;


public class Base_Class extends ExternalReportManager {

    ReadConfiger rc=new ReadConfiger();
    public String baseURL=rc.getURL();
    public static WebDriver driver;

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

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }


//    public void captureScreen(WebDriver rdriver, String tname ) throws IOException {
//        TakesScreenshot ts = (TakesScreenshot) rdriver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File target = new File(".//Screenshot//" + tname + ".png");
//        FileUtils.copyFile(source, target);
//        System.out.println("Screenshot teken");

    //        FileInputStream fi = new FileInputStream(".//Screenshot//" + tname + ".png");
//        byte[] ssbyts = IOUtils.toByteArray(fi);
//        String bse64 = Base64.getEncoder().encodeToString(ssbyts);
    //test.log(Status.FAIL,test.addScreenCaptureFromBase64String("date:image/png;base64")+bse64);
//    }
    public void captureScreen(WebDriver rdriver, String tname ) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) rdriver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(".//Screenshot//" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot teken");


        ExtentReports extentReports = new ExtentReports();
        File file = new File("report.html");
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
        extentReports.attachReporter(sparkReporter);
        extentReports
                .createTest("screen shot test 1", "this in iformation ").info("this is info mesg")
                .addScreenCaptureFromPath(target.getAbsolutePath());
        extentReports.flush();
        Desktop.getDesktop().browse(new File("report.html").toURI());

    }

}
