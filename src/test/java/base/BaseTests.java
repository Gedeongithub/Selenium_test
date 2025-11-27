package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
//        WebElement shift = driver.findElement(By.linkText("Shifting Content"));
//        shift.click();
//        WebElement shift2 = driver.findElement(By.linkText("Example 1: Menu Element"));
//        shift2.click();
//        WebElement ulList = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul"));
//        List<WebElement> child = ulList.findElements(By.tagName("li"));
//        int numberOflist = child.size();
//        System.out.println("We have list: "+ numberOflist);


//        driver.manage().window().setSize(new Dimension(275,812));
//        List<WebElement> list = driver.findElements(By.tagName("a"));
//        WebElement element1 =driver.findElement(By.linkText("Shifting Content"));
////        element1.
//        WebElement input = driver.findElement(By.linkText("Inputs"));
//        input.click();
////        System.out.println(list.size());
//        WebElement element = driver.findElement(By.linkText("Broken Images"));
//        element1.click();
////        element.
//        System.out.println(driver.getTitle());

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
@AfterMethod
public void takeScreenshot(){
        var camera =(TakesScreenshot)driver;
        File screenShot = camera.getScreenshotAs(OutputType.FILE);
//    System.out.println("Screenshot stored at: "+screenShot.getAbsolutePath());
    try {
        Files.move(screenShot, new File("resources/screenshots/test.png"));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
//    public static void main(String[] args){
//        BaseTests test = new BaseTests();
//        test.setUp();
//
//    }
}


