package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    private WebDriver driver;
    private By name = By.cssSelector("input[name='name']");
    private By email = By.cssSelector("input[name='email']");
    private By subject = By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
    private By textArea = By.id("message");

    private By fileField = By.name("upload_file");
    private By submitButton = By.cssSelector("input[data-qa='submit-button']");


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
//the method to accept the alert_upload which popup after hitting submit button
    public void alertsAccept(){
        driver.switchTo().alert().accept();
    }

    public String successMessage(){
        By success = By.cssSelector(".status");
        return driver.findElement(success).getText();
    }
}
