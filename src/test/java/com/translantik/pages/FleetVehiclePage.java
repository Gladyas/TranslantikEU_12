package com.translantik.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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
    public  WebElement fleet;

    @FindBy(xpath="//span[.='Vehicles']")
    public  WebElement fleetVehicle;


    @FindBy(xpath="//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPageButton;

    @FindBy(xpath="//a[@class='dropdown-item']")
    public List<WebElement> allValues;




    //comment
}
