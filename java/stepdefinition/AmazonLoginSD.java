package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AmazonHomePage;
import framework.AmazonLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import static framework.BasePage.mouseOver;

/**
 * Created by Mo Tazrian on 2/10/18.
 */
public class AmazonLoginSD {

    AmazonHomePage homePage = new AmazonHomePage();
    AmazonLoginPage loginPage = new AmazonLoginPage();

    @Given("^I am on home page of Amazon")
    public void iAmOnHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", "Invalid Home Page");
    }

    @When("^I Hover over to Accounts & List$")
    public void mouseOverAmazon() {
        mouseOver(By.xpath("//*[@id=\"nav-link-accountList\"]"));
    }

    @And("^I click on Sign in button$")
    public void clickSignInButton() {
        homePage.clickSignInButton();
    }

    @And("^I enter invalid email address$")
    public void enterInvalidEmail() throws InterruptedException {
        loginPage.enterEmail("hola@bolas.com");
    }

    @And("^I click continue button$")
    public void clickContinue() throws InterruptedException {
        try {
            loginPage.clickContinueButton(); }
        catch (NoSuchElementException e) {
            loginPage.enterPassword("hola");
            loginPage.clickSignInButton();
        }
    }

    @Then("^I verify invalid error messageSign$")
    public void verifyErrorMessage() {
        SharedSD.getDriver().getPageSource().contains("We cannot find an account with that email address");
    }
}
