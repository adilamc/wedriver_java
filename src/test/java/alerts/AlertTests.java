package alerts;

import base.BaseTests_1;
import org.testng.annotations.Test;

import java.util.Scanner;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests_1 {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptsAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert","Result text incorrect");
    }

    @Test
    public void getTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptsAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm", "Alert text incorrect");

    }

    @Test
    public void getPromptFromAlert(){
//        Scanner scanner = new Scanner(System.in);
        var alertsPage = homePage.clickJavaScriptsAlerts();
        alertsPage.triggerPrompt();
//        String input = scanner.next();
        String input = "TAU Rocks";
        alertsPage.alert_sendText(input);
        alertsPage.alert_clickToAccept();
        String text = alertsPage.getResult();
        assertEquals(text, "You entered: " + input, " Incorrect text");
    }
}
