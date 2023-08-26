import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.test_flow_tech.pages.HomePage;
import org.test_flow_tech.utils.WebDriverFactory;
import static org.junit.Assert.*;

public class HomePageTests {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        homePage = new HomePage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    //Проверка заголовка главной страницы:
    @Test
    public void testHomePageTitle() {
        homePage.navigateTo();
        assertEquals("Онлайн-школа Skillfactory — онлайн-обучение востребованным IT-профессиям", homePage.getTitle());
    }
    //Проверка наличия списка курсов на главной странице:
    @Test
    public void testCourseListExists() {
        homePage.navigateTo();
        assertTrue(homePage.isCourseListDisplayed());
    }

    // Другие тесты для главной страницы
}

