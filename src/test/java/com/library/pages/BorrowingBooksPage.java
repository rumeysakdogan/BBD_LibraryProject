package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BorrowingBooksPage {

    @FindBy(xpath = "//a[@onclick='BorrowingBooks.return_book(718)']")
    private WebElement returnBookButton;

    @FindBy(id = "toast-container")
    private WebElement successMessage;

    public void clickOnReturnBookButton(){
        returnBookButton.click();
    }

    public void successMessageIsDisplayed(){
        successMessage.isDisplayed();
    }
}
