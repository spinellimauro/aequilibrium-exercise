package aequilibrium.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

import aequilibrium.pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;
    
    private LoginPage getLoginPage() {
        if (loginPage == null) {
        	loginPage = new LoginPage();
        }
        return loginPage;
    }

    @Given("Located in Login Page")
    public void goToLoginPage() {
    	getLoginPage().goToIndexPage();
        Assert.assertTrue(getLoginPage().isLoginDisplayed(), "Login Page was not displayed correctly");
    }

    @When("Complete the Login with username: '(.*)' and password: '(.*)'")
    public void completeLogin(String username, String password) {
    	getLoginPage().setUsername(username);
    	getLoginPage().setPassword(password);
    	getLoginPage().login();
    }

    @Then("The message: '(.*)' was displayed correctly")
    public void compareErrorMessage(String message) {
        Assert.assertEquals(getLoginPage().getMessageText(), message);
    }

    // Login UI Steps
    
    @Then("The username field is correctly displayed")
    public void isUsernameDisplayed() {
    	getLoginPage().usernameIsDisplayed();
    }

    @Then("The password field is correctly displayed")
    public void isPasswordDisplayed() {
    	getLoginPage().passwordIsDisplayed();
    }
    
    @Then("Login button is correctly displayed")
    public void isLoginDisplayed() {
    	getLoginPage().loginIsDisplayed();
    }
    
    @Then("Message is correctly displayed")
    public void isMessageDisplayed() {
    	getLoginPage().messageIsDisplayed();
    }
}
