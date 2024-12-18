package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator =By.id("loading");
    private By loadedText = By.xpath("//div[@id='finish']");

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnStart(){
        driver.findElement(startButton).click();
    }

    public void clickStart(){
        driver.findElement(startButton).click();
    }

    public String getLoadedText(){
//        WebDriverWait wait =new WebDriverWait(driver,5);
//        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText);
        FluentWait wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        return driver.findElement(loadedText).getText();
    }

}
