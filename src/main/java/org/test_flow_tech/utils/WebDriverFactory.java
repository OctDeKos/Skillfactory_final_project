package org.test_flow_tech.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
    public static WebDriver createWebDriver() {
        // Определение пути к chromedriver в директории resources
        String chromeDriverPath = WebDriverFactory.class.getClassLoader().getResource("chromedriver").getPath();

        // Указание пути к ChromeDriver
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        ChromeOptions options = new ChromeOptions();
        // Необходимые настройки ChromeOptions, например, для управления браузером

        WebDriver driver = new ChromeDriver(options);

        // Настройка размера окна браузера
        driver.manage().window().maximize();

        return driver;
    }
}
