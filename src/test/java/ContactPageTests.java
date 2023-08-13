import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.test_flow_tech.pages.ContactPage;
import org.test_flow_tech.pages.HomePage;
import org.test_flow_tech.utils.WebDriverFactory;
import static org.junit.Assert.*;
public class ContactPageTests {
    private WebDriver driver;
    private ContactPage contactPage;

    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        contactPage = new ContactPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
