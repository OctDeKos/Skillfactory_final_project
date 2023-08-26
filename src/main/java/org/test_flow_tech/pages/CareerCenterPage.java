package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareerCenterPage {
    private WebDriver driver;
    private String baseUrl = "https://skillfactory.ru/career-center";
    // Локаторы элементов на странице подробностей курса
    private By courseTitleLocator = By.cssSelector(".course-title");
    private By addToCartButtonLocator = By.cssSelector(".add-to-cart-button");
    private By cartLinkLocator = By.cssSelector(".cart-link");

    public CareerCenterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateTo() {
        driver.get(baseUrl); // Переход на страницу Центра Карьеры
    }
    public String getTitle() {
        return driver.getTitle();
    }
    public String getCourseTitle() {
        return driver.findElement(courseTitleLocator).getText();
    }
    public void addToCart() {
        driver.findElement(addToCartButtonLocator).click();
    }
    public FreeEventsPage navigateToCart() {
        driver.findElement(cartLinkLocator).click();
        return new FreeEventsPage(driver);
    }

    // Другие методы для взаимодействия с элементами на странице центра карьеры
}
