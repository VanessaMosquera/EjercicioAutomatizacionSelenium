package com.co.senasoft.steps;

import com.co.senasoft.pageobjects.LoginPage;
import com.co.senasoft.pageobjects.RegisterPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Step
    public void enterCredentials(){
        registerPage.getDriver().findElement(loginPage.getTXT_USER_NAME())
                .sendKeys("vanessa@gmail.com");


    }

    @Step
    public void  enterUserName(){
        registerPage.getDriver().findElement(loginPage.getTXT_USER_NAME())
                .sendKeys(
                        "vanessa@gmail.com"
                );
        registerPage.getDriver().findElement(loginPage.getTXT_PASSWORD())
                .sendKeys(
                        "12345678"
                );
        registerPage.getDriver().findElement(loginPage.getBTN_LOGIN())
                .click();
    }

}
