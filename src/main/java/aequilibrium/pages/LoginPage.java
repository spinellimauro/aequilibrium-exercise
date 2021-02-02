package aequilibrium.pages;

import org.openqa.selenium.By;

import aequilibrium.pages.common.PageBase;

public class LoginPage extends PageBase {

    private final String USERNAME_FIELD = "user-name";
    private final String PASSWORD_FIELD = "password";
    private final String LOGIN_BUTTON = "login-button";
    private final String MESSAGE_TEXT = "h3[data-test='error']";

    public boolean isLoginDisplayed() {
        return isDisplayed(By.id(LOGIN_BUTTON));
    }
    
    public void setUsername(String username) {
    	completeField(By.id(USERNAME_FIELD), username);
    }

    public void setPassword(String password) {
    	completeField(By.id(PASSWORD_FIELD), password);
    }

    public void login() {
        clickElement(By.id(LOGIN_BUTTON));
    }
    
    public String getMessageText() {
        return getElementText(By.cssSelector(MESSAGE_TEXT));
    }
    
    // Login UI
    
    public void loginIsDisplayed() {
    	isDisplayed(By.id(LOGIN_BUTTON));
    }
    
    public void usernameIsDisplayed() {
    	isDisplayed(By.id(USERNAME_FIELD));
    }
    
    public void passwordIsDisplayed() {
    	isDisplayed(By.id(PASSWORD_FIELD));
    }
    
    public void messageIsDisplayed() {
    	isDisplayed(By.id(MESSAGE_TEXT));
    }
    
}
