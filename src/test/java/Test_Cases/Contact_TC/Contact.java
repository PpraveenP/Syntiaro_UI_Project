//package Test_Cases.Contact_TC;
//
//import Page_Object.Contact.Contact_Objects;
//import Test_Cases.BaseClass;
//import org.testng.annotations.Test;
//
//public class Contact extends BaseClass {
//    Contact_Objects co;
//    @Test()
//    public void validating_Contact_Link()
//    {
//        driver.get(baseURL);
//        Contact_Objects co=new Contact_Objects(driver);
//        co.ClickOnContactButton();
//    }
//    @Test()
//    public void validating_Quick_Enquiry_Form()
//    {
//        driver.get(baseURL);
//        Contact_Objects co=new Contact_Objects(driver);
//        co.ClickOnContactButton();
//        co.setName("mahesh");
//        co.setEmail("mahesh23@gmail.com");
//        co.setBusinessName("Tester");
//        co.setPhoneNumber("9865327412");
//        co.setMessage("tester");
//        co.ClickOnSubmitButton();
//    }
//    @Test
//    public void validating_Google_Map_Link()
//    {
//        driver.get(baseURL);
//        Contact_Objects co=new Contact_Objects(driver);
//        co.ClickOnContactButton();
//        co.ClickOnGoogleMapLink();
//    }
//}
