package Page_Object.Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Object_Page{
    WebDriver ldriver;

    public Product_Object_Page(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//a[normalize-space()='PRODUCTS']")
    @CacheLookup
    WebElement ProductsButton;
    public void ClickOnPRODUCTS()
    {
        ProductsButton.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Restaurant Management POS']")
    @CacheLookup
    WebElement RestaurantManagementPOS;
    public void ClickOnRestaurantManagementPOS()
    {
        RestaurantManagementPOS.click();
    }
    @FindBy(xpath = "//li[@class='litravel']//a[contains(@class,'dropdown-items')][normalize-space()='Travel CRM']")
    @CacheLookup
    WebElement TravelCRMbutton;
    public void ClickOnTravelCRM()
    {
        TravelCRMbutton.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Accounting Software']")
    @CacheLookup
    WebElement AccountingSoftware;
    public void ClickOnAccountingSoftwar()
    {
        AccountingSoftware.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Tour & Travels Operator Software']")
    @CacheLookup
    WebElement TourTravelOperatorSoftwareButton;
    public void ClickOnTourTravelsOperatorSoftware()
    {
        TourTravelOperatorSoftwareButton.click();
    }
    @FindBy(xpath = "//li[contains(@class,'licrm')]//a[contains(@class,'dropdown-items')][normalize-space()='Basic CRM']")
    @CacheLookup
    WebElement BasicCRM;
    public void ClickOnBasicCRM()
    {
        BasicCRM.click();
    }
    @FindBy(xpath = "//a[contains(@class,'dropdown-items')][normalize-space()='IT CRM']")
    @CacheLookup
    WebElement ITCRMbutton;
    public void ClickOnITCRM()
    {
        ITCRMbutton.click();
    }
    @FindBy(xpath = "//a[normalize-space()='B2B CRM Solution']")
    @CacheLookup
    WebElement B2BCRMsolution;
    public void ClickOnB2BCRMSolution()
    {
        B2BCRMsolution.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Lead Management')]")
    @CacheLookup
    WebElement LeadManagent;
    public void ClickOnLeadManagement()
    {
        LeadManagent.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Basic HRM']")
    @CacheLookup
    WebElement BasicHRM;
    public void ClickOnBasicHRM()
    {
        BasicHRM.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Human Capital(HCM)']")
    @CacheLookup
    WebElement HumanCapital;
    public void ClickOnHumanCapital()
    {
        HumanCapital.click();
    }
//    @FindBy(className = "svg-inline--fa fa-caret-right")
//    @CacheLookup
//    WebElement ERPsoftwareDevelopment;
//    public void ClickOnERPsoftwareDevelopment()
//    {
//        ERPsoftwareDevelopment.click();
//    }
    @FindBy(xpath = "//a[normalize-space()='Insfrastructure ERP']")
    @CacheLookup
    WebElement InfrastructureButton;
    public void ClickOnInsfrastructureERP()
    {
        InfrastructureButton.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Manufacturing ERP']")
    @CacheLookup
    WebElement ManufacturingERP;
    public void ClickOnManufacturingERP()
    {
        ManufacturingERP.click();
    }
    @FindBy(xpath = "//a[contains(@class,'dropdown-items')][normalize-space()='Real Estate ERP']")
    @CacheLookup
    WebElement RealEstateERP;
    public void ClickOnRealEstateERP()
    {
        RealEstateERP.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Construction ERP']")
    @CacheLookup
    WebElement ConstructinERP;
    public void ClickOnConstructionERP()
    {
        ConstructinERP.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Civil Site ERP']")
    @CacheLookup
    WebElement Civil_Site_ERP;
    public void ClickOnCivilSiteERP()
    {
        Civil_Site_ERP.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Bench Sales Support']")
    @CacheLookup
    WebElement Bench;
    public void ClickOnBenchSalesSupport()
    {
        Bench.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Salesforce Development']")
    @CacheLookup
    WebElement salesforce;
    public void ClickOnSalesforceDevelopment()
    {
        salesforce.click();
    }
    @FindBy(xpath = "//li[contains(@class,'liother')]//a[contains(@class,'dropdown-items')][normalize-space()='Web Development']")
    @CacheLookup
    WebElement Webdevelopment;
    public void ClickOnWebDevelopment()
    {
        Webdevelopment.click();
    }

    @FindBy(xpath = "//li[contains(@class,'liother')]//a[contains(@class,'dropdown-items')][normalize-space()='Digital Marketing']")
    @CacheLookup
    WebElement Digitalmarketing;
    public void ClickOnDigitalMarketingLink()
    {
        Digitalmarketing.click();
    }
    @FindBy(xpath = "//a[normalize-space()='FMCG']")
    @CacheLookup
    WebElement FMGC;
    public void ClickOnFMGCLink()
    {
        FMGC.click();
    }
    @FindBy(xpath = "//a[normalize-space()='MSME']")
    @CacheLookup
    WebElement MSME;
    public void ClickOnMSMELink()
    {
        MSME.click();
    }


}
