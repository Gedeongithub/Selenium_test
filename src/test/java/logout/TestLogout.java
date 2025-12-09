package logout;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLogout extends BaseTests {
    @Test
    public void testLogout(){
        var login = homePage.clickLoginPage();
        login.clickLogin();
        homePage.clickLogOut();
        String initialLoginPageText = "Login";
        assertEquals(login.loginInPageText(),initialLoginPageText,"You are not on login page, no logout happened!");


    }
}
