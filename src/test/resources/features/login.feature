Feature: Login Test-The user should be able to login with valid credentials

  Background: Go to home page
    Given The user is on the login page


  Scenario: Positive Login Test-1- User should be able to login
    When The user enters valid credentials
    Then Verify "Welcome beyt"



  Scenario: Positive Login Test-2- User should be able to login
    When The user enter "beyt" and "Test1234" and click login button
    Then Verify "Welcome beyt"



    Scenario Outline: Positive Login Test-3- User should be able to login
      When The user enter "<username>" and "<password>" and click login button
      Then Verify "<Welcome user>"
      Examples:
        | username | password | Welcome user |
        | beyt     | Test1234 | Welcome beyt |





  Scenario Outline: Positive Scenario 4 - user should be able to login
    When The user enters valid username and password
      | username | <user>     |
      | password | <password> |
    Then Verify "<welcomeUser>"

    Examples:
      | user | password | welcomeUser |
      | beyt     | Test1234 | Welcome beyt |






