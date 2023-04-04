package com.translantik.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FleetVehiclePage extends BasePage {

    @FindBy(name = "_username")
    public static WebElement inputUsername;

    @FindBy(name = "_password")
    public static WebElement inputPassword;

    @FindBy(id = "_submit")
    public static WebElement loginButton;

    public static void loginWithCredentials(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    @FindBy(xpath="//*[@id='main-menu']/ul/li[1]/a/span")
    public static WebElement fleet;

    @FindBy(xpath="//span[.='Vehicles']")
    public static WebElement fleetVehicle;



// commit


}
