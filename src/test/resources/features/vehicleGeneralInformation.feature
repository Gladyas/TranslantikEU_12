Feature: Display Detailed Vehicle Information

  As a user of the Fleet-Vehicle module
  I want to view detailed information about a specific vehicle
  So that I can keep track of its status and history

  @wip
  Scenario: View General Information Page
    Given I am logged in as a user
    When I click on a vehicle row in the Fleet-Vehicle module
    Then I should be redirected to the General Information page for that vehicle
