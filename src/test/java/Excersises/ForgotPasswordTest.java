package Excersises;

import base.BaseTests_1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTests_1 {

    @Test
    public void retrievePasswordTest(){

        var forgotPassword = homePage.clickForgotPassword();
        var emailsentPage = forgotPassword.retrievePassword("tau@example.com");
        var getMessage = emailsentPage.getTextMessage();
        assertEquals(getMessage, "Your e-mail's been sent!", "Message is incorrect");
    }

}
