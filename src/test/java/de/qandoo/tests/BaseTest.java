package de.qandoo.tests;

import de.quandoo.pages.FilterPage;
import de.quandoo.pages.HomePage;
import de.quandoo.pages.ReservationPage;
import de.quandoo.pages.RestaurantPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected HomePage homePage;
    protected FilterPage filterPage;
    protected RestaurantPage restaurantPage;
    protected ReservationPage reservationPage;

    protected WebDriver driver;

    @Before
    public void initialSetUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/dimitrischutin/qa_tools/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1829, 1038));
        restaurantPage = new RestaurantPage(driver);
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}