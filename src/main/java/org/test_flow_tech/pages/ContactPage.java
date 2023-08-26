package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class ContactPage {
        private WebDriver driver;
        private String baseUrl = "https://skillfactory.ru/contacts"; // URL страницы контактов

        // Локаторы элементов на странице контактов
        private By nameFieldLocator = By.id("name");
        private By emailFieldLocator = By.id("email");
        private By messageFieldLocator = By.id("message");
        private By submitButtonLocator = By.cssSelector(".submit-button");
        private By successMessageLocator = By.cssSelector(".success-message");

        public ContactPage(WebDriver driver) {
            this.driver = driver;
        }

        public void navigateTo() {
            driver.get(baseUrl); // Переход на страницу контактов
        }
        public String getTitle() {
            return driver.getTitle();
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

        // ... другие методы для взаимодействия с элементами на странице контактов ...
    }
