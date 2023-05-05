package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By yourNameDropDown = By.id("userSelect");
    By loginButton = By.xpath("//button[@type='submit']");
    By yourNameText = By.xpath("//label[contains(text(),'Your Name :')]");

    public void selectYourName(String yourNameOption) {
        selectByVisibleTextFromDropDown(yourNameDropDown, yourNameOption);
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }

    public String getYourNameText() {
        return getTextFromElement(yourNameText);
    }
}
