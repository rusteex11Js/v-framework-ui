Feature: Sample test 2

  Scenario: Verify the browser user name 2
    Given launch browser
    And set firstname "vinoth"

  Scenario: Verify the validation of the user
    Given launch browser
    And set firstname "rustee"

  Scenario: Verify the user is logged properly
    Given launch browser
    And set firstname "karlitto"

  Scenario: Verify the user got enough support
    Given launch browser
    And set firstname "crespo"
