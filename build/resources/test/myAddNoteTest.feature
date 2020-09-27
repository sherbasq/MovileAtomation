Feature: addNote
  Scenario: As regular user
            I want to add a note to the application
            So that note is added correctly

    Given I have acces to the app
    When I click the note button
    And I set the tittle note
    And I set the body note
    And I set the date
    And I set the hour
    And I set the remember
    And I set the repeater
    And I click the save note
    Then I add a new note


