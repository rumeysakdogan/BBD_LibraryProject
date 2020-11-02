package com.library.pages;

import com.github.javafaker.Faker;
import com.library.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static com.library.utils.BrowserUtils.clickOnElement;
import static com.library.utils.BrowserUtils.clickWithJS;

public class LibraryBooksManagementPage extends BasePage {
    Faker faker = new Faker();

    public LibraryBooksManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Add Book")
    private WebElement addBookButton;


    public void addBookButtonVerification() {
        Assert.assertTrue(addBookButton.isDisplayed());
    }

    public void clickingAddBookButton() {
        clickOnElement(addBookButton);
    }

    @FindBy(xpath = "//th[@data-name]")
    private List<WebElement> headerElements;

    public void headerElementsVerification(List<String> dataTable) {
        List<String> headerElementsString = new ArrayList<>();

        for (WebElement each : headerElements) {
            headerElementsString.add(each.getText().trim());
        }
        Assert.assertEquals("Header verification failed", dataTable, headerElementsString);
    }

    @FindBy(xpath = "//input[@placeholder='Book Name']")
    private WebElement bookNameField;

    @FindBy(xpath = "//input[@placeholder='ISBN']")
    private WebElement isbnField;

    @FindBy(xpath = "//input[@placeholder='Year']")
    private WebElement yearField;

    @FindBy(xpath = "//input[@placeholder='Author']")
    private WebElement authorField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveChanges;

    public void fillingUpRequiredFields() {

        bookNameField.sendKeys(faker.book().title());

        isbnField.sendKeys(faker.idNumber().invalid());
        //test

        yearField.sendKeys(faker.date().birthday().toString());

        authorField.sendKeys(faker.name().fullName());

    }

    public void clickingSaveChanger() {
        clickOnElement(saveChanges);
    }


}