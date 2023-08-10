@regression
Feature: Login into DemoGuru99 Application

  Scenario Outline: Login to DemoGuru99 Application with Correct User ID and Password
    Given User Open the URL for Orange HRM
    Then User Enters the "<username>"
    And the the User Enters the "<password>"
    When User Clicks on Login Button
    Then User will be navigated to Orange Hrm Home page

    Examples: 
      | username   | password |
      | mngr518078 | sAsysEh  |
