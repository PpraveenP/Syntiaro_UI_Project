package Test_Cases;
import Utilities.ExternalReportManager;
import Utilities.ReadConfiger;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;


public class BaseClass  {

    ReadConfiger rc=new ReadConfiger();
    public String baseURL=rc.getURL();
    public static WebDriver driver;

    ExtentReports extent=new ExtentReports();
    ExtentSparkReporter spark=new ExtentSparkReporter("target/spark.html");
//    WebDriver driver;


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
    public void tear_Down()
    {
        driver.quit();
    }


    @BeforeTest()
    public void setReport()
    {
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("MyReport");
        extent.attachReporter(spark);
//        Object WebDriverManager;
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("https://www.google.com");

    }
    @AfterTest()
    public void tearDown()
    {
        extent.flush();
    }

//    @Test()
//    public void  test1()
//    {
//        ExtentTest test = extent.createTest("verify the page title").assignAuthor("praveen").assignCategory("functional test cases").assignDevice("windows");
//        test.info("i am capturing the page title");
//        String pagetitle=driver.getTitle();
//        test.info(pagetitle);
//        if (pagetitle.equals("gogle"))
//        {
//            test.pass(pagetitle);
//        }
//        else
//        {
//            test.fail(pagetitle);
//            test.addScreenCaptureFromPath(captereScreenshot(driver));
//        }
//    }
    public static String captureScreen(WebDriver driver,String name)
    {
        File sourcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationpath=new File("src/../images/screenshot"+System.currentTimeMillis()+".png");
        String absolutpath=destinationpath.getAbsolutePath();
        return absolutpath;
    }
}