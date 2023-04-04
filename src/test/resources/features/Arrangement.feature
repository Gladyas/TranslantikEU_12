
  Feature: As a user, I should be able to arrange vehicle table data under Fleet-Vehicle page

    Background:  user  is on fleet-vehicles page
      Given user is on fleet-vehicles page

      @TRAN10-533
      Scenario:View per page button is displayed and clickable
        When view per page button is displayed
        Then view per page button is clickable




     Scenario: The value of 'View Per Page' should be '25' by default
          When view per page button is displayed
          Then the value is twenty five by default


       @reyhan
      Scenario:'View Per Page' includes the values shown as below and the user can select each of them:
          10,25,50,100

           When view per page button is clicked
           And each values are displayed
           Then each values are selectable
