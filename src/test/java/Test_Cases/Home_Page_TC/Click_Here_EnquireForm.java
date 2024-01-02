package Test_Cases.Home_Page_TC;

import Page_Object.Home.Click_Here_Enquire_Form_;
import Test_Cases.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Click_Here_EnquireForm  extends BaseClass {


    @Test
    public void validating_click_here_Enquire_Form() throws InterruptedException, IOException {

        driver.get(baseURL);
        Click_Here_Enquire_Form_ ce=new Click_Here_Enquire_Form_(driver);
        Thread.sleep(2000);
        ce.ClickEnquiry_btn();
        ce.setName("Sandeep");
        ce.setCompany("Syntiaro");
        ce.setEmail("sandeep98@gmail.com");
        ce.setContact("9844269290");
        ce.setProduct();
        ce.setCity("Pune");
        ce.setMessage("Developer");
        ce.ClickSubmitBtn();
        driver.switchTo().alert().accept();
        String title=driver.getTitle();
        System.out.println("title is "+title);
        if(driver.getTitle().equals("SYNTIARO- Your Partner in Your Digital Progress"))
        {
            Assert.assertTrue(true);
        }
        else
        {
            captureScreen(driver,"TC quick equire Form");
            Assert.assertTrue(false);
        }
    }
}



