package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ProductsPage {
    private WebDriver driver;
    private By cartButton = By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a");

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }
    //Scrolling the product page
    public void productsScrollToProduct(int index){

        int listOfProducts = findAllChildElement();

        String script = "arguments[0].scrollIntoView;";
        String script1 = "window.scrollTo(0,document.body.scrollHeight";
        var executeJS = (JavascriptExecutor)driver;
        while(findAllChildElement()>index-1){
            executeJS.executeScript(script1);
        }

    }

    //Method to find the all elements in products page
    private int findAllChildElement(){
        By boxContainer = By.className("features_items");
        return driver.findElements(boxContainer).size();
    }

    public void ClickAddToCartButton(){
        driver.findElement(cartButton).click();

    }
    // After clicking the the add to cart button, pop-up appear and I wanted to go on that pop-up and get the text called "Added!"
    //Hence I got "Added!" text I can even click on the "Continue shopping button" too. Here is the code in getPopupText() method.

    public String getPopUpText(){
        String resultsTextFromPopUp = "";
         By getAddedToCartFromPopUp = By.cssSelector(".modal-header h4");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement title = wait.until(ExpectedConditions.visibilityOf(driver.findElement(getAddedToCartFromPopUp)));
        resultsTextFromPopUp = title.getText();
        System.out.println(resultsTextFromPopUp);
        return resultsTextFromPopUp;
    }
}
