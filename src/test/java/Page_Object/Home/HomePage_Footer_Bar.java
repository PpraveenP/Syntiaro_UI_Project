package Page_Object.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Footer_Bar {
    WebDriver ldriver;
    public HomePage_Footer_Bar(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//ul[@class='links']//a[normalize-space()='Home']")
    @CacheLookup
    WebElement Home;
    public void ClickOnHomePageLink()
    {
        Home.click();
    }

    @FindBy(xpath = "//a[normalize-space()='About Us']")
    @CacheLookup
    WebElement AboutUs;
    public void ClickOnAboutUSLink()
    {
        AboutUs.click();
    }

    @FindBy(xpath = "//a[@href='Whoweare'][normalize-space()='Products']")
    @CacheLookup
    WebElement Products;
    public void ClickOnProductsLink()
    {
        Products.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Services']")
    @CacheLookup
    WebElement Services;
    public void ClickOnServicesLink()
    {
        Services.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Landing Page']")
    @CacheLookup
    WebElement Landing;
    public void ClickOnLandingLink()
    {
        Landing.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Clients']")
    @CacheLookup
    WebElement Clients;
    public void ClickOnClientslink()
    {
        Clients.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Contact Us']")
    @CacheLookup
    WebElement ContactUs;
    public void ClickOnContactUsLink()
    {
        ContactUs.click();
    }

    @FindBy(xpath = "//a[@class='widthmanage']")
    @CacheLookup
    WebElement RestaurantManagementSoftware;
    public void ClickOnRestarantManagementSoftwareLink()
    {
        RestaurantManagementSoftware.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Travel Agency Software']")
    @CacheLookup
    WebElement TravelAgencySoftware;
    public void ClickOnTravelAgencySoftwareLink()
    {
        TravelAgencySoftware.click();
    }

    @FindBy(xpath = "//a[normalize-space()='CRM Software']")
    @CacheLookup
    WebElement CRMsoftware;
    public void ClickOnCRMsoftwareLink()
    {
        CRMsoftware.click();
    }

    @FindBy(xpath = "//ul[contains(@class,'links')]//li//a[contains(@href,'Notfoundpage')][normalize-space()='IT CRM']")
    @CacheLookup
    WebElement ITCRM;
    public void ClickOnITCRMlink()
    {
        ITCRM.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Infrastructure ERP']")
    @CacheLookup
    WebElement InrastructureERP;
    public void ClickOnInrastructureERPLink()
    {
        InrastructureERP.click();
    }

    @FindBy(xpath = "//a[contains(@href,'Notfoundpage')][normalize-space()='Real Estate ERP']")
    @CacheLookup
    WebElement RealEstate;
    public void ClickOnRealEstateLink()
    {
        RealEstate.click();
    }

    @FindBy(xpath = "(//a[contains(@href,'Web')][normalize-space()='Web Development'])[4]")
    @CacheLookup
    WebElement WebDevelopment;
    public void ClickOnWebDevelopmentLink()
    {
        WebDevelopment.click();
    }

    @FindBy(xpath = "(//a[normalize-space()='Advisory Services'])[1]")
    @CacheLookup
    WebElement AdvisoryServices;
    public void ClickOnAdvisorServicesLink()
    {
        AdvisoryServices.click();
    }

    @FindBy(xpath = "(//a[normalize-space()='GST Services'])[1]")
    @CacheLookup
    WebElement GSTservices;
    public void ClickOnGSTservicesLink()
    {
        GSTservices.click();
    }

    @FindBy(xpath = "(//a[contains(@href,'Digital')][contains(text(),'Digital')])[3]")
    @CacheLookup
    WebElement DigitalMarketing;
    public void ClickOnDigitalMarketingLink()
    {
        DigitalMarketing.click();
    }

    @FindBy(xpath = "//ul[contains(@class,'links')]//li//a[contains(@href,'Testimonials')][normalize-space()='Testimonials']")
    @CacheLookup
    WebElement Testimonials;
    public void ClickOnTestimonialsLink()
    {
        Testimonials.click();
    }

    @FindBy(xpath = "//ul[contains(@class,'links')]//li//a[contains(@href,'Careers')][normalize-space()='Careers']")
    @CacheLookup
    WebElement Careers;
    public void ClickOnCareersLink()
    {
        Careers.click();
    }


    @FindBy(xpath = "//a[normalize-space()='FAQ']")
    @CacheLookup
    WebElement FAQ;
    public void ClickOnFAQLink()
    {
        FAQ.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Sitemap']")
    @CacheLookup
    WebElement Sitemap;
    public void ClickOnSitmapLink()
    {
        Sitemap.click();
    }

    @FindBy(xpath = "(//a[normalize-space()='Privacy Policy'])[1]")
    @CacheLookup
    WebElement PrivacyPolicy;
    public void ClickOnPrivacyPolicyLink()
    {
        PrivacyPolicy.click();
    }

    @FindBy(xpath = "(//a[normalize-space()='Terms & Condition'])[1]")
    @CacheLookup
    WebElement TermsCondition;
    public void ClickOnTermsConditionLink()
    {
        TermsCondition.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Cancellation & Refund Policy']")
    @CacheLookup
    WebElement Cancellation;
    public void ClickOnCancellationLink()
    {
        Cancellation.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Ubs billing & invoicing']")
    @CacheLookup
    WebElement UbsBillingInvoicing;
    public void ClickOnUbsBillingInvoicingLink()
    {
        UbsBillingInvoicing.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Binary Kart']")
    @CacheLookup
    WebElement BinaryKart;
    public void ClickOnBinarkartLink()
    {
        BinaryKart.click();
    }

    @FindBy(xpath = "//b[normalize-space()='+91 911-211-4422']")
    @CacheLookup
    WebElement PhoneNo;
    public void ClickOnPhoneNoLink()
    {
        PhoneNo.click();
    }

    @FindBy(xpath = "//b[normalize-space()='info@syntiaro.com']")
    @CacheLookup
    WebElement GmailLink;
    public void ClickOnGmailLink()
    {
        GmailLink.click();
    }
    @FindBy(xpath = "//span[@class='spanp']")
    @CacheLookup
    WebElement Loction;
    public void ClickOnLocationLink()
    {
        Loction.click();
    }

    @FindBy(xpath = "//a[contains(@title,'Linkedin')]//img")
    @CacheLookup
    WebElement LinkedIn;
    public void ClickOnLinkedInLink()
    {
        LinkedIn.click();
    }

    @FindBy(xpath = "//a[@title='instagram']//img")
    @CacheLookup
    WebElement Instagram;
    public void ClickOnInstagramLink()
    {
        Instagram.click();
    }

    @FindBy(xpath = "//a[@title='facebook']//img")
    @CacheLookup
    WebElement Facebook;
    public void ClickOnFacebooklink()
    {
        Facebook.click();
    }

    @FindBy(xpath = "//a[@title='Twitter']//img")
    @CacheLookup
    WebElement Twitter;
    public void ClickOnTwitterLink()
    {
        Twitter.click();
    }

    @FindBy(xpath = "//a[@title='Youtube']//img")
    @CacheLookup
    WebElement Youtube;
    public void ClickOnYoutubeLink()
    {
        Youtube.click();
    }

    @FindBy(xpath = "//a[@title='Gmail']//img")
    @CacheLookup
    WebElement Gmail;
    public void ClickOnGamillinkb()
    {
        Gmail.click();
    }
}
