package stepdefinition;

import Utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPage.LoginPage;


public class LoginSD extends LoginPage {


    private LoginPage loginPage = new LoginPage();

    @Given("^I am on  login page$")
    public void verifyLoginPageTitle() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(loginPage.getPageTitle(), "HubSpot Login");

    }

    @When("^I enter (.+) into (Email address|password) field on the login page$")
    public void enterDataIntoTextField(String value, String textField) {

        loginPage.enterMail(value);
        loginPage.enterPassword(textField);
    }

    @And("^I click on login button login page$")
    public void clickOnLoginButton() {
        loginPage.clickOnLogInBtn();
    }

    @And("^I verify invalid login message on login page$")
    public void verifySignInErrorMessage() {
        Assert.assertTrue(loginPage.checkLoginErrorText());
    }
    @Then("^I click on sign up link on login page$")
    public void ClickOnSignUpLink(){
        loginPage.clickOnSignUpLink();

    }

}
