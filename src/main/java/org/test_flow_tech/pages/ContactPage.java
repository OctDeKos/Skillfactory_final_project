package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    private WebDriver driver;

    // Локаторы элементов на странице контактов
    private By nameFieldLocator = By.id("name");
    private By emailFieldLocator = By.id("email");
    private By messageFieldLocator = By.id("message");
    private By submitButtonLocator = By.cssSelector(".submit-button");
    private By successMessageLocator = By.cssSelector(".success-message");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillContactForm(String name, String email, String message) {
        driver.findElement(nameFieldLocator).sendKeys(name);
        driver.findElement(emailFieldLocator).sendKeys(email);
        driver.findElement(messageFieldLocator).sendKeys(message);
    }

    public void submitForm() {
        driver.findElement(submitButtonLocator).click();
    }

    public boolean isSubmissionSuccessful() {
        return driver.findElement(successMessageLocator).isDisplayed();
    }

    // Другие методы для взаимодействия с элементами на странице контактов
}
