package com.translantik.step_definitions;

import com.translantik.pages.FleetVehiclePage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class Arrangement_StepDef {
    FleetVehiclePage fleetVehiclePage= new FleetVehiclePage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("user on fleet-vehicles page")
    public void user_on_fleet_vehicles_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("transatlantik.url"));
        FleetVehiclePage.loginWithCredentials("user1","UserUser123");
        actions.moveToElement(fleetVehiclePage.fleet).perform();
        fleetVehiclePage.fleetVehicle.click();

    }
    @When("view per page button is displayed")
    public void view_per_page_button_is_displayed() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(fleetVehiclePage.viewPerPageButton));

        //BrowserUtils.sleep(10);
        Assert.assertTrue( fleetVehiclePage.viewPerPageButton.isDisplayed());

    }
    @Then("view per page button is clickable")
    public void view_per_page_button_is_clickable() {
        BrowserUtils.sleep(1);
        Assert.assertTrue(fleetVehiclePage.viewPerPageButton.isEnabled());

    }

    @Then("the value is twenty five by default")
    public void the_value_is_twenty_five_by_default() {
        String actualValue=  fleetVehiclePage.viewPerPageButton.getText();
        System.out.println("actualValue = " + actualValue);
        int expectedValue=25;
        int actualValueInt = Integer.parseInt(actualValue);
        Assert.assertEquals(expectedValue,actualValueInt);



    }



    @When("each values are displayed")
    public void each_values_are_displayed() {

        String [] values =new String[4];
        int j=0;
        for (WebElement each : fleetVehiclePage.allValues){
            System.out.println("each values : " + each.getText());
            values[j++]=each.getText();


        }
        System.out.println(Arrays.toString(values));

        int ActualValue1 = Integer.parseInt(values[0]);
        int ActualValue2=  Integer.parseInt(values[1]);
        int ActualValue3= Integer.parseInt((values[2]));
        int ActualValues4=Integer.parseInt(values[3]);


        Assert.assertEquals(10,ActualValue1);
        Assert.assertEquals(25,ActualValue2);
        Assert.assertEquals(50,ActualValue3);
        Assert.assertEquals(100,ActualValues4);

        




    }
    @Then("each values are selectable")
    public void each_values_are_selectable() {



    }


    @When("view per page button is clicked")
    public void viewPerPageButtonIsClicked() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(fleetVehiclePage.viewPerPageButton));
        fleetVehiclePage.viewPerPageButton.click();


    }
}
