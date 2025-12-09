package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import pages.AccountInformationPage;
import pages.HomePage;

import java.time.Duration;

public class BaseTests {
private WebDriver driver;
protected HomePage homePage;
protected AccountInformationPage accInfo;

@BeforeClass
public void SetUp(){
    System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.automationexercise.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    homePage = new HomePage(driver);
    accInfo = new AccountInformationPage(driver);

}
}
