package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class AccountInformationPage {
    private WebDriver driver;
    private By selectFromField = By.id("country");

    public AccountInformationPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectingFromDropDown(String option){
        selectOption().selectByVisibleText(option);
    }

    public List<String> findElementToDropDown(){
        List<WebElement> selectedCountry = selectOption().getAllSelectedOptions();
        return  selectedCountry.stream().map(e ->e.getText()).collect(Collectors.toList());
    }

    private Select selectOption(){
        return new Select(driver.findElement(selectFromField));
    }
}
