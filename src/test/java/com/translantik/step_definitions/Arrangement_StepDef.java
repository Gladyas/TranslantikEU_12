package com.translantik.step_definitions;

import com.translantik.pages.FleetVehiclePage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
}
