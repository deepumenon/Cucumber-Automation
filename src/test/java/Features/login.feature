Feature: Login to application with valid and invalid credentials

  Background:
    And user clicks on login link


  Scenario: Login should be success
    And user enters the username as "deepak1223@gmail.com"
    And user enters the password as "Deepak"
    When user clicks the login button
    Then login should be success
@smoke
  Scenario: Login should be fail
    And user enters the username as "deepak12243@gmail.com"
    And user enters the password as "Deepak123"
    When user clicks the login button
    But login should be fail
