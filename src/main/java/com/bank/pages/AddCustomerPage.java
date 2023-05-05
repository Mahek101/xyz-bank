package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@type='submit']");

    public void sendFirstName(String inputFirstName) {
        sendTextToElement(firstName, inputFirstName);
    }

    public void sendLastName(String inputLastName) {
        sendTextToElement(lastName, inputLastName);
    }

    public void sendPostCode(String inputPostCode) {
        sendTextToElement(postCode, inputPostCode);
    }

    public void clickAddCustomerButton() {
        clickOnElement(addCustomerButton);
    }

    public String getTextFromCustomerAddedPopUp() {
        return getTextFromAlert();
    }

    public void clickOKOnAlert() {
        acceptAlert();
    }
}
