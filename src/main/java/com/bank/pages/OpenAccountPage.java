package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By customerNameDropDown = By.id("userSelect");
    By currencyDropDown = By.id("currency");
    By processButton = By.xpath("//button[@type='submit']");

    public void selectCustomerNameByVisibleText(String registeredID) {
        selectByVisibleTextFromDropDown(customerNameDropDown, registeredID);
    }

    public void selectCurrencyFromDropDown(String currencyOption) {
        selectByVisibleTextFromDropDown(currencyDropDown, currencyOption);
    }

    public void clickOnProcessButton() {
        clickOnElement(processButton);
    }

    public String getTextFromAccountCreatedSuccessfullyPopup() {
        return getTextFromAlert();
    }

    public void clickOKOnPopup() {
        acceptAlert();
    }
}
