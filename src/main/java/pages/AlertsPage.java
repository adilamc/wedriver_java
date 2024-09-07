package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By clickOnJSAlertButton =By.xpath("//button[text() = 'Click for JS Alert']");
    private By results = By.id("result");
    private By cllickOnJSConfirm = By.xpath("//button[text() = 'Click for JS Confirm']");
    private By clickOnJSPrompt = By.xpath("//button[text() = 'Click for JS Prompt']");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerPrompt(){
        driver.findElement(clickOnJSPrompt).click();
    }

    public void triggerConfirm(){
        driver.findElement(cllickOnJSConfirm).click();
    }

    public void triggerAlert(){
        driver.findElement(clickOnJSAlertButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alert_sendText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }
}
