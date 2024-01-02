package Test_Cases.Home_Page_TC;

import Page_Object.Home.Email_Link;
import Test_Cases.BaseClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Email extends BaseClass {
    @Test
    public void validating_Email_Link() throws AWTException, InterruptedException {
        driver.get(baseURL);
        Email_Link el=new Email_Link(driver);
        el.ClickOnEmailButton();
        //driver.switchTo().window();
        Thread.sleep(2000);
        Robot r=new Robot();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_T);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_E);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_S);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_T);
    }
}
