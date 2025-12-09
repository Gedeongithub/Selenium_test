package productsscroll;

import base.BaseTests;
import org.testng.annotations.Test;

public class TestProductsScroll extends BaseTests {

    @Test
    public void navigateToProductsToScroll(){
        var products = homePage.clickProductsLink();
        products.scrollToCard(9);
    }
}
