package com.translantik.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GridPage extends BasePage{

    @FindBy(css="[class='fa-filter hide-text']")
    public WebElement filterIcon;

    @FindBy(css="[class='add-filter-button']")
    public WebElement manageFilterButton;
}
