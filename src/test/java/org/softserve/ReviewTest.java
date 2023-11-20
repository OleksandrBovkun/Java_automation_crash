package org.softserve;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.softserve.base.BaseTest;
import org.softserve.pages.product.review.ReviewPage.StarRating;

import static org.softserve.Config.QUIT_BROWSER;
import static org.softserve.constants.Constant.Links.LOGIN_PAGE_LINK;
import static org.softserve.constants.Constant.Links.PRODUCT_EXAMPLE_LINK;


class ReviewTest extends BaseTest {




    @Test
    public void createReviewTest() {
        loginPage.open(LOGIN_PAGE_LINK);
        loginPage.login(Config.LOGIN, Config.PASSWORD);


        reviewPage.open(PRODUCT_EXAMPLE_LINK);
        reviewPage.clickProductReviewsButton()
                .clickRating(StarRating.FIVE_STAR)
                .fillNickname("test")
                .fillSummary("summary")
                .fillReview("Review")
                .clickSubmitButton();

        Assert.assertNotNull("Element is not present on the page", reviewPage.getReviewMessageElement());
        logoutPage.logout();

    }








}