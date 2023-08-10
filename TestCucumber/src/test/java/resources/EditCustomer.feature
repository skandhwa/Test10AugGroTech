@sanity

Feature: Edit a New Customer

  Background: 
    Given User Open the URL for Orange HRM

  Scenario Outline: Creating Customer for DemoGuru Application
    Then User Enters the "<username>"
    And the the User Enters the "<password>"
    When User Clicks on Login Button
    Then User will be navigated to Orange Hrm Home page
    Then User will Click on Edit Customer Link
    And User will Enter the "<customer_id>"
    And User will click on Submit
    Then User will update the field of City
    And User Will again Click on Submit

    Examples: 
      | username      | password | customer_id |
      | mngr518078abc | sAsysEh  |       28226 |
