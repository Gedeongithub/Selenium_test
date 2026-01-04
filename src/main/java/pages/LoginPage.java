package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage {
    private WebDriver driver;
    private By first = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    private By password = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    private By loginButton = By.cssSelector("button[data-qa='login-button']");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    public void clickLogin(){
        driver.findElement(first).sendKeys("gdufitimana@gmail.com");
        driver.findElement(password).sendKeys("12345");
        driver.findElement(loginButton).click();
    }
    //This method is to return the text on login page before we log on, and it will return string to compare to the one we started,
    // with before we log out
    public String loginInPageText(){
        System.out.println(driver.findElement(loginButton).getText());
        return driver.findElement(loginButton).getText();
    }

    public String loggedInUser(){
        return driver.findElement(By.cssSelector("a b")).getText();
    }


}
