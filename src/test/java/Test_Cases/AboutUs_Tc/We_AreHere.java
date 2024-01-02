package Test_Cases.AboutUs_Tc;

import Page_Object.About_Us.We_Are_Here;
import Test_Cases.BaseClass;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class We_AreHere extends BaseClass {

    public void Validate(String page,String name) throws IOException {
        if(page=="404 - Not Found")
        {
            captureScreen(driver,name);
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
    }
    @Test()
    public void validating_About_Us_Link() throws IOException {
        driver.get(baseURL);
        We_Are_Here wh=new We_Are_Here(driver);
        wh.ClickOnAboutUSButton();
        Validate(driver.getTitle(),"validating_About_Us_Link");

    }

    @Test()
    public void validating_We_Are_Here_Link() throws InterruptedException, IOException {
        driver.get(baseURL);
        We_Are_Here wh=new We_Are_Here(driver);
        Actions as = new Actions(driver);
        as.moveToElement(wh.ClickOnAboutUSButton()).perform();
        wh.ClickOnWeAreHereButton_();
        Validate(driver.getTitle(),"validating_We_Are_Here_Link");
    }
    @Test()
    public void validating_RestaurantPOS_Link() throws InterruptedException, IOException {

        driver.get(baseURL);
        We_Are_Here wh=new We_Are_Here(driver);
        Actions as = new Actions(driver);
        as.moveToElement(wh.ClickOnAboutUSButton()).perform();
        wh.ClickOnWeAreHereButton_();
        wh.ClickOnResaurantButton();
        Validate(driver.getTitle(),"validating_RestaurantPOS_Link");
    }

    @Test()
    public void validating_Travel_Agency_Link() throws IOException {
        driver.get(baseURL);
        We_Are_Here wh=new We_Are_Here(driver);
        Actions as = new Actions(driver);
        as.moveToElement(wh.ClickOnAboutUSButton()).perform();
        wh.ClickOnWeAreHereButton_();
        wh.ClickOnTravelAgencyButton();
        Validate(driver.getTitle(),"validating_Travel_Agency_Link");
    }
    @Test()
    public void validating_CRM_Link() throws IOException {
        driver.get(baseURL);
        We_Are_Here wh=new We_Are_Here(driver);
        Actions as = new Actions(driver);
        as.moveToElement(wh.ClickOnAboutUSButton()).perform();
        wh.ClickOnWeAreHereButton_();
        wh.ClickOnCRMsoftwareButton();
        Validate(driver.getTitle(),"validating_CRM_Link");
    }
    @Test()
    public void validting_ERP_Software_link() throws IOException {
        driver.get(baseURL);
        We_Are_Here wh=new We_Are_Here(driver);
        Actions as = new Actions(driver);
        as.moveToElement(wh.ClickOnAboutUSButton()).perform();
        wh.ClickOnWeAreHereButton_();
        wh.ClickOnERPsoftwareButton();
        Validate(driver.getTitle(),"validting_ERP_Software_link");
    }
    @Test()
    public void validating_Vision_Link() throws IOException {
        driver.get(baseURL);
        We_Are_Here wh=new We_Are_Here(driver);
        Actions as = new Actions(driver);
        as.moveToElement(wh.ClickOnAboutUSButton()).perform();
        wh.ClickOnVisionButton();
        Validate(driver.getTitle(),"validating_Vision_Link");
    }


}
