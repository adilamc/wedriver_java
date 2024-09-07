package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String framesetName ="frame-top";
    private String frameLeft = "frame-left";
    private String frameBottom = "frame-bottom";
    private By body =By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver =driver;
    }



    public String getFramesetName1(){

        driver.switchTo().frame(framesetName);
        driver.switchTo().frame(frameLeft);
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return text;
    }
    public String getFramesetName2(){
        driver.switchTo().frame(frameBottom);
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return text;
    }


}
