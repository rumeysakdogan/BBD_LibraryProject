package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StudentLandingPage extends BasePage{

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    @FindBy(xpath = "//a[@href='#borrowing-books']")
    private WebElement borrowingBooksTab;

    @FindBy(xpath = "//tr/td[1]")
    private List<WebElement> borrowBookButtons;

    @FindBy(className = "page-link")
    private List<WebElement> pageNumbers;

    public void clickOnBorrowBookButton(){

        for (WebElement eachButton : borrowBookButtons){
            if(eachButton.isEnabled()){
                eachButton.click();
                break;
            }else{
                for (int i = 1; i < pageNumbers.size(); i++){
                    
                }
            }
        }
    }

    public void clickOnBorrowingBooksTab(){
        borrowingBooksTab.click();
    }
}
