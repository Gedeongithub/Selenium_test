package contact;

import base.BaseTests;
import org.testng.annotations.Test;

public class ContactTest extends BaseTests {

    @Test
    public void contactPageTests(){
        var contactPage = homePage.clickContactLink();
        String message = "I wanted to greet you in the name of Jesus";
        contactPage.fillOutContactForm("Gedeon","gdufitimana@gmail.com","Greetings",message);
        contactPage.attachFileAndSubmit("C:\\Users\\Gedeon\\Desktop\\Selenium_test\\resources\\chromedriver.exe");

    }
}
