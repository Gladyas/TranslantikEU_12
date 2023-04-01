package com.translantik.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */

import com.translantik.pages.TranslantikLoginPage;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    TranslantikLoginPage translantikLoginPage=new TranslantikLoginPage();

    //import from io.cucumber.java not from junit
//    @Before (order = 1)
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    //@Before (value = "@login", order = 2)
    public void setupScenarioForLogins(){
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    @Before(value = "@@TRAN10-520", order = 0)
    public void setupForDeleteCar(){
        String loginUrl = ConfigurationReader.getProperty("translantik.url");
        Driver.getDriver().get(loginUrl);
        translantikLoginPage.inputUsername.
                sendKeys(ConfigurationReader.getProperty("salesManagerUsername"));
        translantikLoginPage.inputPassword.
                sendKeys(ConfigurationReader.getProperty("salesManagerPassword"));
        translantikLoginPage.loginButton.click();



    }


    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value


        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


        //BrowserUtils.sleep(5);
        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

   // @BeforeStep
    public void setupStep(){
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("--------> applying tearDown using @AfterStep");
    }


}
