package alert_upload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContactTest extends BaseTests {

    @Test
    public void contactPageTests(){
        var contactPage = homePage.clickContactLink();
        String message = "I wanted to greet you in the name of Jesus";
        contactPage.fillOutContactForm("Gedeon","gdufitimana@gmail.com","Greetings",message);
        contactPage.attachFileAndSubmit("C:\\Users\\Gedeon\\Desktop\\Selenium_test\\src\\test\\resources\\file.txt");

        //After attaching file, we get an alert_upload and this method is accepting an alert_upload
        contactPage.alertsAccept();
        assertEquals(contactPage.successMessage(),"Success! Your details have been submitted successfully.","Text is different from what is expected");

    }
}
