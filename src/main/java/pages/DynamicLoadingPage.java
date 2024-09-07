package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_eg1 =By.xpath(String.format(linkXpath_Format,"Example 1"));
    private By link_eg2 =By.xpath(String.format(linkXpath_Format,"Example 2"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver =driver;
    }

    public DynamicLoadingExample1Page clicExample1(){
        driver.findElement(link_eg1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clicExample2(){
        driver.findElement(link_eg2).click();
        return new DynamicLoadingExample2Page(driver);
    }
    public DynamicLoadingExample2Page clickExample2ToNewWindow(){
        driver.findElement(link_eg2).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
        return new DynamicLoadingExample2Page(driver);
    }

}
