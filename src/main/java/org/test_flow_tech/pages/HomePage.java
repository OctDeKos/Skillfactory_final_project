package org.test_flow_tech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Локаторы элементов на странице
    private By courseListLocator = By.cssSelector(".course-list");
    // ... другие локаторы ...
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateTo() {
        driver.get("https://skillfactory.ru/");
    }
    public String getTitle() {
        return driver.getTitle();
    }

    public boolean isCourseListDisplayed() {
        return driver.findElement(courseListLocator).isDisplayed();
    }

    public ContactPage navigateToContactPage() {
        driver.findElement(By.linkText("Контакты")).click();
        return new ContactPage(driver);
    }

/*    public SearchResultPage searchForCourse(String query) {
        // Взаимодействие с полем поиска и кнопкой поиска
        return new SearchResultPage(driver);
    }*/

    public CareerCenterPage clickOnCourse(String courseTitle) {
        // Нажатие на указанный курс в списке
        return new CareerCenterPage(driver);
    }

    public boolean hasFreeCourses() {
        // Проверка наличия бесплатных курсов
        return true;
    }

    // ... другие методы ...
}
