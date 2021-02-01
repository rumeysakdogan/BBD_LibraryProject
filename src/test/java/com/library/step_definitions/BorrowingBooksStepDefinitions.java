package com.library.step_definitions;

import com.library.pages.BorrowingBooksPage;
import com.library.pages.StudentLandingPage;
import com.library.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BorrowingBooksStepDefinitions {

    BorrowingBooksPage borrowingBooksPage = new BorrowingBooksPage();
    StudentLandingPage studentLandingPage = new StudentLandingPage();

    @When("user navigate to Borrowing Books module")
    public void user_navigate_to_borrowing_books_module() {
        BrowserUtils.wait(2);
        studentLandingPage.clickOnBorrowingBooksTab();
    }

    @When("user click on return book button")
    public void user_click_on_return_book_button() {
        borrowingBooksPage.clickOnReturnBookButton();
    }

    @Then("user should see success message")
    public void user_should_see_success_message() {

        Assert.assertTrue(borrowingBooksPage.getSuccessMessage().isDisplayed() );

    }

}
