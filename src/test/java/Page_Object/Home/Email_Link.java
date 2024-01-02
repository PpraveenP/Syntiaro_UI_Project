package Page_Object.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Email_Link {
    WebDriver ldriver;

    public Email_Link(WebDriver redriver)
    {
        ldriver=redriver;
        PageFactory.initElements(redriver,this);
    }

    @FindBy(xpath = "//a[@class='actualemail']")
    @CacheLookup
    WebElement Emailbtn;
    public void ClickOnEmailButton()
    {
        Emailbtn.click();
    }

}
