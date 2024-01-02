package Test_Cases;

import Utilities.ExternalReportManager;
import Utilities.ReadConfiger;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
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
import java.io.IOException;

public class Base_Class1 extends ExternalReportManager {

    ReadConfiger rc = new ReadConfiger();
    public String baseURL = rc.getURL();
    public static WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br) {
        // Ensure onStart method is called to initialize extent object
        onStart(null);

        if (br.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", rc.getfirefox());
            driver = new FirefoxDriver();
        } else if (br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", rc.getchrome());
            driver = new ChromeDriver();
        } else if (br.equals("ie")) {
            System.setProperty("webdriver.ie.driver", "./Driver/internetexplorer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void captureScreen(WebDriver rdriver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) rdriver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(".//Screenshot//" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");

        // Log the screenshot in the extent report
        logScreenshot(tname, target);
    }

    private void logScreenshot(String tname, File target) {
    }

    // ... rest of your code
}
