package aequilibrium.pages;

import org.openqa.selenium.By;

import aequilibrium.pages.common.PageBase;

public class HomePage extends PageBase {

    private final String HEADER = "header_container";

    public boolean isHomePageDisplayed() {
        return isDisplayed(By.id(HEADER));
    }
}
