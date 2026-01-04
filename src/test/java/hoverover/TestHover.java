package hoverover;

import base.BaseTests;
import org.testng.annotations.Test;

public class TestHover extends BaseTests {
    @Test

    public void hoverTest(){
        var hoverElement = homePage.clickProductsLink();
        hoverElement.hoverProduct();
    }
}
