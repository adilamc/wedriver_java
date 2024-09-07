package navigation;

import base.BaseTests_1;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests_1 {

    @Test
    public void testNavigator(){
        homePage.clickOnDynamicLoading().clicExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com");
    }

    @Test
    public void testMultipleWindowNavigator(){
        homePage.clickOnMultipleWindow().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testEg2InNewWindow(){
        homePage.clickOnDynamicLoading().clickExample2ToNewWindow();
        getWindowManager().switchToNewWindow();
    }
}
