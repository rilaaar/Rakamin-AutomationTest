Feature: Login
  As a user
  I want to login
  So I can access my dashboard

  @Login
  Scenario Outline: Login with account
    Given I am on the login page
    When I input "<username>" username
    And I input "<password>" password
    And I click Login button
    Then I will get the "<result>" result
    Examples:
      | username | password | result |
#      |          |          | i can't login |
#      |          | secret_sauce | i can't login |
#      | standard_user |          | i can't login |
      | standard_user | secret_sauce | i can login |
#      | locked_out_user | secret_sauce | i can't login |
#      | problem_user | secret_sauce | i can login |
#      | performance_glitch_user | secret_sauce | i can login |