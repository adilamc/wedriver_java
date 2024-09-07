package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver =driver;
        navigate =driver.navigate();
    }

    public void goBack(){
//        driver.navigate().back();
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("no of tabs" + windows.size());
        System.out.println("Window handles");
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("switching to window: " + window);
            driver.switchTo().window(window);
            System.out.println("current window title: " + driver.getTitle());
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
    public void switchToNewWindow(){
        var windows = driver.getWindowHandles();
        System.out.println("no of tabs" + windows.size());
        System.out.println("Window handles");
        windows.forEach(driver.switchTo()::window);
//        windows.forEach(System.out::println);
//        for(String window : windows){
//            System.out.println("switching to window: " + window);
//            driver.switchTo().window(window);
//            System.out.println("current window title: " + driver.getTitle());
//            }
//        }
    }
}
