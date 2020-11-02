package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarianAddUserPage {
    public LibrarianAddUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fullNameInput;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;
    @FindBy(xpath = "//input[@name='end_date']")
    private WebElement endDateInput;
    @FindBy(xpath = "//input[@name='start_date']")
    private WebElement startDateInput;
    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement addressInput;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveChangesButton;

    public void addNewUserFillOutForm(String address,String fullName,String password,String email) {

        fullNameInput.sendKeys(fullName);
        passwordInput.sendKeys(password);
        emailInput.sendKeys(email);
//        startDateInput.sendKeys("2020-10-14");
//        endDateInput.sendKeys("2045-10-14");
        addressInput.sendKeys(address);
        LoginPage.waitTime(3);
        saveChangesButton.click();
    }

}