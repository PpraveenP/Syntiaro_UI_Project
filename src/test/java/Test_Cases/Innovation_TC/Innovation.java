//package Test_Cases.Innovation_TC;
//
//import Page_Object.Innovation.Innovation_Objects;
//import Test_Cases.BaseClass;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.util.List;
//
//public class Innovation extends BaseClass {
//
//    public Innovation_Objects  connect()
//    {
//        driver.get(baseURL);
//        Innovation_Objects io=new Innovation_Objects(driver);
//        io.ClickOnInnovation();
//        return io;
//    }
//
//    @Test()
//    public void validating_Innovation_Link()
//    {
//        Innovation_Objects io = connect();
//    }
//    @Test()
//    public void validating_SHARE_YOUR_INNOVATIVE_IDEAS_Form()
//    {
//        Innovation_Objects io = connect();
//       io.setName("Sandeep");
//       io.setLastName("Bibe");
//       io.setEmail("sndeepbibe@gmail.com");
//       io.setDate("12/05/2020");
//       io.setMale();
//       io.setPhone("9894567891");
//       io.setCurrentAddress("pune");
//       io.setPermnentAddress("pune");
//       io.setHigherQulification("BE");
//       io.setCollege("MSCOE");
//       io.setCurrentSemester("8");
//       io.setPassingYear("2020");
//       io.setSchoolName("ssc pune");
//       io.setSSCcompletedYear("2016");
//       io.setHSCschollName("sss pune");
//       io.setHSCcomplitedYear("2016");
//       io.setProjectTitle("Sytiaro");
//       io.setMessage("Developer");
//        List<WebElement> fi = driver.findElements(By.xpath("(//input[@name='file1'])[1]"));
//        for(WebElement e:fi)
//        {
//            File f = new File("./Data/Notes.docx");
//            String af = f.getAbsolutePath();
//            io.setFileUpload2(af);
//            io.setFileUpload(af);
////            e.sendKeys(".//Data/Notes.docx");
//        }
//       io.ClickOnSubmitButton();
//    }
//}
