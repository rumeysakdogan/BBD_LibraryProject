package com.library.step_definitions;

import com.library.pages.DashboardPage;
import com.library.utils.DB_Utility;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class DashboardStepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("system should display the users, books and borrowed_books numbers on the dashboard")
    public void system_should_display_the_users_books_and_borrowed_books_numbers_on_the_dashboard() {
              assertTrue(dashboardPage.isUserCountDisplayed());
              assertTrue(dashboardPage.isBookCountDisplayed());
              assertTrue(dashboardPage.isBorrowedBookCountDisplayed());
    }


    @Then("these numbers are validated by the database")
    public void these_numbers_are_validated_by_the_database() {

        DB_Utility.runQuery("select count(*) from users");
        String expectedUserCount = DB_Utility.getColumnDataAtRow(1,1);
        String actualUserCount = dashboardPage.getUserCount();
        assertEquals( expectedUserCount,actualUserCount );

        DB_Utility.runQuery("select count(*) from books");
        String expectedBookCount = DB_Utility.getColumnDataAtRow(1,1);
        String actualBookCount = dashboardPage.getBookCount();
        assertEquals( expectedBookCount,actualBookCount );

        DB_Utility.runQuery("select count(*) from book_borrow where is_returned = 0");
        String expectedBorrowedBookCount = DB_Utility.getColumnDataAtRow(1,1);
        String actualBorrowedBookCount = dashboardPage.getBorrowedBookCount();
        assertEquals( expectedBorrowedBookCount, actualBorrowedBookCount );
    }
}
