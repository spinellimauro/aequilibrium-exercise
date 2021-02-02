Feature: As a user i want to Login

  @Login
  Scenario Outline: The user login is successfully
    Given Located in Login Page
    When Complete the Login with username: '<username>' and password: '<password>'
    Then Home Page is displayed

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |

  @Login
  Scenario Outline: The user login fails, wrong data
    Given Located in Login Page
    When Complete the Login with username: '<username>' and password: '<password>'
    Then The message: '<message>' was displayed correctly

    Examples:
      | username      | password     | message                                                                   |
      | standard_user | invalid      | Epic sadface: Username and password do not match any user in this service |
      | invalid       | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      |               |              | Epic sadface: Username is required                                        |
      |               | secret_sauce | Epic sadface: Username is required                                        |
      | standard_user |              | Epic sadface: Password is required                                        |
