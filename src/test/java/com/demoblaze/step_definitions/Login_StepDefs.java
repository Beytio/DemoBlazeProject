package com.demoblaze.step_definitions;

import com.demoblaze.pages.LoginPage;
import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Login_StepDefs {

    LoginPage loginpage=new LoginPage();
    ProductPage productPage=new ProductPage();


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
         }


    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginpage.loginMethod();
         }


    @Then("Verify {string}")
    public void verify(String expectedName) {
        productPage.verfiyLogin_mtd(expectedName);

       }

    @When("The user enter {string} and {string} and click login button")
    public void theUserEnterAndAndClickLoginButton(String userName, String passWord) {
        loginpage.loginMethod(userName,passWord);
    }


    @When("The user enters valid username and password")
    public void theUserEntersValidUsernameAndPassword(Map<String,String> userInfo) {
        loginpage.loginMethod(userInfo.get("username"),userInfo.get("password"));
    }

    @Then("Verify that invalid {string}")
    public void verifyThatInvalid(String expectedMessage) {
        loginpage.verifyNegativeLoginMessage(expectedMessage);

    }
}

