package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CourseDetailsPage {
    private WebDriver driver;

    // Локаторы элементов на странице подробностей курса
    private By courseTitleLocator = By.cssSelector(".course-title");
    private By addToCartButtonLocator = By.cssSelector(".add-to-cart-button");
    private By cartLinkLocator = By.cssSelector(".cart-link");

    public CourseDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCourseTitle() {
        return driver.findElement(courseTitleLocator).getText();
    }

    public void addToCart() {
        driver.findElement(addToCartButtonLocator).click();
    }

    public CartPage navigateToCart() {
        driver.findElement(cartLinkLocator).click();
        return new CartPage(driver);
    }

    // Другие методы для взаимодействия с элементами на странице подробностей курса
}
