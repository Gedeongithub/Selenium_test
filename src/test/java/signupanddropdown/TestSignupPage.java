package signupanddropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSignupPage extends BaseTests {
    @Test
    public void signUpTest(){
        var signUp = homePage.clickSignupLoginPage();
        signUp.fillData("Gedeon","gdufitimana123@gmail.com");
         accInfo.fillInAccountInfo();

         String expectedResult = "Account Created!".toUpperCase();
         assertEquals(accInfo.accountCreationSuccessMessage(),expectedResult,"Failed to create account");

    }


}
