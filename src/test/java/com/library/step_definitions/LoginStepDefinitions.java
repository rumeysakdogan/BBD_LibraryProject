package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 10);



    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        String url= ConfigurationReader.getProperty("libraryUrl");

        Driver.getDriver().get(url);
    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String role) {
      loginPage.login(role);
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

        String expected = "dashboard";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains(expected));
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));
        Driver.closeDriver();
    }


//    @When("user log in as a {string}")
//    public void user_log_in_as_a(String string) {
//        loginPage.login(string);
//    }

    @Then("books should be displayed")
    public void books_should_be_displayed() {

        String expected = "books";

        wait.until(ExpectedConditions.urlContains(expected));
        String actual = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));
        Driver.closeDriver();
    }


    @Given("user is on library login page")
    public void userIsOnLibraryLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
        BasePage.waitTime(2);
    }

    @Given("user enters {string} and {string} and click login button")
    public void user_enters_and_and_click_login_button(String email, String password) {
        loginPage.loginWithParameters(email, password);
        BasePage.waitTime(2);
    }


}
