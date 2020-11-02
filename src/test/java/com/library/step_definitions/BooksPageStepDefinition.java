package com.library.step_definitions;

import com.github.javafaker.Faker;
import com.library.pages.BooksPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BooksPageStepDefinition {
    BooksPage booksPage = new BooksPage();
    Faker faker = new Faker();

    @When("user navigate to {string} module and click on it")
    public void user_navigate_to_module_and_click_on_it(String str) {
        booksPage.booksPageLink();
    }

    @Then("user should see grid with following {string}")
    public void user_should_see_grid_with_following(String string, List<String> dataTable) {
        booksPage.headerElementsVerification(dataTable);
    }

    @Then("user should see Add Book button and click on it")
    public void userShouldSeeAddBookButtonAndClickOnIt() {
        booksPage.addBookButtonVerification();
        booksPage.clickingAddBookButton();
    }

    @Then("user should fill up required fields and save changes")
    public void userShouldFillUpRequiredFieldsAndSaveChanges() throws InterruptedException {
        booksPage.fillingUpRequiredFields();
        booksPage.clickingSaveChanger();
        Thread.sleep(3000);

    }
}
