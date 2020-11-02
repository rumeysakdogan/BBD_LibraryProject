package com.library.step_definitions;

import com.library.pages.LibrarianUserManagementElements;
import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class LibraryStepDefinition {
LoginPage loginPage = new LoginPage();
LibrarianUserManagementElements userManagement = new LibrarianUserManagementElements();




    @And("use login in as librarian role")
    public void useLoginInAsLibrarianRole() {
        loginPage.loginWithParameters(ConfigurationReader.getProperty("username.librarian"),ConfigurationReader.getProperty("password.librarian"));
        LoginPage.waitTime(1);
    }

    @Then("librarian user click on User button on the header")
    public void librarianUserClickOnUserButtonOnTheHeader() {
        userManagement.clickUserOnDashBoard();
        LoginPage.waitTime(1);
    }
    @And("User should be able to see the grid with elements below")
    public void userShouldBeAbleToSeeTheGridWithElementsBelow(List<String> expected) {
        System.out.println(expected.toString());
        System.out.println(userManagement.getHeaderNamesAsListOfString().toString());
        Assert.assertTrue(expected.equals(userManagement.getHeaderNamesAsListOfString()));
        LoginPage.waitTime(2);
    }











}
