package com.translantik.step_definitions;

import com.translantik.pages.DashBoardPage;
import com.translantik.pages.FleetVehiclePage;
import com.translantik.pages.GridPage;
import com.translantik.pages.TranslantikLoginPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterMenu_StepDef {
    GridPage gridPage=new GridPage();

    FleetVehiclePage fleetVehiclePage = new FleetVehiclePage();
    TranslantikLoginPage translantikLoginPage = new TranslantikLoginPage();



    @Given("user on fleet-vehicles page")
    public void user_on_fleet_vehicles_page() {
        Driver.getDriver().get("browser");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        translantikLoginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("TruckDriverUsername"));
        translantikLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("TruckDriverPassword"));
        translantikLoginPage.loginButton.click();
    //    fleetVehiclePage.fleetBtn.click();
    //    fleetVehiclePage.vehiclesBtn.click();
    }

    @When("user clicks on the filter icon")
    public void user_clicks_on_the_filter_icon() {

        //fleetVehiclePage.filterBtn.click();
    }

    @Then("the {string} button should be displayed")
    public void the_button_should_be_displayed(String string) {

        //fleetVehiclePage.manageFilterBtn.isDisplayed();
    }

    @Given("The user logged in as {string}")
    public void theUserLoggedInAs(String userType) {
        new TranslantikLoginPage().loggedAs(userType);
    }

    @When("The user navigates to {string} {string}")
    public void theUserNavigatesTo(String tab, String module) {
        BrowserUtils.waitFor(3);
        DashBoardPage dashboardPage = new DashBoardPage();
        dashboardPage.navigateTo(tab, module);
    }

    @And("The user clicks on filterIcon")
    public void theUserClicksOnFilterIcon() {
        gridPage.waitUntilLoaderScreenDisappear();//Added By @CharlieAlfa
        BrowserUtils.waitForClickablility(gridPage.filterIcon, 10);
        gridPage.filterIcon.click();
    }

    @Then("The user should see Manage Filter button became visible")
    public void theUserShouldSeeManageFilterButtonBecameVisible() {
        Assert.assertTrue("Verify Manage Filter button became visible", gridPage.manageFilterButton.isDisplayed());
    }
}
