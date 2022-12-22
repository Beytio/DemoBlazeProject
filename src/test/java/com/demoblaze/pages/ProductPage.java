package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(id = "nameofuser")
    public WebElement loginUserName_loc;


    public void verfiyLogin_mtd(String expectedUserName){
        String actualUserName= loginUserName_loc.getText();
        Assert.assertEquals("User does not match.",expectedUserName,actualUserName);
        System.out.println("expectedUserName = " + expectedUserName);
        System.out.println("actualUserName = " + actualUserName);
        BrowserUtils.waitFor(5);
    }
}
