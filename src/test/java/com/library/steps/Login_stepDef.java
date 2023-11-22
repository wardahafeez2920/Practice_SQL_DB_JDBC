package com.library.steps;

import com.library.pages.LoginPage;
import io.cucumber.java.en.Given;

public class Login_stepDef {

    LoginPage loginPage = new LoginPage();

    @Given("the {string} on the home page")
        public void the_on_the_home_page(String userType) {
        loginPage.login(userType);
    }



}
