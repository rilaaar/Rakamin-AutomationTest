Feature: dashboard
  As a user
  I want to using dashboard features
  So I can access dashboard menu

  @Dashboard
  Scenario: click about botton
    Given I am on login account
    When I click sidebar button
    And I click about button
    Then I will go to about page

  Scenario: click logout botton
    Given  I am on login account
    Then I click sidebar button
    And I click logout button
    Then I will go to login page

  Scenario: click photo product
    Given I am on login account
    When I click photo product
    And I click photo product
    Then I will go to product detail page

  Scenario: click name product
    Given I am on login account
    When I click name product
    Then I will go to product detail page

  Scenario: click add to cart botton
    Given I am on login account
    When I click add to cart button
    Then I get remove button

  Scenario: click sort botton
    Given I am on login account
    When I click sort button
    And I click name
    Then I get custom list product Az

  Scenario: click sort botton
    Given I am on login account
    When I click sort button
    And I click price
    Then I get custom list product Price

  Scenario: click cart botton
    Given I am on login account
    When I click cart button
    Then I will go to my cart page

