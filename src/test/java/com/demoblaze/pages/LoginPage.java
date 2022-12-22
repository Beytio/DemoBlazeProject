package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(id="loginusername")
    public WebElement username_loc;

    @FindBy(id="loginpassword")
    public WebElement password_loc;

    @FindBy(xpath = "//button[@onclick='logIn()']")
    public WebElement loginBtn_loc;



    public void loginMethod(){
        login_loc.click();
        username_loc.sendKeys(ConfigurationReader.get("username"));
        password_loc.sendKeys(ConfigurationReader.get("password"));
        loginBtn_loc.click();
        BrowserUtils.waitFor(2);

    }


    public void loginMethod(String username, String password){
        BrowserUtils.waitForClickablility(login_loc,3).click();
        username_loc.sendKeys(username);
        password_loc.sendKeys(password);
        loginBtn_loc.click();
        BrowserUtils.waitFor(2);

    }


    public void verifyNegativeLoginMessage(String expectedMessage){
        Alert alert= Driver.get().switchTo().alert();
        BrowserUtils.waitFor(3);
        String actualMessage= alert.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        System.out.println("actualMessage = " + actualMessage);
        System.out.println("expectedMessage = " + expectedMessage);
    }





}
