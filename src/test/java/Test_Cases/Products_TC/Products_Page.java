package Test_Cases.Products_TC;

import Page_Object.Products.Product_Object_Page;
import Test_Cases.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.IOException;

public class Products_Page extends BaseClass {


    public Product_Object_Page pp;
    public  Product_Object_Page setup()
    {
        driver.get(baseURL);
        Product_Object_Page pp=new Product_Object_Page(driver);
        pp.ClickOnPRODUCTS();
        return pp;
    }
    public void Validation(boolean page,String name) throws IOException {
        if(page)
        {
//           ITestResult.fail(pagetitle);
            ExtentReports extent = null;
            ExtentTest test = extent.createTest("verify the page title").assignAuthor("praveen").assignCategory("functional test cases").assignDevice("windows");
//        test.info("i am capturing the page title");
            test.addScreenCaptureFromPath(captureScreen(driver,name));
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }

    }
    @Test()
    public void validating_Products_Page_Link() throws IOException {
        pp=setup();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Products_Page_Link");
    }
   @Test()
    public void validating_Restaurant_Mangemet_POS_Link() throws IOException {
       pp=setup();
        pp.ClickOnRestaurantManagementPOS();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Products_Page_Link");
    }
    @Test()
    public void validating_Travel_CRM_Link() throws IOException {
        pp=setup();
        pp.ClickOnTravelCRM();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Products_Page_Link");
    }
    @Test()
    public void validating_Accounting_Software_Link() throws IOException {
        pp=setup();
        pp.ClickOnAccountingSoftwar();
      boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Products_Page_Link");
    }
    @Test()
    public void validating_TourTravel_Operator_Software_Link() throws IOException
    {
        pp=setup();
        pp.ClickOnTourTravelsOperatorSoftware();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Products_Page_Link");
    }
    @Test()
    public void validating_Basic_CRM_Link() throws IOException
    {
        pp=setup();
        pp.ClickOnBasicCRM();
     boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Basic_CRM_Link");
    }
    @Test()
    public void validating_ITCRM_Link() throws IOException
    {
        pp=setup();
        pp.ClickOnITCRM();
         boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_ITCRM_Link");
    }
    @Test()
    public void validating_B2BCRM_solution_Link() throws IOException
    {
         pp=setup();
        pp.ClickOnB2BCRMSolution();
     boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_B2BCRM_solution_Link");
    }

       @Test()
   public void validating_LeadManagent_Link() throws IOException
   {
       pp=setup();
       pp.ClickOnLeadManagement();
       boolean page = driver.getTitle().contains("404 - Not Found");
       Validation(page,"validating_LeadManagent_Link");
    }
    @Test()
    public void validating_BasicHRM_Link() throws IOException
    {
        pp=setup();
        pp.ClickOnBasicHRM();
         boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_BasicHRM_Link");
    }
    @Test()
    public void validating_Human_Capital_Link() throws IOException
    {
        pp=setup();
        pp.ClickOnHumanCapital();
         boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Human_Capital_Link");
    }
 //   @Test()
//    public void validating_ERP_software_Development_Link() throws IOException
//    {
//         pp=setup();
//        pp.ClickOnERPsoftwareDevelopment();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validation(page,"validating_ERP_software_Development_Link");
//    }
    @Test()
    public void validating_Infrastructure_Link() throws IOException
    {
         pp=setup();
        pp.ClickOnInsfrastructureERP();
     boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Infrastructure_Link");
    }
    @Test()
    public void validating_Manufacturing_ERP_Link() throws IOException
    {
         pp=setup();
        pp.ClickOnManufacturingERP();
         boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Manufacturing_ERP_Link");
    }
    @Test()
    public void validating_RealEstate_ERP_Link() throws IOException
    {
        pp=setup();
        pp.ClickOnRealEstateERP();
       boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_RealEstate_ERP_Link");
    }
    @Test()
    public void validating_Constructin_ERP_Link() throws IOException
    {
         pp=setup();
        pp.ClickOnConstructionERP();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Constructin_ERP_Link");
    }
    @Test()
    public void validating_Civil_Site_ERP_Link() throws IOException
    {
         pp=setup();
        pp.ClickOnCivilSiteERP();
       boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Civil_Site_ERP_Link");
    }
    @Test()
    public void validating_Bench_Sales_Support_Link() throws IOException
    {
        pp=setup();
        pp.ClickOnBenchSalesSupport();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Bench_Sales_Support_Link");
    }
    @Test()
    public void validating_Salesforce_Development_Link() throws IOException {
        pp=setup();
        pp.ClickOnSalesforceDevelopment();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Salesforce_Development_Link");
    }
    @Test()
    public void validating_Web_development_Link() throws IOException {
        pp=setup();
        pp.ClickOnWebDevelopment();
         boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Web_development_Link");
    }
    @Test()
    public void validating_Digital_marketing_Link() throws IOException {
         pp=setup();
        pp.ClickOnDigitalMarketingLink();
       boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Digital_marketing_Link");
    }
    @Test()
    public void validating_FMGC_Link() throws IOException {
        pp=setup();
        pp.ClickOnFMGCLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_FMGC_Link");
    }
    @Test()
    public void validating_MSME_Link() throws IOException {
        pp=setup();
        pp.ClickOnMSMELink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_MSME_Link");
    }

}
