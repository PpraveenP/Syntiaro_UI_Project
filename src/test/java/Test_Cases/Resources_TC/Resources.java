//package Test_Cases.Resources_TC;
//
//import Page_Object.Resources.Resources_Objects;
//import Test_Cases.BaseClass;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//
//public class Resources extends BaseClass {
//    Resources_Objects ro;
//    public  Resources_Objects conect()
//    {
//        driver.get(baseURL);
//        Resources_Objects ro=new Resources_Objects(driver);
//        ro.ClickOnResourcesLink();
//        return ro;
//    }
//    public void Validate(boolean page,String name) throws IOException {
//        if(page==true)
//        {
//            captureScreen(driver,name);
//            Assert.assertTrue(true);
//        }
//        else
//        {
//            Assert.assertTrue(true);
//        }
//    }
//    @Test()
//    public void validating_Rosources_Link()
//    {
//        Resources_Objects ro=conect();
//    }
//    @Test()
//    public void validating_Our_Services_Link() throws IOException {
//        Resources_Objects ro=conect();
//        ro.ClickOnOurServices();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Our_Services_Link");
//    }
//    @Test()
//    public void validating_Our_Clients_Link() throws IOException {
//        ro=conect();
//        ro.ClickOnOurClient();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Our_Clients_Link");
//    }
//    @Test()
//    public void validating_Our_Studies_Link() throws IOException {
//        ro=conect();
//        ro.ClickOnCaseStudies();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Our_Studies_Link");
//    }
//    @Test()
//    public void validating_Testimonials_Link() throws IOException {
//        ro=conect();
//        ro.ClickOnTestimonials();
//        boolean page = driver.getTitle().contains("404 - Not Found");
//        Validate(page,"validating_Testimonials_Link");
//    }
//}
