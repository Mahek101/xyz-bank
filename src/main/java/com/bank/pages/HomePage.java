package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    By customerLoginButton = By.xpath("//button[@ng-click='customer()']");

    public void clickOnBankManagerLoginButton() {
        clickOnElement(bankManagerLogin);
    }

    public void clickCustomerLoginButton() {
        clickOnElement(customerLoginButton);
    }
}
