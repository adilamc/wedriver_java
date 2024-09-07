package javascripts;

import base.BaseTests_1;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests_1 {

    @Test
    public void testScrollToTable(){
        homePage.clickOnLargeandDeepDOM().scrollToTable();

    }

    @Test
    public void testToScrollParagraph(){
        homePage.clickOnInfiniteScroll().scrollToParagraph(5);
    }
}
