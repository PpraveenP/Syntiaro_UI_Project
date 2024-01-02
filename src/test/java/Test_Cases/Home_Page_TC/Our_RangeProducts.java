package Test_Cases.Home_Page_TC;

import Page_Object.Home.Our_Rage_Products;
import Test_Cases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Our_RangeProducts extends BaseClass {

    @Test(priority = 1)
    public void validatingRestaurantManagemt() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickRestaurantmanagement();

        String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingRestaurantManagemt");
            Assert.assertTrue(false);
        }
        else
        {
          Assert.assertTrue(true);
        }

    }
     @Test(priority = 2)
    public void validatingTravelmanagement() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickTravelmanagement();

         String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingTravelmanagement");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 3)
    public void validatingSchoolCRM() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickschoolCRM();

        String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingSchoolCRM");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 4)
    public void validatingConstruction() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickConstruction();

        String title=driver.getTitle();
        if(driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingConstruction");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 5)
    public void validatingHealthCare() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickhealthcare();

        String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingHealthCare");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }
   @Test(priority = 6)
    public void validatingAgriculture() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickAgricuture();

       String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingAgriculture");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 7)
    public void validatingBanking() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickBanking();

        String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingBanking");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 8)
    public void validatingRealEstate() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickRealEstate();

        String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingRealEstate");
            Assert.assertTrue(false);
        }
        else
        {
           Assert.assertTrue(true);
        }
    }
    @Test(priority = 9)
    public void validatingERPsoftwareDevelopment() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.cickERPsoftwareDevelopment();

        String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingERPsoftwareDevelopment");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }

    @Test(priority = 10)
    public void validatingLeadManagement() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickLaeadManagement();

        String title=driver.getTitle();
        if(driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingLeadManagement");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 11)
    public void validatingmanufacturing() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickManufacturing();

        String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingmanufacturing");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }
    @Test(priority = 12)
    public void validatingWebDevelopment() throws InterruptedException, IOException {
        driver.get(baseURL);
        Our_Rage_Products rp=new Our_Rage_Products(driver);
        rp.clickWebDevelopment();

        String title=driver.getTitle();
        if (driver.getTitle().contains("404 - Not Found"))
        {
            captureScreen(driver,"validatingWebDevelopment");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }


}
