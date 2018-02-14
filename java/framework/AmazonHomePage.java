package framework;

import org.openqa.selenium.By;

/**
 * Created by Mo Tazrian on 2/14/18.
 */
public class AmazonHomePage extends BasePage{

    private By signInDropDown = By.xpath("//*[@id=\"nav-link-accountList\"]");
    private By signInButton = By.cssSelector("#nav-flyout-ya-signin > a");
    private By pageTitle = By.xpath("/html/head/title");


    public void hoverOnSignIn() {
        mouseOver(signInDropDown);
    }

    public void clickSignInButton() {
        clickOn(signInButton);
    }

    public String getPageTitle() {
       return getTextFromElement(pageTitle);
    }
}
