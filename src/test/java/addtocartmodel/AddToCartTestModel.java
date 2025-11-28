package addtocartmodel;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTestModel extends BaseTests {
    @Test
    public void addToCartTest(){
        var addToCart =homePage.clickProductMenu();
        addToCart.ClickAddToCartButton();
        assertEquals(addToCart.getPopUpText(),"Added!","Incorrect message");

    }


}
