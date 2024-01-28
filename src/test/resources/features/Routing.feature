Feature: Login Routing Funcation

  Scenario: Application Functionality to the Marketplace
    Given Login navigate to The Application
    When Verify  the Navbar about link
    Then verify the Url
    And Close the browser

  Scenario: Application Contact URl
    Given  Login navigate to The Application
    When Verify click  on the contact button
    Then Verify the contact url
    And Close the browser

  Scenario: Application Home about url
    Given Login navigate to The Application
    When  Verify click on the button about and Home
    Then I am verify the Url
    And Close the browser

