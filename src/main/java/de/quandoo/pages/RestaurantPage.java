package de.quandoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantPage extends Page{


    public RestaurantPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@data-qa='sub-nav-tab-tab-photos']")
    static WebElement photosTab;

    @FindBy (xpath = "//*[@data-qa='sub-nav-tab-tab-menu']")
    static WebElement menuTab;

    @FindBy (xpath = "//*[@data-qa='reservation-tab']")
    static WebElement reserveNowButton;

    @FindBy (xpath = "//div[3]/div/div/p")
    static WebElement photosTabText;


    public void clickOnPhotosTab() throws InterruptedException {
        photosTab.click();
        Thread.sleep(5000);
    }

    public void clickOnMenuTab() throws InterruptedException {
        menuTab.click();
        Thread.sleep(5000);
    }

    public void clickOnReserveNowButton() throws InterruptedException {
        reserveNowButton.click();
        Thread.sleep(5000);
    }

    public String getPhotosTabText() {
        return photosTabText.getText();

    }

}
