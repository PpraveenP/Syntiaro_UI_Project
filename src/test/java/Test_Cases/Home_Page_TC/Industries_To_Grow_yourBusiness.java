//package Test_Cases.Home_Page_TC;
//
//import Page_Object.Home.Industries_To_Grow_Your_Business;
//import Test_Cases.BaseClass;
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//
//public class Industries_To_Grow_yourBusiness extends BaseClass {
//
//    public Industries_To_Grow_Your_Business  movemouse() throws InterruptedException {
//        driver.get(baseURL);
//        Industries_To_Grow_Your_Business ib=new Industries_To_Grow_Your_Business(driver);
//        Thread.sleep(3000);
//        return ib;
//    }
//    public void validate(boolean page,String name) throws IOException {
//        if(page)
//        {
//            Assert.assertTrue(true);
//        }
//        else
//        {
//            captureScreen(driver,name);
//            Assert.assertTrue(false);
//        }
//    }
//
//    @Test(priority = 1)
//    public void validating_Restaurant_Management_POS_Software_Link() throws InterruptedException, IOException {
//        Industries_To_Grow_Your_Business ib = movemouse();
//        ib.MoveMouseOnRestaurant_Management_POS_Software_Link();
//        boolean page=driver.getPageSource().contains("Restaurant Management POS Software");
//        validate(page,"validating_Restaurant_Management_POS_Software_Link");
//       // Thread.sleep(5000);
//    }
//    @Test(priority = 2)
//    public void validating_RetailShop_Management_POS_Link() throws InterruptedException, IOException {
//        Industries_To_Grow_Your_Business ib = movemouse();
//        ib.MoveMouseOnShop_Management_POS_Link();
//        //Thread.sleep(10000);
//        boolean page=driver.getPageSource().contains("RETAIL SHOP MANAGEMENT POS SOFTWARE");
//        validate(page,"validating_RetailShop_Management_POS_Link");
//
//    }
//    @Test(priority = 3)
//    public void validating_BasicCRM_Software_Development_Link() throws InterruptedException, IOException
//    {
//        Industries_To_Grow_Your_Business ib = movemouse();
//        ib.MousMoveOnBasicCRMsoftwareDevelopment();
//        //Thread.sleep(10000);
//        boolean page=driver.getPageSource().contains("Customer relationship management (CRM) ");
//        validate(page,"validating_BasicCRM_Software_Development_Link");
//    }
//    @Test(priority = 4)
//    public void validating_Shool_CRM_Software_Link() throws InterruptedException, IOException
//    {
//        Industries_To_Grow_Your_Business ib = movemouse();
//        ib.MoveMouseOnSchoolCRMsoftware();
//        //Thread.sleep(5000);
//        boolean page=driver.getPageSource().contains("SCHOOL/COLLAGE CRM SOFTWARE");
//        validate(page,"validating_Shool_CRM_Software_Link");
//    }
//    @Test(priority = 5)
//    public void validatingTour_Travel_Operator_Software_Link () throws InterruptedException, IOException {
//        Industries_To_Grow_Your_Business ib = movemouse();
//        ib.MoveMouseOnTourTravelsOperatorSoftware();
//        //Thread.sleep(5000);
//        boolean page=driver.getPageSource().contains("Syntiaro is the first specially designed tour operator software ");
//        validate(page,"validatingTour_Travel_Operator_Software_Link");
//    }
//    @Test(priority = 6)
//    public void validatingERP_Software_Development_Link() throws InterruptedException, IOException {
//        Industries_To_Grow_Your_Business ib = movemouse();
//        ib.MoveMouseOnERPsoftwareDevelopment();
//       // Thread.sleep(5000);
//        boolean page=driver.getPageSource().contains("ERP SOFTWARE DEVELOPMENT");
//        validate(page,"validatingERP_Software_Development_Link");
//    }
//    @Test(priority = 7)
//    public void validating_WebDising_Development_Link() throws InterruptedException, IOException {
//        Industries_To_Grow_Your_Business ib = movemouse();
//        ib.MoveMouseOnWebDisingandDevelopment();
//        //Thread.sleep(5000);
//        boolean page=driver.getPageSource().contains("Are you running a business for a long time but still haven’t been to the online route?");
//        validate(page,"validating_WebDising_Development_Link");
//    }
//    @Test(priority = 8)
//    public void validating_Digital_Markenting_Link() throws InterruptedException, IOException {
//        Industries_To_Grow_Your_Business ib = movemouse();
//        ib.MoveMouseOnDigitalMarkenting();
//        //Thread.sleep(5000);
//        boolean page=driver.getPageSource().contains("DIGITAL MARKETING");
//        validate(page,"validating_Digital_Markenting_Link");
//    }
//    @Test(priority = 9)
//    public void validating_Know_More_Button() throws InterruptedException, IOException {
//        Industries_To_Grow_Your_Business ib = movemouse();
//        ib.CloickOnKonwMoreButton();
//        boolean page = driver.getPageSource().contains("We Are Always Here To Help!");
//        validate(page,"validating_Know_More_Button");
//    }
//}
