package de.qandoo.tests;

import org.junit.Before;
import org.junit.Test;

import static de.quandoo.pages.ReservationPage.RESERVATION_HEADER_TEXT;
import static de.quandoo.pages.RestaurantPage.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class RestaurantPageTest extends BaseTest {

    @Before
    public void setUp() {
        driver.get(RESTAURANT_URL);
        restaurantPage.clickAcceptCookiesBtn();
    }

    // Navigation tab menu tests:

    @Test
    public void checkPhotosTabText() throws InterruptedException {
        restaurantPage.clickOnPhotosTab();
        String pageText = restaurantPage.getPhotosTabText();
        assertThat(pageText,containsString(TEXT_PHOTOS_OF));
    }

    @Test
    public void checkMenuTabText() throws InterruptedException {
        restaurantPage.clickOnMenuTab();
        assertThat(restaurantPage.getMenuFromText(),containsString(MENU_TEXT));
    }

    @Test
    public void checkReserveNowButton() throws InterruptedException {
        reservationPage = restaurantPage.clickOnReserveNowButton();
        String pageText = reservationPage.getCompleteYourReservationText();
        assertThat(pageText,containsString(RESERVATION_HEADER_TEXT));
    }

}
