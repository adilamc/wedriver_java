package Excersises;

import base.BaseTests_1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests_1 {

    @Test
    public void moveSliderTest(){
        var sliderPage = homePage.clickHorixontalSlider();
        sliderPage.moveSlider("4");
        assertEquals(sliderPage.getSliderValue(), "4", "slider value is incorrect");

    }
}
