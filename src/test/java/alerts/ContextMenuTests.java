package alerts;

import base.BaseTests_1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests_1 {

    @Test
    public void RightClickOnBoxTest(){
        var contextPage = homePage.clickOnContextMenu();
        contextPage.rightClickOnBox();
        String text = contextPage.alert_getText();
        contextPage.alert_clickToAccept();
        assertEquals(text,"You selected a context menu", "Incorrect text");
    }
}
