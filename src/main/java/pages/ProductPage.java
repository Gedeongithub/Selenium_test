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

    public void clickToScroll() {
        List<WebElement> cards = driver.findElements(By.className("col-sm-4"));
        WebElement lastCard = cards.get(cards.size() - 1);

        new Actions(driver).moveToElement(lastCard).perform();
    }

    public void hoverProduct(){
        List<WebElement> elements = driver.findElements(By.className("col-sm-4"));
        Actions action = new Actions(driver);
        action.moveToElement(elements.get(2)).perform();

    }

    public void addToCart(){
        By addToCartbtn = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a");
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
