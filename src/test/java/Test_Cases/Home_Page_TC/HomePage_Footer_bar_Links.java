package Test_Cases.Home_Page_TC;

import Page_Object.Home.HomePage_Footer_Bar;
import Test_Cases.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage_Footer_bar_Links extends BaseClass {

   public HomePage_Footer_Bar hf;
   public  HomePage_Footer_Bar setup()
    {
        driver.get(baseURL);
        HomePage_Footer_Bar hf=new HomePage_Footer_Bar(driver);
        return hf;
    }
    public void Validation(boolean page,String name) throws IOException {
        if(page)
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
    public void validating_Home_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnHomePageLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Home_Page_Link");
    }
    @Test()
    public void validating_About_US_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnAboutUSLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_About_US_Page_Link");
    }
    @Test()
    public void validating_Products_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnProductsLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Products_Page_Link");
    }
    @Test()
    public void validating_Services_Page_link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnServicesLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Services_Page_link");
    }
    @Test()
    public void validating_Landing_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnLandingLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Landing_Page_Link");
    }
    @Test()
    public void validating_Client_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnClientslink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Client_Page_Link");
    }
    @Test()
    public void validating_Contact_US_Page_link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnContactUsLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Contact_US_Page_link");
    }
    @Test()
    public void validating_Restaurant_ManagementSoftware_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnRestarantManagementSoftwareLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Restaurant_ManagementSoftware_Page_Link");
    }
    @Test()
    public void validating_Travel_Agency_Software_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnTravelAgencySoftwareLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Travel_Agency_Software_Page_Link");
    }
    @Test()
    public void validating_CRM_Software_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnCRMsoftwareLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_CRM_Software_Page_Link");
    }
    @Test()
    public void validating_IT_CRM_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnITCRMlink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_IT_CRM_Page_Link");
    }
    @Test()
    public void validating_Infrastructur_ERP_Page_Link() throws IOException {
        HomePage_Footer_Bar  hf = setup();
        hf.ClickOnInrastructureERPLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Infrastructur_ERP_Page_Link");
    }
    @Test()
    public void validating_Real_Estate_ERP_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnRealEstateLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Real_Estate_ERP_Page_Link");
    }
    @Test()
    public void validating_WebDevelopment_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnWebDevelopmentLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_WebDevelopment_Page_Link");
    }
    @Test()
    public void validating_Advisory_Sevices_Page_Link() throws IOException {
        HomePage_Footer_Bar  hf = setup();
        hf.ClickOnAdvisorServicesLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Advisory_Sevices_Page_Link");
    }
    @Test()
    public void validating_GST_Services_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnGSTservicesLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_GST_Services_Page_Link");
    }
    @Test()
    public void validating_Digital_Marketing_Page_Link() throws IOException {
        HomePage_Footer_Bar  hf = setup();
        hf.ClickOnDigitalMarketingLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Digital_Marketing_Page_Link");
    }
    @Test()
    public void validating_Testimonials_Page_Link() throws IOException {
        HomePage_Footer_Bar  hf = setup();
        hf.ClickOnTestimonialsLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Testimonials_Page_Link");

    }
    @Test()
    public void validating_Careers_Page_Link() throws IOException {
        HomePage_Footer_Bar  hf = setup();
        hf.ClickOnCareersLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Careers_Page_Link");
    }
    @Test()
    public void validating_FAQ_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnFAQLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_FAQ_Page_Link");
    }
    @Test()
    public void validating_Sitemap_Page_Link() throws IOException {
        HomePage_Footer_Bar  hf = setup();
        hf.ClickOnSitmapLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Sitemap_Page_Link");
    }
    @Test()
    public void validating_Privacy_Policy_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnPrivacyPolicyLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Privacy_Policy_Page_Link");
    }
    @Test()
    public void validating_Terms_Condition_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnTermsConditionLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Terms_Condition_Page_Link");
    }
    @Test()
    public void validating_Cancellation_Refund_Policy_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnCancellationLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Cancellation_Refund_Policy_Page_Link");
    }
    @Test()
    public void validating_Ubs_Billing_Invoicing_Page_Link() throws IOException {
        hf = setup();
        hf.ClickOnUbsBillingInvoicingLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Ubs_Billing_Invoicing_Page_Link");
    }
    @Test()
    public void validating_Binary_Kart_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnBinarkartLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Binary_Kart_Page_Link");
    }
    @Test()
    public void validating_Phone_Number_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnPhoneNoLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Phone_Number_Link");
    }
    @Test()
    public void validating_Gmail_Page_Link() throws IOException {
        HomePage_Footer_Bar  hf = setup();
        hf.ClickOnGmailLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Gmail_Page_Link");
    }
    @Test()
    public void validating_Office_Location_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnLocationLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Office_Location_Link");
    }
    @Test()
    public void validating_LinkedIn_Link() throws IOException {
        HomePage_Footer_Bar  hf = setup();
        hf.ClickOnLinkedInLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_LinkedIn_Link");
    }
    @Test()
    public void validating_Instagram_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnInstagramLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Instagram_Link");
    }
    @Test()
    public void validating_Facebook_Page_Link() throws IOException {
        HomePage_Footer_Bar  hf = setup();
        hf.ClickOnFacebooklink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Facebook_Page_Link");
    }
    @Test()
    public void validating_Twitter_page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnTwitterLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_Twitter_page_Link");
    }
    @Test()
    public void validating_YouTube_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnYoutubeLink();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_YouTube_Page_Link");
    }
    @Test()
    public void validating_GmailB_Page_Link() throws IOException {
        HomePage_Footer_Bar hf = setup();
        hf.ClickOnGamillinkb();
        boolean page = driver.getTitle().contains("404 - Not Found");
        Validation(page,"validating_GmailB_Page_Link");
    }

}
