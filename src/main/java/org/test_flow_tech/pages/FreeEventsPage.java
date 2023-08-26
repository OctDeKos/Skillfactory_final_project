package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreeEventsPage {
    private WebDriver driver;

    private String baseUrl = "https://skillfactory.ru/free-events";

    // Локаторы элементов на странице корзины
    private By freeEventsItemsLocator = By.cssSelector(".cart-items");
    // ... другие локаторы ...

    public FreeEventsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateTo() {
        driver.get(baseUrl); // Переход на страницу бесплатных курсов
    }
    public String getTitle() {
        return driver.getTitle();
    }

    public boolean containsCourseWithTitle(String courseTitle) {
        return driver.findElement(freeEventsItemsLocator).getText().contains(courseTitle);
    }

    // Другие методы для взаимодействия с элементами на странице

    // ...
}
