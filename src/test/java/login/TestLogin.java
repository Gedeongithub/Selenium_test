package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLogin extends BaseTests {

    @Test
    public void testLogin(){
        var login = homePage.clickLoginPage();
        login.clickLogin();

        assertEquals(login.loggedInUser(),"Gedeon","Not logged in");


    }

}
