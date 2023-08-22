package com.co.senasoft.steps;

import com.co.senasoft.pageobjects.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.regex.Matcher;

public class RegisterStep {

    RegisterPage registerPage = new RegisterPage();

    @Step
    public void openBrowser(){
        registerPage.open();
}
@Step
    public void  enterName(){
        registerPage.getDriver().findElement(registerPage.getTXT_FIRST_NAME())
                .sendKeys(
                        "vanessa"
                );
    }
    @Step
    public void  enterLastName(){
        registerPage.getDriver().findElement(registerPage.getTXT_LAST_NAME())
                .sendKeys(
                        "Mosquera"
                );
    }

    @Step
    public void  enterUserName(){
        registerPage.getDriver().findElement(registerPage.getTXT_USER_NAME())
                .sendKeys(
                        "vanessa@gmail.com"
                );
    }
    @Step
    public void  password(){
        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys(
                        "12345678"
                );
    }
    @Step
    public void  enterRegister(){
        registerPage.getDriver().findElement(registerPage.getBTN_REGISTER())
                .click();
    }
    @Step
    public void validateName(){
        Assert.assertThat(registerPage.getDriver()
                .findElement(registerPage.getLBL_NAME()).isDisplayed(), Matchers.is(true));
    }

}
