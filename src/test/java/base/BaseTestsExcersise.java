package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTestsExcersise {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize(new Dimension(430,932));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();

        WebElement menuElementLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElementLink.click();

        List<WebElement> menuElementsCount = driver.findElements(By.cssSelector("li a[href]"));
        System.out.println(menuElementsCount.size());

        System.out.println(driver.getTitle());

        driver.quit();
    }

    public static void main(String args[]){
        BaseTestsExcersise test = new BaseTestsExcersise();
        test.setUp();
    }
}
