package de.qandoo.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HomePageTest extends BaseTest {


    @Before
    public void SetUp() {
        /*System.setProperty("webdriver.chrome.driver", "/Users/dimitrischutin/qa_tools/chromedriver");
        driver = new ChromeDriver();*/
        driver.get("https://www.quandoo.de/en");
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
    }

    @Test
    public void restaurantsInBerlin() throws InterruptedException {

        driver.findElement(By.cssSelector(".iNFuxX:nth-child(1) > .sc-AxjAm")).click();
        Thread.sleep(5000);
        assertThat(driver.findElement(By.xpath("//div[@id=\'root\']/section/div[3]/div/div[5]/div/div/div/h1")).getText(), is("Restaurants in Berlin"));

    }

    @Test
    public void whatIsQuandoo() throws InterruptedException {

        driver.findElement(By.cssSelector(".sc-1v6cum7-0:nth-child(2) > .sc-AxirZ > .sc-AxjAm")).click();
        Thread.sleep(5000);
        assertThat(driver.findElement(By.xpath("//div[3]/div[3]/div/div[2]/div/div/p")).getText(), is("Quandoo is a restaurant reservation platform that connects diners with some of the best restaurants around the world. It’s a place for foodies to discover restaurants, book tables and get eating."));
    }


}
