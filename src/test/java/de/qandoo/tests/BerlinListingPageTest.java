package de.qandoo.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class BerlinListingPageTest extends BaseTest {


    @Before
    public void SetUp() {
        /*System.setProperty("webdriver.chrome.driver", "/Users/dimitrischutin/qa_tools/chromedriver");
        driver = new ChromeDriver();*/
        driver.get("https://www.quandoo.de/en/berlin");
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
    }


    @Test
    public void breakfastInBerlin() throws InterruptedException {

        driver.findElement(By.linkText("Breakfast")).click();
        Thread.sleep(5000);
        assertEquals(driver.findElement(By.xpath("//div[@id=\'content-wrapper\']/div[2]/div/div/div/h1")).getText(), ("Breakfast Options in Berlin"));
    }

}
