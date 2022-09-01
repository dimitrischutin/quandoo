package de.qandoo.tests;

import de.quandoo.pages.RestaurantPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

   protected WebDriver driver;
    protected RestaurantPage restaurantPage;

    @Before
    public void initialSetUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/dimitrischutin/qa_tools/chromedriver");
        driver = new ChromeDriver();
        restaurantPage = new RestaurantPage(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
