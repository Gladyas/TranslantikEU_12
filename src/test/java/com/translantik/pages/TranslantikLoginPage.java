package com.translantik.pages;

import com.translantik.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TranslantikLoginPage {


    public TranslantikLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "prependedInput")
    public WebElement inputUsername;

    @FindBy(id= "prependedInput2")
    public WebElement inputPassword;

    @FindBy(xpath= "//button[@type='submit']")
    public WebElement loginButton;


    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement quickLaunchPadHeader;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboardHeader;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement invalidError;


    @FindBy(xpath = "//a[@href=\"/user/reset-request\"]")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement userNameBoard;

    @FindBy(xpath = "//h2[@class='title']")
    public WebElement loginTitle;




}
