package login;

import base.BaseTests;
import base.BaseTests_1;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests_1 {

    @Test
    public void testSuccesssfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.loginButtonClick();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
        loginPage = secureAreaPage.clickLogoutButton();
        assertTrue(loginPage.getStatusAlert().contains("You logged out of the secure area!"),
                "You logged out of Secure Area");
//        assertEquals(loginPage.getStatusAlert(),"You logged out of the secure area! ×",
//                "You logged out of Secure Area");

    }

}
