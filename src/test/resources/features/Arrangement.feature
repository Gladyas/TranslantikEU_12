
  Feature: As a user, I should be able to arrange vehicle table data under Fleet-Vehicle page

    Background:  user on fleet-vehicles page
      Given user on fleet-vehicles page

      @TRAN10-533
      Scenario:View per page button is displayed and clickable
        When view per page button is displayed
        Then view per page button is clickable

