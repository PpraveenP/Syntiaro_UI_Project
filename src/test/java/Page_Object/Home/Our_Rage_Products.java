package Page_Object.Home;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Our_Rage_Products {
    WebDriver ldriver;

    public Our_Rage_Products(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//img[@title='Restaurant Management']")
    @CacheLookup
    WebElement RestaurantManagement;

    public void clickRestaurantmanagement()
    {
        RestaurantManagement.click();
    }

    @FindBy(xpath = "//img[@title='Travel Management']")
    @CacheLookup
    WebElement TravelManagement;

    public void clickTravelmanagement()
    {
        TravelManagement.click();
    }

    @FindBy(xpath = "//img[@title='School/Collage CRM']")
    @CacheLookup
    WebElement SchoolCRM;

    public void clickschoolCRM() {
        SchoolCRM.click();
    }

    @FindBy(xpath = "//img[@title='Construction']")
    @CacheLookup
    WebElement Construction;
    public void clickConstruction()
    {
        Construction.click();
    }

    @FindBy(xpath = "//img[@title='HealthCare']")
    @CacheLookup
    WebElement HealthCare;
    public void clickhealthcare()
    {
        HealthCare.click();
    }

    @FindBy(xpath = "//img[@alt='Agriculture']")
    @CacheLookup
    WebElement Agriculture;
    public void clickAgricuture()
    {
        Agriculture.click();
    }

    @FindBy(xpath = "//img[@alt='Banking']")
    @CacheLookup
    WebElement Banking;
    public void clickBanking()
    {
        Banking.click();
    }
    @FindBy(xpath = "//img[@title='Real Estate']")
    @CacheLookup
    WebElement RealEstate;
    public void clickRealEstate()
    {
        RealEstate.click();
    }
    @FindBy(xpath = "//img[@title='ERP Software Development']")
    @CacheLookup
    WebElement ERPsoftwareDevelopment;
    public void cickERPsoftwareDevelopment()
    {
        ERPsoftwareDevelopment.click();
    }

    @FindBy(xpath = "//img[@title='Lead Management']")
    @CacheLookup
    WebElement LeadManagement;
    public void clickLaeadManagement()
    {
        LeadManagement.click();
    }

    @FindBy(xpath = "//img[@title='Manufacturing']")
    @CacheLookup
    WebElement Manufacturing;
    public void clickManufacturing()
    {
        Manufacturing.click();
    }

    @FindBy(xpath = "//img[@title='Web Development']")
    @CacheLookup
    WebElement WebDevelopment;
    public void clickWebDevelopment()
    {
        WebDevelopment.click();
    }

}
