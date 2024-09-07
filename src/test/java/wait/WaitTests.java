package wait;

import base.BaseTests_1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests_1 {

    @Test
    public void waitTests1(){
        var loadingPage = homePage.clickOnDynamicLoading().clicExample1();
        loadingPage.clickStart();
        var text = loadingPage.getLoadedText();
        assertEquals(text, "Hello World!","Incorrect text");

    }

    @Test
    public void waitTests2(){
        var loadingPage = homePage.clickOnDynamicLoading().clicExample2();
        loadingPage.clickOnStart();
        var text = loadingPage.getLoadedText();
        assertEquals(text, "Hello World!","Incorrect text");

    }
}
