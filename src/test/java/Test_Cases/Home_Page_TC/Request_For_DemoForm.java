//package Test_Cases.Home_Page_TC;
//
//import Page_Object.Home.Request_For_Demo_Form;
//import Test_Cases.BaseClass;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//
//public class Request_For_DemoForm extends BaseClass {
//
//    @Test
//    public void validating_Request_for_demo_Form() throws InterruptedException, IOException {
//
//        driver.get(baseURL);
//        Request_For_Demo_Form rf=new Request_For_Demo_Form(driver);
//         Thread.sleep(5000);
//        rf.clickform();
//       Thread.sleep(5000);
//        rf.setName("Praveen");
//        // Thread.sleep(2000);
//        rf.setEmail("pujaaripraveen97@gmail.com");
//        // Thread.sleep(2000);
//        rf.setPhone("9844269290");
//        //Thread.sleep(2000);
//        rf.setCity("pune");
//        //  Thread.sleep(2000);
//        rf.setState("pune");
//        // Thread.sleep(2000);
//        rf.setCompany("Syntiaro");
//        // Thread.sleep(2000);
//        rf.setDesignation("Tester");
//         Thread.sleep(2000);
//         rf.clickcheckbox();
//        rf.clicksubmit();
//        String title = driver.switchTo().alert().getText();
////        if(title.contains("Please complete the reCAPTCHA."))
////        {
////           captureScreen(driver,"validating_Request_for_demo_Form");
////           Assert.assertTrue(true);
////        }
////        else
////        {
////          Assert.assertTrue(false);
////        }
//    }
//}
//
//
//
