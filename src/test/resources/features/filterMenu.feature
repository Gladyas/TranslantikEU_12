Feature: Filter Menu




  Background:
    Given The user logged in as "sales manager"
    When The user navigates to "Fleet" "Vehicles"
    And The user clicks on filterIcon

  @filterMenu
  Scenario:Manage Filter Button visible
    Then The user should see Manage Filter button became visible
