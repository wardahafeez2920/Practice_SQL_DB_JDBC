package com.library.steps;

import com.library.pages.DashBoardPage;
import com.library.pages.LoginPage;
import com.library.utility.BrowserUtil;
import com.library.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardStepDefs {

    LoginPage loginPage=new LoginPage();
    DashBoardPage dashBoardPage=new DashBoardPage();

    String actualBorrowedBooksNumber;
    @When("the librarian gets borrowed books number")
    public void the_librarian_gets_borrowed_books_number() {
        // OPT 1
        actualBorrowedBooksNumber = dashBoardPage.borrowedBooksNumber.getText();
        System.out.println(actualBorrowedBooksNumber);
        // OPT 2
        System.out.println("dashBoardPage.getModuleCount(\"Borrowed Books\") = " + dashBoardPage.getModuleCount("Borrowed Books"));

    }
    @Then("borrowed books number information must match with DB")
    public void borrowed_books_number_information_must_match_with_db() {

        String query="select count(*) from book_borrow where is_returned=0";
        DB_Util.runQuery(query);

        String expectedBorrowedBooksNumber = DB_Util.getFirstRowFirstColumn();
        System.out.println(expectedBorrowedBooksNumber);

        Assert.assertEquals(expectedBorrowedBooksNumber,actualBorrowedBooksNumber);

    }

}
