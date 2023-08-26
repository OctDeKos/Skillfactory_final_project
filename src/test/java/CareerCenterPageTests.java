import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.test_flow_tech.pages.CareerCenterPage;
import org.test_flow_tech.utils.WebDriverFactory;

import static org.junit.Assert.assertEquals;

public class CareerCenterPageTests {
    private WebDriver driver;
    private CareerCenterPage careerCenterPage;
    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        careerCenterPage = new CareerCenterPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    //Проверка заголовка страницы Центра Карьеры:
    @Test
    public void testCareerCenterPageTitle() {
        careerCenterPage.navigateTo();
        assertEquals("Центр карьеры SkillFactory", careerCenterPage.getTitle());
    }
}
