package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Method to return the signup page to create account
    public SignupPage clickSignupLoginPage(){
        clinkLink("Signup / Login");
        return new SignupPage(driver);
    }

    //Method to return login page to log on
    public LoginPage clickLoginPage(){
        clinkLink("Signup / Login");
        return new LoginPage(driver);
    }

    public LoginPage clickLogOut(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
        clinkLink(" Logout");
        return new LoginPage(driver);
    }


    //Method to takes us to products page and scroll to teh bottom
    public ProductPage clickProductsLink(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a/i")).click();
        return new ProductPage(driver);
    }

    //method to go to contact page

    public ContactPage clickContactLink(){
        clinkLink("Contact us");

        return new ContactPage(driver);
    }

    private void clinkLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
}
