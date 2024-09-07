package hover;

import base.BaseTests_1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class hoverTests extends BaseTests_1 {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickOnHovers();
       var caption = hoversPage.hoverOverFigure(1);
       assertTrue(caption.isCaptionDisplayed(),"caption is not displayed");
       assertEquals(caption.getTitle(),"name: user1","caption title incorrect");
       assertEquals(caption.getLinkText(),"View profile", "caption link text incorrect");
       assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");

    }
}
