@Example

Feature: Example

  Scenario: User opens WordPad, type text and save it
    Given User opens WordPad and type 'Hello World!' text
    When User saves the file and re-opens it
    Then File contains 'Hello World !' text