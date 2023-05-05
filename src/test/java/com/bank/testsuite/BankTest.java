package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerButton();
        addCustomerPage.sendFirstName("Megha");
        addCustomerPage.sendLastName("Mehta");
        addCustomerPage.sendPostCode("HA55AH");
        addCustomerPage.clickAddCustomerButton();
        Assert.assertTrue(addCustomerPage.getTextFromCustomerAddedPopUp().contains("Customer added successfully"), "customer added successfully message not displayed");
        addCustomerPage.clickOKOnAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOpenAccountButton();
        openAccountPage.selectCustomerNameByVisibleText("Harry Potter");
        openAccountPage.selectCurrencyFromDropDown("Pound");
        openAccountPage.clickOnProcessButton();
        Assert.assertTrue(openAccountPage.getTextFromAccountCreatedSuccessfullyPopup().contains("Account created successfully"), "Popup not displayed");
        openAccountPage.clickOKOnPopup();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        homePage.clickCustomerLoginButton();
        customerLoginPage.selectYourName("Harry Potter");
        customerLoginPage.clickOnLogin();
        Assert.assertEquals(accountPage.getLogoutText(), "Logout", "Logout text not displayed");
        accountPage.clickLogout();
        Assert.assertTrue(customerLoginPage.getYourNameText().contains("Your Name"), "Your Name not displayed");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickCustomerLoginButton();
        customerLoginPage.selectYourName("Harry Potter");
        customerLoginPage.clickOnLogin();
        accountPage.clickOnDeposit();
        accountPage.sendAmountToInputBox("100");
        accountPage.clickOnDepositAfterAmount();
        Assert.assertEquals(accountPage.getTextFromDepositMessage(), "Deposit Successful", "Deposit successful message not displayed");
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickCustomerLoginButton();
        customerLoginPage.selectYourName("Harry Potter");
        customerLoginPage.clickOnLogin();
        accountPage.clickOnDeposit();
        accountPage.sendAmountToInputBox("100");
        accountPage.clickOnDepositAfterAmount();
        accountPage.clickOnTransactions();
        accountPage.clickOnBack();
        accountPage.clickOnWithdrawalButton();
        accountPage.sendAmountToInputBox("50");
        accountPage.clickOnWithdrawButton();
        Assert.assertEquals(accountPage.getWithdrawMessage(), "Transaction successful", "Transaction Successful message not displayed");
    }
}
