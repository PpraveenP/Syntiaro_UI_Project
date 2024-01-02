package Page_Object.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Here_Enquire_Form_ {

    WebDriver ldriver;
    public Click_Here_Enquire_Form_(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(className = "sidebar_enq")
    @CacheLookup
    WebElement Enquire_btn;
    @FindBy(name = "name")
    @CacheLookup
    WebElement Name;

    @FindBy(name = "businessname")
    @CacheLookup
    WebElement Company;


    @FindBy(name = "email")
    @CacheLookup
    WebElement Email;

    @FindBy(name = "phone")
    @CacheLookup
    WebElement Contact;

    @FindBy(xpath = "//option[@value='Restaurant Management POS Software']")
    @CacheLookup
    WebElement Product;
    @FindBy(name = "city")
    @CacheLookup
    WebElement City;

    @FindBy(name = "message")
    @CacheLookup
    WebElement Message;

    @FindBy(xpath = "//button[normalize-space()='Send Request!']")
    @CacheLookup
    WebElement Submit;


    public void setName(String name)
    {
        Name.sendKeys(name);
    }
    public void setCompany(String company)
    {
        Company.sendKeys(company);
    }
    public void setEmail(String email)
    {
        Email.sendKeys(email);
    }
    public void setContact(String contact)
    {
        Contact.sendKeys(contact);
    }
    public void setProduct()
    {
        Product.click();
    }
    public void setCity(String  city)
    {
        City.sendKeys(city);
    }
    public void setMessage(String message)
    {
        Message.sendKeys((message));
    }

    public void ClickEnquiry_btn()
    {
        Enquire_btn.click();
    }
    public void ClickSubmitBtn()
    {
        Submit.click();
    }
}
