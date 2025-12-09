package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ProductPage {
    private WebDriver driver;


    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickToScroll() {
        List<WebElement> cards = driver.findElements(By.className("col-sm-4"));
        WebElement lastCard = cards.get(cards.size() - 1);

        new Actions(driver).moveToElement(lastCard).perform();
    }

}
