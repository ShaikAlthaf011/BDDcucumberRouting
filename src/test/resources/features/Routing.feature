Feature: Login Routing Funcation

  Scenario: Application Functionality to the Marketplace
    Given I am login to the apllication
    When I am Click the Navbar application
    Then I verify the Url
    And Close the browser

  Scenario: Application Contact URl
    Given I am login to the apllication
    When I am click contact
    Then I Verify the contact url
    And Close the browser

  Scenario: Application Home about url
    Given I am login to the apllication
    When  I am about and Home
    Then I am verify the Url
    And Close the browser

