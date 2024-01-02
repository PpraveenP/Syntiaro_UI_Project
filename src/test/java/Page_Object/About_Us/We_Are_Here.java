package Page_Object.About_Us;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class We_Are_Here {
    WebDriver ldriver;
    Actions as;

    public We_Are_Here(WebDriver rdriver)
    {
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//a[normalize-space()='ABOUT US']")
    @CacheLookup
    WebElement AboutUsButton;
    public WebElement ClickOnAboutUSButton()
    {
      return AboutUsButton;

    }
    @FindBy(xpath = "//a[@class='dropdown-items'][normalize-space()='Who we are']")
    @CacheLookup
    WebElement WeAreHereButton;
    public WebElement ClickOnWeAreHereButton()
    {
       return WeAreHereButton;
    }
    public void ClickOnWeAreHereButton_()
    {
        WeAreHereButton.click();
    }

    @FindBy(xpath = "//a[@href='http://ubsbill.com']//img")
    @CacheLookup
    WebElement RestaurantPOS;
    public void ClickOnResaurantButton()
    {
        RestaurantPOS.click();
    }

    @FindBy(xpath = "//a[@href='Travelcrm']//img")
    @CacheLookup
    WebElement TravelAgency;
    public void ClickOnTravelAgencyButton()
    {
        TravelAgency.click();
    }

    @FindBy(xpath = "//img[@class='imgmed']")
    @CacheLookup
    WebElement CRMsoftware;
    public void ClickOnCRMsoftwareButton()
    {
        CRMsoftware.click();
    }

    @FindBy(xpath = "//img[@class='imgmed2']")
    @CacheLookup
    WebElement ERPsoftware;
    public void ClickOnERPsoftwareButton()
    {
        ERPsoftware.click();
    }
    @FindBy(xpath = "//a[@class='dropdown-items'][normalize-space()='Vision Mission']")
    @CacheLookup
    WebElement VisionButton;
    public void ClickOnVisionButton()
    {
        VisionButton.click();
    }
}
