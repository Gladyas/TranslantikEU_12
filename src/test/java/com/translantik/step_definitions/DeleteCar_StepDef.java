package com.translantik.step_definitions;

import com.translantik.pages.BasePage;
import com.translantik.pages.FleetVehiclePage;
import com.translantik.pages.TranslantikLoginPage;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class DeleteCar_StepDef {

    TranslantikLoginPage translantikLoginPage=new TranslantikLoginPage();
    Actions act= new Actions(Driver.getDriver());


    @When("user hovering mouse over the three dots")
    public void user_hovering_mouse_over_the_three_dots() {

    }
    @Then("user can see the delete button")
    public void user_can_see_the_delete_button() {

    }


}
