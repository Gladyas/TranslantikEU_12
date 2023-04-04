package com.translantik.pages;

import com.translantik.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class general_InformPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")
      public WebElement vehiclesPages;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-752131045\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[3]")
    public WebElement carPages;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/h5/span")
    public WebElement generalInform;

    public void GeneralInform(){
        vehiclesPages.click();
        BrowserUtils.sleep(2);
        carPages.click();
        BrowserUtils.sleep(2);
        generalInform.isDisplayed();

    }


}
