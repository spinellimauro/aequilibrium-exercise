package aequilibrium.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import aequilibrium.core.DriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class PageBase {
	
	public static final String BASE_URL = "https://www.saucedemo.com/index.html";

	public void goToIndexPage(){
    	DriverManager.getDriverInstance().get(BASE_URL);
    }
	
    public WebElement getElement(By locator) {
        return DriverManager.getDriverInstance().findElement(locator);
    }
    
    public List<WebElement> getElements(By locator) {
		return DriverManager.getDriverInstance().findElements(locator);
	}
    
    public boolean isDisplayed(By locator) {
    	DriverManager.getDriverInstance().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            getElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } finally {
        	DriverManager.getDriverInstance().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }
    }
    
    public String getElementText(By locator){
        WebElement element = getElement(locator);
        return getElementText(element);
    }

    public String getElementText(WebElement element){
        return element.getText();
    }

    public void completeField(By locator, String value) {
        WebElement element = getElement(locator);
        element.sendKeys(value);
    }

    public void clickElement(By locator) {
        WebElement element = getElement(locator);
        element.click();
    }
}
