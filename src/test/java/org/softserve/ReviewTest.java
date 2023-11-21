package org.softserve;





import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.softserve.base.BaseTest;
import org.softserve.pages.product.review.ReviewPage.StarRating;

import static org.softserve.constants.Constants.Links.LOGIN_PAGE_LINK;
import static org.softserve.constants.Constants.Links.PRODUCT_EXAMPLE_LINK;


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

        Assertions.assertNotNull(reviewPage.getReviewMessageElement());
        logoutPage.logout();

    }








}