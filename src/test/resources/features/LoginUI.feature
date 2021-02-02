Feature: Login user inteface function

  @LoginUI
  Scenario: The login interface is displayed correctly
    Given Located in Login Page
    Then The username field is correctly displayed
    And The password field is correctly displayed
    And Login button is correctly displayed

  @LoginUI
  Scenario Outline: The error message is displayed correctly
    Given Located in Login Page
    When Complete the Login with username: '<username>' and password: '<password>'
    Then Message is correctly displayed
    
    Examples:
      | username      | password     |
      | standard_user | invalid      |