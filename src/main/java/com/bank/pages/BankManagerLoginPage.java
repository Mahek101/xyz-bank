package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By addCustomerButton = By.xpath("//button[@ng-class='btnClass1']");
    By openAccountButton = By.xpath("//button[@ng-class='btnClass2']");

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerButton);
    }

    public void clickOpenAccountButton() {
        clickOnElement(openAccountButton);
    }
}
