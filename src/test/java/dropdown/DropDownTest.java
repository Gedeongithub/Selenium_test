package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTests {

    @Test
    public void testDropDown(){
        var dropPage = homePage.clickSignupLoginPage();
        dropPage.fillData("Gedeon","gdufitimana@gmail.com");
        accountInfo.selectingFromDropDown("India");


    }
}
