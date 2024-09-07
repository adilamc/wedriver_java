package frames;

import base.BaseTests_1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests_1 {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWYSIWYGEditor();
        editorPage.clearTextArea();

        String text1 = " Hello";
        String text2 ="World";
        editorPage.setTextArea(text1);
        editorPage.increaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1 + " " + text2, "error");
    }
}
