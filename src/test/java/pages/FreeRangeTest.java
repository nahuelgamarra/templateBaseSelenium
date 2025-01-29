package pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeRangeTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp()  {
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void navigateToFreeRange() {
        driver.get("http://www.freerangetesters.com");

    }
    @AfterMethod
    public void tearDown() throws Exception {
        if(driver != null) {
            driver.quit();
        }
    }
}
