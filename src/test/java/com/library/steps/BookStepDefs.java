package com.library.steps;

import com.library.pages.BookPage;
import com.library.utility.BrowserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class BookStepDefs  {

    BookPage bookPage=new BookPage();

    @When("the user navigates to {string} page")
    public void the_user_navigates_to_page(String moduleName) {
        bookPage.navigateModule(moduleName);
        BrowserUtil.waitFor(2);


    }

    @When("the user clicks book categories")
    public void the_user_clicks_book_categories() {
        List<String> actualCategoryList = BrowserUtil.getAllSelectOptions(bookPage.mainCategoryElement);
        System.out.println("actualCategoryList = " + actualCategoryList);

        // Remove ALL from list
        actualCategoryList.remove(0);
        System.out.println(" After remove ALL Option");
        System.out.println("actualCategoryList = " + actualCategoryList);

    }

    @Then("verify book categories must match book_categories table from db")
    public void verify_book_categories_must_match_book_categories_table_from_db() {


    }
}