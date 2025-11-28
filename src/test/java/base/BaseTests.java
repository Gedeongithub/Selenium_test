package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.AccountInformationPage;
import pages.HomePage;

public class BaseTests {
private WebDriver driver;
protected HomePage homePage;
protected AccountInformationPage accountInfo;
@BeforeClass
public void SetUp(){
    System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.automationexercise.com/");
    homePage = new HomePage(driver);
    accountInfo = new AccountInformationPage(driver);
}
}
