package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    private WebDriver driver;
    private By name = By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
    private By email = By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
    private By textArea = By.id("message");
    private By subject = By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
    private By fileField = By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input");
    private By submitButton = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");


    public ContactPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillOutContactForm(String name, String email, String subject, String Message){
        driver.findElement(this.name).sendKeys(name);
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(this.subject).sendKeys(subject);
        driver.findElement(textArea).sendKeys(Message);
    }

    public void attachFileAndSubmit(String absPath){
        driver.findElement(fileField).sendKeys(absPath);
        clickSubmit();
    }
    private void clickSubmit(){
        driver.findElement(submitButton).click();
    }
//the method to accept the alert which popup after hitting submit button
    public void alertsAccept(){
        driver.switchTo().alert().accept();
    }
}
