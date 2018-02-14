package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import stepdefinition.SharedSD;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mo Tazrian on 2/14/18.
 */
public class AmazonLoginPage extends BasePage{

    private By emailTextField = By.cssSelector("#ap_email");
    private By continueButton = By.cssSelector("#continue");
    private By passwordTextField = By.cssSelector("#ap_password");
    private By signInButton = By.cssSelector("#signInSubmit");

    public void enterEmail(String string) {
            sendText(emailTextField, string);
    }

    public void enterPassword(String string) {
        try {
            SharedSD.getDriver().findElement(passwordTextField).sendKeys(string);
        }
        catch (NoSuchElementException e) {
            System.out.println("is it finding you");
            clickOn(continueButton);
            SharedSD.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            SharedSD.getDriver().findElement(passwordTextField).sendKeys(string);
        }
    }

    public void clickContinueButton() {
        SharedSD.getDriver().findElement(continueButton).click();
    }

    public void clickSignInButton() {
        SharedSD.getDriver().findElement(By.cssSelector("#ap_password")).click();
    }

}
