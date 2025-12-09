package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountInformationPage {
    private WebDriver driver;

    public AccountInformationPage(WebDriver driver){
        this.driver = driver;
    }

    //fill out all account INFOs
    public void fillInAccountInfo(){
        By gender = By.id("id_gender1");
        By  password = By.id("password");
        By checkBox = By.id("optin");


        driver.findElement(gender).click();
        driver.findElement(password).sendKeys("12345");
        driver.findElement(checkBox).click();
        fillDate();
        addressInformation();

    }

    //fill out date
    private void fillDate(){
        By day = By.id("days");
        By month = By.id("months");
        By year = By.id("years");

        Select days = new Select(driver.findElement(day));
        days.selectByVisibleText("10");
        Select months = new Select(driver.findElement(month));
        months.selectByVisibleText("February");
        Select years = new Select(driver.findElement(year));
        years.selectByVisibleText("2021");
    }

    //Dropdown of Country
    public void filloutCountryFromDropDown(){
        By countries = By.id("country");
        new Select(driver.findElement(countries)).selectByVisibleText("United States");
    }

    //Address info

    public void addressInformation(){
        By firstName = By.id("first_name");
        By lastName = By.id("last_name");
        By company = By.id("company");
        By address1 = By.id("address1");
        By address2 = By.id("address2");
        By state = By.id("state");
        By city = By.id("city");
        By zipCode = By.id("zipcode");
        By mobileNumber = By.id("mobile_number");
        By submitBtn = By.cssSelector("button[type='submit']");

        //Passing data now
        driver.findElement(firstName).sendKeys("Gedeon");
        driver.findElement(lastName).sendKeys("Dufitimana");
        driver.findElement(company).sendKeys("The Gym");
        driver.findElement(address1).sendKeys("KG13");
        driver.findElement(address2).sendKeys("Nyarutarama");

        //Method to fillout drop-downed country
        filloutCountryFromDropDown();
        driver.findElement(state).sendKeys("Rwanda");
        driver.findElement(city).sendKeys("Kigali");
        driver.findElement(zipCode).sendKeys("1110001");
        driver.findElement(mobileNumber).sendKeys("+250791110144");
        driver.findElement(submitBtn).click();
    }

    //Text after successfuly creating account
    public String accountCreationSuccessMessage(){
        return driver.findElement(By.cssSelector("div b")).getText();
    }

}
