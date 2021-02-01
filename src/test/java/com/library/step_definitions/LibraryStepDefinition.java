package com.library.step_definitions;

import com.github.javafaker.Faker;
import com.library.pages.LibrarianAddUserPage;
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
LibrarianAddUserPage addUserPage = new LibrarianAddUserPage();

    Faker faker = new Faker();
    String fullNameFaker = faker.name().fullName();


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
    @And("user select librarian from User Group dropdown")
    public void userSelectLibrarianFromUserGroupDropdown() {
        userManagement.selectLibrarianFromUserGroupDropDown();
    }
    @And("user filtering users by Inactive status in Status box")
    public void userFilteringUsersByInactiveStatusInStatusBox() {
        userManagement.selectInactiveFromStatusGroup();
    }
    @And("user select students from User Group dropdown")
    public void userSelectStudentsFromUserGroupDropdown() {
        userManagement.selectStudentsFromUserGroupDropDown();
    }

    @And("user select all from User Group dropdown")
    public void userSelectAllFromUserGroupDropdown() {
        userManagement.selectAllFromUserGroupDropDown();
    }
    @And("user filtering users by Active status in Status box")
    public void userFilteringUsersByActiveStatusInStatusBox() {
        userManagement.selectActiveFromStatusGroup();
    }
    @And("librarian user clicks on add user button")
    public void librarianUserClicksOnAddUserButton() {
        userManagement.clickAddUser();
    }
    @Then("librarian will add a new user and save it")
    public void librarianWillAddANewUserAndSavingIt() {
        addUserPage.addNewUserFillOutForm(faker.address().fullAddress(),fullNameFaker,fullNameFaker,fullNameFaker.replace(" ","")+"@WTF.com");

    }






}
