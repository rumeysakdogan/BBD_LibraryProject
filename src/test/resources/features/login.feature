
@login
Feature: As user I want to be able to login under different roles
  Background: common steps
    Given user is on library login page

  @librarian
  Scenario: Login as a librarian
    When user logs in as a "librarian"
    Then dashboard should be displayed

  @Student
  Scenario: Login as a student
    When user log in as a "student29"
    Then books should be displayed