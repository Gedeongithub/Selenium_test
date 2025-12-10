package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage {
    private WebDriver driver;


    public ProductPage(WebDriver driver){
        this.driver = driver;
    }


//Method to scroll to certain index
    public void scrollToCard(int index) {
        List<WebElement> cards = driver.findElements(By.className("col-sm-4"));

        if (index < 0 || index >= cards.size()) {
            throw new IllegalArgumentException("Index " + index + " is out of range! Total cards: " + cards.size());
        }
        WebElement targetCard = cards.get(index);

        new Actions(driver).moveToElement(targetCard).perform();
    }


    public void hoverProduct(){
        List<WebElement> elements = driver.findElements(By.className("col-sm-4"));
        Actions action = new Actions(driver);
        action.moveToElement(elements.get(2)).perform();

    }

    public void addToCart(){
        By addToCartbtn = By.cssSelector("a[data-product-id='2']");
        System.out.println(driver.findElement(addToCartbtn).getText());
        driver.findElement(addToCartbtn).click();
    }

    //Model text
    public String getModelText(){
        WebElement text = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//p[contains(text(), 'added to cart')]")
                ));
        assert text != null;
        return text.getText();

    }
    //Method to navigate to cart after getting to pop up
    public void goToCartFromPopUp(){
        By viewCart = By.cssSelector("p a");
        driver.findElement(viewCart).click();
    }

}
