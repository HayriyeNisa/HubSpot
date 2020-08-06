@web

  Feature: login page feature

  Background:
    Given I am on  login page
  @Login
  Scenario: Verify invalid login from login page
    When  I enter hayriyebaskan@gmail.com into Email address field on the login page
    And I enter test12345 into password field on the login page
    And I click on login button login page
    And I verify invalid login message on login page
    Then I click on sign up link on login page
