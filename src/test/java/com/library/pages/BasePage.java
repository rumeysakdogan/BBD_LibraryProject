package com.library.pages;


import com.library.utils.BrowserUtils;
import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/head/title")
    private WebElement title;

    @FindBy(linkText = "Users")
    private WebElement usersPageLink;

    @FindBy(linkText = "Books")
    private WebElement booksPageLink;

    @FindBy(linkText = "Dashboard")
    private WebElement dashboardPageLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    private WebElement accountUsername;


    public void usersPageLink(){
        BrowserUtils.clickOnElement(usersPageLink);
    }
    public void booksPageLink(){
        BrowserUtils.clickOnElement(booksPageLink);
    }
    public void dashboardPageLink(){
        BrowserUtils.clickOnElement(dashboardPageLink);
    }
    public void accountUsername(){
        BrowserUtils.clickOnElement(accountUsername);
    }

    public String getPageTitleText(){
        return title.getText();
    }

    public static void waitTime(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
        }
    }

}