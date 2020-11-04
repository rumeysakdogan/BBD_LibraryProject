package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BorrowingBooksPage extends  BasePage{

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    @FindBy(xpath = "//table//tbody//tr//td[1]")
    private List<WebElement> returnBookButtons;

    @FindBy(id = "toast-container")
    private WebElement successMessage;

    public void clickOnReturnBookButton(){

        for(WebElement eachButton : returnBookButtons){
            wait.until(ExpectedConditions.elementToBeClickable(eachButton));
            eachButton.click();
            break;
        }
    }

    public String getSuccessMessageText(){

        return successMessage.getText();
    }
}
