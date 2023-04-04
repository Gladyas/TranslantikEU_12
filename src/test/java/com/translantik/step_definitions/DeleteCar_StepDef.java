package com.translantik.step_definitions;

import com.translantik.pages.BasePage;
import com.translantik.pages.FleetVehiclePage;
import com.translantik.pages.TranslantikLoginPage;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DeleteCar_StepDef extends BasePage {
    FleetVehiclePage fleetVehiclePage = new FleetVehiclePage();
    TranslantikLoginPage translantikLoginPage = new TranslantikLoginPage();
    Actions actions= new Actions(Driver.getDriver());


    @When("user hovering mouse over the three dots")
    public void user_hovering_mouse_over_the_three_dots() {
        //enter as a user (getting data from configuration reader
        //for loading

        //actions.moveToElement(fleetVehiclePage.firstCarThreeDot).perform();





    }
    @Then("user can see the delete button")
    public void user_can_see_the_delete_button() {
    Driver.closeDriver();
    }


}
