import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.test_flow_tech.pages.FreeEventsPage;
import org.test_flow_tech.utils.WebDriverFactory;

import static org.junit.Assert.assertEquals;

public class FreeEventsPageTests {
    private WebDriver driver;
    private FreeEventsPage freeEventsPage;

    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        freeEventsPage = new FreeEventsPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    //Проверка заголовка страницы Бесплатных курсов:
    @Test
    public void freeEventsPageTitle() {
        freeEventsPage.navigateTo();
        assertEquals("Бесплатные курсы, онлайн обучение профессиям с " +
                "получением сертификата, семинары и вебинары бесплатно от Skillfactory", freeEventsPage.getTitle());
    }
}
