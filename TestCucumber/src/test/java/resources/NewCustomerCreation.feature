@smoke
Feature: Create a new Customer

  Background: 
    Given User Open the URL for Orange HRM

  Scenario Outline: Creating Customer for DemoGuru Application
    Then User Enters the "<username>"
    And the the User Enters the "<password>"
    When User Clicks on Login Button
    Then User will be navigated to Orange Hrm Home page
    And User Clicks on New Customer Link
    And User Enters Customer "<customername>"
    And user will select the gender

    Examples: 
      | username      | password | customername |
      | mngr518078abc | sAsysEh  | Satish       |
