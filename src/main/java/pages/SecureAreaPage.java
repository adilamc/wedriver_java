package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By successMessage = By.id("flash");
    private By logoutButton = By.xpath("//a[@class ='button secondary radius']");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(successMessage).getText();
    }

    public LoginPage clickLogoutButton(){
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
}
