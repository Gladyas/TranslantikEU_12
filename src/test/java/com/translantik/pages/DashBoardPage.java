package com.translantik.pages;

import com.translantik.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage {

    @FindBy(css = ".user-menu-dropdown>a")
    public WebElement userMenu;

    @FindBy(linkText = "Logout")
    public WebElement logOutBtn;

    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Actions action = new Actions(Driver.getDriver());
    public void navigateTo(String tab, String module) {
        waitUntilLoaderScreenDisappear();
        action.moveToElement(Driver.getDriver().findElement(By.linkText(tab))).perform();
        Driver.getDriver().findElement(By.linkText(module)).click();
    }


}
