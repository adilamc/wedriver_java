package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver =  driver;
    }

    /**
     *Scroll until para specified with index in the view
     * @param index 1 based
     */
    public void scrollToParagraph(int index){
        String script ="window.scrollTo(0, document.body.scrollHeight)";
        var jsExecuter =(JavascriptExecutor)driver;
        while ((getNumberOfParagraphPresent() < index)) {
            jsExecuter.executeScript(script);

        }
    }
    private int getNumberOfParagraphPresent(){
        return driver.findElements(textBlocks).size();
    }
}
