package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(id = "user_count")
    private WebElement userCount;

    @FindBy(id = "book_count")
    private WebElement bookCount;

    @FindBy(id = "borrowed_books")
    private WebElement borrowedBooksCount;

    public boolean isUserCountDisplayed(){
        return userCount.isDisplayed();
    }

    public boolean isBookCountDisplayed(){
        return bookCount.isDisplayed();
    }

    public boolean isBorrowedBookCountDisplayed(){
        return borrowedBooksCount.isDisplayed();
    }

    public String getUserCount(){
        return userCount.getText();
    }

    public String getBookCount(){
        return bookCount.getText();
    }

    public String getBorrowedBookCount(){
        return borrowedBooksCount.getText();
    }
}
