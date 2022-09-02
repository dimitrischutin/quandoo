package de.qandoo.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class RestaurantPageTest extends BaseTest {



    @Before
    public void SetUp() {
       /* System.setProperty("webdriver.chrome.driver", "/Users/dimitrischutin/qa_tools/chromedriver");
        driver = new ChromeDriver();
        restaurantPage = new RestaurantPage(driver);*/
        driver.get("https://www.quandoo.de/en/place/cavallino-rosso-306");
        restaurantPage.clickAcceptCookiesButton();
    }


    // Navigation tab menu tests:


    @Test
    public void checkPhotosTabText() throws InterruptedException {

        restaurantPage.clickOnPhotosTab();
        String pageText = restaurantPage.getPhotosTabText();
        assertThat(pageText, containsString("Looking for pictures"));
    }

    @Test
    public void checkMenuTabText() throws InterruptedException {

        restaurantPage.clickOnMenuTab();
        assertEquals(driver.findElement(By.xpath("//div[@id=\'content\']/div/div[2]/div/div/h3")).getText(),  ("Check out the menu(s)"));
    }

    @Test
    public void checkReserveNowButton() throws InterruptedException {

        restaurantPage.clickOnReserveNowButton();
        assertEquals(driver.findElement(By.xpath("//div[@id=\'root\']/section/div[3]/div/div[2]/div/h1")).getText(), ("Complete your reservation"));
    }

}
