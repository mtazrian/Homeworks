package facebook_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Mo Tazrian on 1/25/18.
 */
public class BasePage extends DriverWrapper {

//    Method to navigate to url
    public void navigateToUrl(String url) {
        getDriver().navigate().to(url);
    }


//    Method to click element
    public void clickOn(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }


//    Method to send input
    public void sendInput(By locator, String string) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(string);
    }


//    Method to select from a dropdown box
    public void selectDropDownByVisibleText(By locator, String string) {
        Select dropdown = new Select(DriverWrapper.getDriver().findElement(locator));
        dropdown.selectByVisibleText(string);
    }


    public void isDisplayed(By locator) {
        boolean result = DriverWrapper.getDriver().findElement(locator).isDisplayed();
        System.out.println("Element is displayed: " + result);
    }


    public void isSelected(By locator) {
        boolean result = DriverWrapper.getDriver().findElement(locator).isSelected();
        System.out.println("Element is selected: " + result);
    }


    public void isEnabled(By locator) {
        boolean result = DriverWrapper.getDriver().findElement(locator).isEnabled();
        System.out.println("Element is enabled: " + result);
    }
}


