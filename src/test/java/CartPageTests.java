import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.test_flow_tech.pages.CartPage;
import org.test_flow_tech.utils.WebDriverFactory;
import static org.junit.Assert.*;
public class CartPageTests {
    private WebDriver driver;
    private CartPage cartPage;

    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(); // Метод создания веб-драйвера
        cartPage = new CartPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
