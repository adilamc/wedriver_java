package keys;

import base.BaseTests_1;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests_1 {

   @Test
   public void testBackspace(){
       var keyPage = homePage.clickKeyPresses();
       keyPage.enterText("A" + Keys.BACK_SPACE);
       assertEquals(keyPage.getResult(),"You entered: BACK_SPACE", "Didn't eneter backspace");
   }

   @Test
    public void testHsh(){
       var keyPage = homePage.clickKeyPresses();
       keyPage.enterHash();

   }
}
