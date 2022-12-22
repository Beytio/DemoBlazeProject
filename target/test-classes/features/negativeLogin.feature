Feature: Negative Login Test-The user should BOT be able to login with invalid credentials

  Background: Go to home page
    Given The user is on the login page


  @wip
  Scenario Outline: Negative Login Test- User should Not be able to login with ,nvalid credentials
    When The user enter "<invalidusername>" and "<invalidpassword>" and click login button
    Then Verify that invalid "<Message>"
    Examples:
      | invalidusername | invalidpassword | Message                                |
      | beyt            |                 | Please fill out Username and Password. |
      |                 | Test1234        | Please fill out Username and Password. |
      | wrong           | Test1234        | User does not exist.                   |
      | beyt            | wrong           | Wrong password.                        |
      | wrong           | wrong           | User does not exist.                   |
      |                 |                 | Please fill out Username and Password. |
