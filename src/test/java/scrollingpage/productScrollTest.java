package scrollingpage;

import base.BaseTests;
import org.testng.annotations.Test;

public class productScrollTest extends BaseTests {

    @Test
    public void testProductScroll(){
        var productmenu =homePage.clickProductMenu();
        productmenu.productsScrollToProduct(4);
    }
}
