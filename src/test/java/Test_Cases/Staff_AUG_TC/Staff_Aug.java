//package Test_Cases.Staff_AUG_TC;
//
//import Page_Object.Staff_AUG.Staff_Aug_Objects;
//import Test_Cases.BaseClass;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//
//public class Staff_Aug extends BaseClass {
//
//    Staff_Aug_Objects sa;
//
//    public  Staff_Aug_Objects conect() {
//        driver.get(baseURL);
//        Staff_Aug_Objects sa = new Staff_Aug_Objects(driver);
//        sa.ClickOnSTAFF_AUGButton();
//        return sa;
//    }
//    public void Validate(boolean page,String name) throws IOException {
//        if(page)
//        {
//            captureScreen(driver,name);
//            Assert.assertTrue(true);
//        }
//        else
//        {
//            Assert.assertTrue(false);
//        }
//    }
//
//    @Test()
//    public void validating_StaffAug_link() {
//        conect();
//    }
//    @Test()
//    public void validating_technology_And_Developmet_Link() throws IOException {
//        Staff_Aug_Objects sa=conect();
//        sa.ClickOn_TechnologyAndSoftwareDevelopment();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_technology_And_Developmet_Link");
//    }
//    @Test()
//    public void validating_Finance_And_Banking_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnFinanceAndBanking();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Finance_And_Banking_Link");
//    }
//    @Test()
//    public void validating_HealthCare_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnHealthCare();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_HealthCare_Link");
//    }
//    @Test()
//    public void validating_Manufacturing_And_Supply_Chain_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnManufacturingAndSuplyChain();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Manufacturing_And_Supply_Chain_Link");
//    }
//    @Test()
//    public void validating_Gov_And_Public_Sector_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnGovAndPublicSector();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Gov_And_Public_Sector_Link");
//    }
//    @Test()
//    public void validating_Services_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnServices();
////        boolean page = driver.getTitle().contains("404 - Not Found");
////        Validate(page,"validating_Services_Link");
//    }
//    @Test()
//    public void validating_Remote_Staffing_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnServices();
//        sa.ClickOnRemoteStaffing();
////        boolean page = driver.getTitle().contains("404 - Not Found");
////        Validate(page,"validating_Remote_Staffing_Link");
//    }
//    @Test()
//    public void validating_Business_OutSourcing_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnServices();
//        sa.ClickOnBusinessOutSourcing();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Business_OutSourcing_Link");
//    }
//    @Test()
//    public void validating_Business_Consulting_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnServices();
//        sa.ClickOnBusinessConsulting();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Business_Consulting_Link");
//    }
//    @Test()
//    public void validating_Digital_Marketing_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnServices();
//        sa.ClickOnDigitalMarketing();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Digital_Marketing_Link");
//    }
//    @Test()
//    public void validating_ContactUs_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnContactUs();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_ContactUs_Link");
//    }
//    @Test()
//    public void validating_Resources_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnResource();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Resources_Link");
//    }
//    @Test()
//    public void validating_Blogs_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnResource();
//        sa.ClickOnBlogs();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Blogs_Link");
//    }
//    @Test()
//    public void validating_SubmitReview_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnResource();
//        sa.ClickOnSubmitReview();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_SubmitReview_Link");
//    }
//    @Test()
//    public void validating_Indusries_Link() throws IOException {
//        sa=conect();
//        sa.ClickOnResource();
//        sa.ClickOnIndustries();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Indusries_Link");
//    }
//}
