package com.library.pages;

import com.library.utils.BrowserUtils;
import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BorrowingBooksPage extends  BasePage{

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    @FindBy(className = "btn btn-primary btn-sm disabled")
    private List<WebElement> returnBookButtons;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    private WebElement successMessage;

    public void clickOnReturnBookButton(){

        for(WebElement eachButton : returnBookButtons){
            wait.until(ExpectedConditions.elementToBeClickable(eachButton));
            eachButton.click();
            break;
        }
    }

    public WebElement getSuccessMessage(){

        return successMessage;
    }
}
