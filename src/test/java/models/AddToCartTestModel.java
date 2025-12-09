package models;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTestModel extends BaseTests  {
    @Test
    public void addToCartTest(){
        var addToCart =homePage.clickProductsLink();
        addToCart.addToCart();
        String popupString = "Your product has been added to cart.";
        assertEquals(addToCart.getModelText(),popupString,"Pop is unreachable");
        addToCart.goToCartFromPopUp();

    }


}
