package signuplogin;

import base.BaseTests;
import org.testng.annotations.Test;

public class TestSignupLoginPage extends BaseTests {
    @Test
    public void signUpTest(){
        var signUp = homePage.clickSignupLoginPage();
        signUp.fillData("Gedeon","gdufitimana@gmail.com");
//        signUp.clickSignUptButton();


    }
}
