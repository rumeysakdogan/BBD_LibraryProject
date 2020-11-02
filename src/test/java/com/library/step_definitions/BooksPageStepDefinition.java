package com.library.step_definitions;

import com.github.javafaker.Faker;
import com.library.pages.LibraryBooksManagementPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class BooksPageStepDefinition {
    LibraryBooksManagementPage libraryBooksManagementPage = new LibraryBooksManagementPage();
    Faker faker = new Faker();

    @When("user navigate to {string} module and click on it")
    public void user_navigate_to_module_and_click_on_it(String str) {
        libraryBooksManagementPage.booksPageLink();
    }

    @Then("user should see grid with following {string}")
    public void user_should_see_grid_with_following(String string, List<String> dataTable) {
        libraryBooksManagementPage.headerElementsVerification(dataTable);
    }

    @Then("user should see Add Book button and click on it")
    public void userShouldSeeAddBookButtonAndClickOnIt() {
        libraryBooksManagementPage.addBookButtonVerification();
        libraryBooksManagementPage.clickingAddBookButton();
    }

    @Then("user should fill up required fields and save changes")
    public void userShouldFillUpRequiredFieldsAndSaveChanges() throws InterruptedException {
        libraryBooksManagementPage.fillingUpRequiredFields();
        libraryBooksManagementPage.clickingSaveChanger();
        Thread.sleep(3000);

    }
}
