Feature: Return book
  As a student user, I should be able to return books by clicking on return book button under the Borrowing Books module.

  @return_book
  Scenario: Return Success Message Verification
    Given user is on library login page
    When user logs in as a "student29"
    And user navigate to Borrowing Books module
    When user click on return book button
    Then user should see "The book has been returned.." message