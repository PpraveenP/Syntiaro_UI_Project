package Page_Object.Careers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class Careers_Objects {
    WebDriver ldriver;

    public Careers_Objects(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//a[normalize-space()='CAREERS']")
    @CacheLookup
    WebElement CareerButton;
    public void ClickOnCareerLInk()
    {
        CareerButton.click();
    }

    @FindBy(xpath = "//input[@placeholder='Your Full Name']")
    @CacheLookup
    WebElement FullName;
    public void setFullName(String fullName)
    {
        FullName.sendKeys(fullName);
    }

    @FindBy(xpath = "//input[@placeholder='Email Address']")
    @CacheLookup
    WebElement Email;
    public void setEmail(String email)
    {
        Email.sendKeys(email);
    }

    @FindBy(xpath = "//input[@id='dateInput']")
    @CacheLookup
    WebElement Date;
    public void setDate(String date)
    {
        Date.sendKeys(date);
    }

    @FindBy(xpath = "//input[@id='inlineRadio1']")
    @CacheLookup
    WebElement Male;
    public void setMale()
    {
        Male.click();
    }

    @FindBy(xpath = "//input[@id='inlineRadio2']")
    @CacheLookup
    WebElement Female;
    public void setFemale()
    {
        Female.click();
    }

    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    @CacheLookup
    WebElement Phone;
    public void setPhone(String phone)
    {
        Phone.sendKeys(phone);
    }

    @FindBy(xpath = "//select[@name='positionapplied']")
    @CacheLookup
    WebElement PositionApplied;
    public void setPositionApplied()
    {
        PositionApplied.click();
    }

    @FindBy(xpath = "//input[@placeholder='Total Experience']")
    @CacheLookup
    WebElement TotalExperience;
    public void setTotalExperience(String experience)
    {
        TotalExperience.sendKeys(experience);
    }

    @FindBy(xpath = "//input[@placeholder='Higher Qualification']")
    @CacheLookup
    WebElement HigherQulification;
    public void setHigherQulification(String q)
    {
        HigherQulification.sendKeys(q);
    }

    @FindBy(xpath = "//input[@name='file']")
    @CacheLookup
    WebElement FileUpload;
    public void setFileUpload(String fi)
    {
        FileUpload.sendKeys(fi);
    }

    @FindBy(xpath = "//input[@placeholder='Profile Url']")
    @CacheLookup
    WebElement ProfileURL;
    public void setProfileURL(String profileURL)
    {
        ProfileURL.sendKeys(profileURL);
    }

    @FindBy(xpath = "//textarea[@placeholder='Write Your Message Here']")
    @CacheLookup
    WebElement MessageBox;
    public void setMessageBox(String message)
    {
        MessageBox.sendKeys(message);
    }

    @FindBy(xpath = "//input[@value='Submit']")
    @CacheLookup
    WebElement SubmitButton;
    public void setSubmitButton()
    {
        SubmitButton.click();
    }
}
