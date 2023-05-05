package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By logoutButton = By.xpath("//button[@class='btn logout']");
    By depositButton = By.xpath("//button[normalize-space()='Deposit']");
    By withdrawalButton = By.xpath("//button[normalize-space()='Withdrawl']");
    By amountInput = By.xpath("//input[@placeholder='amount']");
    By depositAfterAmount = By.xpath("//button[@type='submit']");
    By depositMessage = By.xpath("//span[@ng-show='message']");
    By transactions = By.xpath("//button[normalize-space()='Transactions']");
    By back = By.xpath("//button[normalize-space()='Back']");
    By withdrawButton = By.xpath("//button[normalize-space()='Withdraw']");
    By withdrawMessage = By.xpath("(//span[@class='error ng-binding'])[1]");

    public String getLogoutText() {
        return getTextFromElement(logoutButton);
    }

    public void clickLogout() {
        clickOnElement(logoutButton);
    }

    public void clickOnDeposit() {
        clickOnElement(depositButton);
    }

    public void clickOnWithdrawalButton() {
        clickOnElement(withdrawalButton);
    }

    public void sendAmountToInputBox(String userInputAmount) {
        sendTextToElement(amountInput, userInputAmount);
    }

    public void clickOnDepositAfterAmount() {
        clickOnElement(depositAfterAmount);
    }

    public String getTextFromDepositMessage() {
        return getTextFromElement(depositMessage);
    }

    public void clickOnWithdrawButton() {
        clickOnElement(withdrawButton);
    }

    public String getWithdrawMessage() {
        return getTextFromElement(withdrawMessage);
    }

    public void clickOnTransactions() {
        clickOnElement(transactions);
    }

    public void clickOnBack() {
        clickOnElement(back);
    }
}
