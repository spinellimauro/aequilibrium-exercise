package aequilibrium.steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import aequilibrium.core.DriverManager;

public class CommonSteps {
	
	    @After
	    public void afterScenario(Scenario scenario) {
	        if (scenario.isFailed()) {
	            scenario.embed(((TakesScreenshot) DriverManager
	                    .getDriverInstance()).getScreenshotAs(OutputType.BYTES), "image/png");
	        }
	        DriverManager.dismissDriver();
	    }
	}

