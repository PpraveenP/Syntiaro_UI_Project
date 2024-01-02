package Test_Cases.Careers_TC;

import Page_Object.Careers.Careers_Objects;
import Test_Cases.BaseClass;
import org.testng.annotations.Test;

import java.io.File;

public class Careers extends BaseClass {
    public     Careers_Objects  connect()
    {
        driver.get(baseURL);
        Careers_Objects co=new Careers_Objects(driver);
        co.ClickOnCareerLInk();
        return co;
    }
    @Test()
    public void validating_Careers_Link()
    {
        connect();
    }
    @Test()
    public void validating_Post_Resume_Form()
    {
        Careers_Objects co = connect();
        co.setFullName("Sandeep Bibe");
        co.setEmail("sandeepbibe@gmail.com");
        co.setDate("11/1/1997");
        co.setMale();
        co.setPhone("9865327845");
        co.setPositionApplied();
        co.setTotalExperience("10");
        co.setHigherQulification("BE");
        File f=new File("./Data/Notes.docx");
        String ap=f.getAbsolutePath();
        co.setFileUpload(ap);
        co.setProfileURL("Sandeep123");
        co.setMessageBox("Developer");
        co.setSubmitButton();
    }


}
