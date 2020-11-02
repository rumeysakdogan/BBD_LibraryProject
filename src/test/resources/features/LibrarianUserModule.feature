@libraryUserStory1
Feature: User Story1 – As a Librarian, I should be able to manage Users:
  AC:
  1.User should be able to see the grid with Actions, Used ID, Full Name, Email, Group, Status header
  2.User should be able to click on Add User button and add user
  3.User should be able to see all users by selecting ALL or filter by Librarian or Student category in User Group box
  4.User should be able to filter users by ACTIVE and INACTIVE status in Status box
  5.User should be able to search user by typing User ID or Full Name or Email in the Search box
  6.User shall be able to give range of users record to be displayed on the page by selecting the specific number in Show records box
  7.User should be able to click on Edit User button to Edit User Information

  Background: user is on login page
    Given user is on library login page
    And use login in as librarian role

  @userStory1Ac1 @after
  Scenario: User should be able to see the grid with Actions, Used ID, Full Name, Email, Group, Status header
    Then librarian user click on User button on the header
    And User should be able to see the grid with elements below
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |

  @userStory1Ac2 @after
  Scenario: User should be able to click on Add User button and add user
    Given librarian user click on User button on the header
    And librarian user clicks on add user button
    Then librarian will add a new user and save it

  @userStory1Ac3 @after
  Scenario: User should be able to see all users by selecting ALL or filter by Librarian or Student category in User Group box
    When librarian user click on User button on the header
    And user select librarian from User Group dropdown
    And user select students from User Group dropdown
    And user select all from User Group dropdown

  @userStory1Ac4 @after
  Scenario: User should be able to filter users by ACTIVE and INACTIVE status in Status box
    When librarian user click on User button on the header
    And user filtering users by Inactive status in Status box
    And user filtering users by Active status in Status box