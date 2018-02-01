package dark_sky_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

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

    //    Method to select from a dropdown box by visible text
    public void selectDropDown(By locator, String string) {
        Select dropdown = new Select(DriverWrapper.getDriver().findElement(locator));
        dropdown.selectByVisibleText(string);
    }

    //    Overloaded method to select by index
    public void selectDropDown(By locator, int index) {
        Select dropdown = new Select(DriverWrapper.getDriver().findElement(locator));
        dropdown.selectByIndex(index);
    }

    //    Method to return whether element is displayed
    public void isDisplayed(By locator) {
        boolean result = DriverWrapper.getDriver().findElement(locator).isDisplayed();
        System.out.println("Element is displayed: " + result);
    }

    //    Method to return whether element is selected
    public void isSelected(By locator) {
        boolean result = DriverWrapper.getDriver().findElement(locator).isSelected();
        System.out.println("Element is selected: " + result);
    }

    //    Method to return whether element is enabled
    public void isEnabled(By locator) {
        boolean result = DriverWrapper.getDriver().findElement(locator).isEnabled();
        System.out.println("Element is enabled: " + result);
    }

    public void selectFromCalendar(By locator, String string) {
        WebElement dates = getDriver().findElement(locator);
        List<WebElement> listOfDates = dates.findElements(locator);
    }

    //    Method to select window by index
    public void selectWindow(int index) {
        List<String> listOfWindows = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(listOfWindows.get(index));
    }

    //    Method to select root window
    public void selectRootWindow() {
        List<String> listOfWindows = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(listOfWindows.get(0));
    }

//    Method to close all windows and switch to root window
    public void closeAllAndSwitchToRoot() {
        List<String> listOfWindows = new ArrayList<>(getDriver().getWindowHandles());
        for (int i = 1; i < listOfWindows.size(); i++) {
            getDriver().switchTo().window(listOfWindows.get(i));
            getDriver().close();
        }
        getDriver().switchTo().window(listOfWindows.get(0));
    }

    public static void mouseOver(By locator) throws InterruptedException {
        WebElement element = getDriver().findElement(locator);

        Actions action = new Actions(getDriver());
        action.moveToElement(element).build().perform();
        Thread.sleep(2000);
    }

//    Click element from auto complete dropdown
    public void clickFromAutoCompleteByText(By locator, String string) throws InterruptedException {
        List<WebElement> elements = getDriver().findElements(locator);
        for (WebElement s1 : elements) {
            System.out.println(s1.getText());
            if (s1.getText().equalsIgnoreCase(string)) {
                s1.click();
                Thread.sleep(2000);
                break;
            }
        }
    }

    public void switchToFrame(String string) {
        getDriver().switchTo().frame(string);
    }

    public void acceptAlert() {
        getDriver().switchTo().alert().accept();
    }

    public void dismissAlert() {
        getDriver().switchTo().alert().dismiss();
    }

    public void sendInputToAlert(String string) {
        getDriver().switchTo().alert().sendKeys(string);
    }
}



