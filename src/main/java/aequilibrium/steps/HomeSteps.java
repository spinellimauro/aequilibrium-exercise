package aequilibrium.steps;

import io.cucumber.java.en.Then;

import org.testng.Assert;

import aequilibrium.pages.HomePage;

public class HomeSteps {

    private HomePage homePage;
    
    private HomePage getHomePage() {
        if (homePage == null) {
        	homePage = new HomePage();
        }
        return homePage;
    }
    @Then("Home Page is displayed")
    public void isHomePageDisplayed() {
        Assert.assertTrue(getHomePage().isHomePageDisplayed(), "Home Page was not displayed correctly");
    }

   
}
