package com.library.pages;

import com.library.pages.BasePage;
import com.library.utils.Driver;
import com.library.pages.BasePage;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LibrarianUserManagementElements {
    public LibrarianUserManagementElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#users']")
    private WebElement usersButtonOnDashboard;

    @FindBy(xpath = "//a[@href='#books']")
    private WebElement booksButtonOnDashboard;

    public void clickBooksOnDashBoard() {
        booksButtonOnDashboard.click();
    }

    public void clickUserOnDashBoard() {
        usersButtonOnDashboard.click();
    }

    @FindBy(xpath = "//th[@data-name]")
    private List<WebElement> headerListOfElements;

    public List<String> getHeaderNamesAsListOfString() {
        List<String> headerList = new ArrayList<>();
        for (WebElement each : headerListOfElements) {
            headerList.add(each.getText());
        }
        return headerList;
    }

    @FindBy(xpath = "//a[@href='tpl/add-user.html']")
    private WebElement addUserButton;

    public void clickAddUser() {
        addUserButton.click();
        BasePage.waitTime(2);
    }

    @FindBy(id = "user_groups")
    private WebElement dropDownUserGroup;

    public void selectLibrarianFromUserGroupDropDown() {
        dropDownUserGroup.click();
        BasePage.waitTime(1);
        Select select = new Select(dropDownUserGroup);
        select.selectByVisibleText("Librarian");
    }

    public void selectAllFromUserGroupDropDown() {
        dropDownUserGroup.click();
        BasePage.waitTime(1);
        Select select = new Select(dropDownUserGroup);
        select.selectByVisibleText("ALL");
    }

    public void selectStudentsFromUserGroupDropDown() {
        dropDownUserGroup.click();
        BasePage.waitTime(1);
        Select select = new Select(dropDownUserGroup);
        select.selectByVisibleText("Students");
        BasePage.waitTime(1);
    }

    @FindBy(id = "user_status")
    private WebElement dropDownStatus;

    public void selectActiveFromStatusGroup() {
        dropDownStatus.click();
        BasePage.waitTime(1);
        Select select = new Select(dropDownStatus);
        select.selectByVisibleText("ACTIVE");
        BasePage.waitTime(1);
    }

    public void selectInactiveFromStatusGroup() {
        dropDownStatus.click();
        BasePage.waitTime(1);
        Select select = new Select(dropDownStatus);
        select.selectByVisibleText("INACTIVE");
        BasePage.waitTime(1);
    }

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchBox;

    public void searchBoxInput(String inputIntoSearch) {
        searchBox.sendKeys(inputIntoSearch + Keys.ENTER);
        BasePage.waitTime(1);
    }

    @FindBy(xpath = "//table[@id='tbl_users']/tbody/tr[1]/td[3]")
    private WebElement fullNameFirstRow;

    public String getFullNameFirstRav() {
        return fullNameFirstRow.getText();
    }

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    private WebElement showRecordsButton;

    public void changeShowRecord(int number) {
        showRecordsButton.click();
        BasePage.waitTime(1);
        Select select = new Select(showRecordsButton);
        select.selectByVisibleText("" + number);
    }

    @FindBy(xpath = "//table[@id='tbl_users']/tbody/tr/td[3]")
    private WebElement allNamesOnThePage;

    public int getAllNamesAmountOnThePage() {
        List<WebElement> allNamesArraylist = new ArrayList<WebElement>(Driver.getDriver().findElements(By.xpath("//table[@id='tbl_users']/tbody/tr/td[3]")));
        return allNamesArraylist.size();
    }


}
