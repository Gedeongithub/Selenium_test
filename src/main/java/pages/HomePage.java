package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignupLoginPage clickSignupLoginPage(){
        clinkLink("Signup / Login");
        return new SignupLoginPage(driver);
    }

    public ProductsPage clickProductMenu(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a/i")).click();
        return new ProductsPage(driver);
    }


    private void clinkLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
}
