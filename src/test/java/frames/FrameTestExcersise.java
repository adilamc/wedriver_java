package frames;

import base.BaseTests_1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTestExcersise extends BaseTests_1 {

    @Test
    public void FrameTestsExc(){
        var nestedFramepage = homePage.clickOnFrames().clickOnNestedFrames();
        String bottom =nestedFramepage.getFramesetName2();
        String left = nestedFramepage.getFramesetName1();
        assertEquals(left, "LEFT", "Error");
        assertEquals(bottom, "BOTTOM", "Error");

    }
}
