package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentLandingPage extends BasePage{

    @FindBy(xpath = "//a[@href='#borrowing-books']")
    private WebElement borrowingBooksTab;

    public void clickOnBorrowingBooksTab(){
        borrowingBooksTab.click();
    }
}
