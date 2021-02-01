
  Feature: Dashboard stats should match with Db

    Background: user is on login page
      Given user is on library login page
      And use login in as librarian role

    @wip @db
    Scenario:
      Then system should display the users, books and borrowed_books numbers on the dashboard
      Then these numbers are validated by the database
