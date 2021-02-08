Feature: Book module
  Background: librarian is on the books page
  Scenario: adding book as a librarian
    When librarian clicks at the add book button
    Then add book windows pops up
    When librarian fills all the info
    And clicks save changes button
    Then system should show the newly added book on the book table
    And insertion of the new book should be verified by DB
    And insertion of the new book new book should be verified by API