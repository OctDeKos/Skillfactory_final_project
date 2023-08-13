package org.test_flow_tech.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    // Локаторы элементов на странице корзины
    private By cartItemsLocator = By.cssSelector(".cart-items");
    // ... другие локаторы ...

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean containsCourseWithTitle(String courseTitle) {
        return driver.findElement(cartItemsLocator).getText().contains(courseTitle);
    }

    // Другие методы для взаимодействия с элементами на странице корзины

    // ... например, методы для оформления заказа, удаления элементов, расчета стоимости и т.д. ...
}
