package com.library.pages;

import com.library.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    //To not use web elements directly in step definition classes
    //helps to prevent code duplication and keep step definitions clean

    @FindBy(id = "inputEmail")
    private WebElement username;
//checking checking for conflict
    @FindBy(id = "inputPassword")
    private WebElement password;

    @FindBy(css = "[class='btn btn-lg btn-primary btn-block']")
    private WebElement signIn;


    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login() {
        String usernameValue = ConfigurationReader.getProperty("username.librarian");
        String passwordValue = ConfigurationReader.getProperty("password.librarian");

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login(String role) {
        String usernameValue;
        String passwordValue;

        if (role.equalsIgnoreCase("librarian")) {
            usernameValue = ConfigurationReader.getProperty("username.librarian");
            passwordValue = ConfigurationReader.getProperty("password.librarian");
        } else if (role.equalsIgnoreCase("student29")) {
            usernameValue = ConfigurationReader.getProperty("username.student29");
            passwordValue = ConfigurationReader.getProperty("password.student29");
        } else {
            usernameValue = ConfigurationReader.getProperty("username.student30");
            passwordValue = ConfigurationReader.getProperty("password.student30");
        }

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void loginWithParameters(String usernameInput, String passwordInput){
        username.sendKeys(usernameInput);
        password.sendKeys(passwordInput);
        signIn.click();
    }





// some change for practice








}