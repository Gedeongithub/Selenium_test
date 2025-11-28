package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage {
    private WebDriver driver;
    private By name = By.name("name");
    private By email = By.xpath("//*[@id=\"form\"]/div[1]/div/div[3]/div/form/input[3]");
    private By signUpButton = By.xpath("//*[@id=\"form\"]/div[1]/div/div[3]/div/form/button");

    public SignupLoginPage(WebDriver driver){
        this.driver = driver;
    }

     public void fillData(String name, String email){
        driver.findElement(this.name).sendKeys(name);
        driver.findElement(this.email).sendKeys(email);
clickSignUptButton();
     }

     private void clickSignUptButton(){
        driver.findElement(signUpButton).click();
     }
}
