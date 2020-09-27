Feature: Login
  Scenario: As Admin user
  I want to login to the application using email and pwd
  and select remember option
  So that only the user authenticated enter to the application

    Given I have a admin user
    When I set the login textbox with admin
    And I set the pwd textbod with admin1
    And I click login button
    Then I enter to the application
