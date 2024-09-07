package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSendPage {

    private WebDriver driver;
    private By getMessage = By.id("content");

    public EmailSendPage(WebDriver driver){
        this.driver =driver;
    }
    public String getTextMessage(){
        return driver.findElement(getMessage).getText();
    }
}
