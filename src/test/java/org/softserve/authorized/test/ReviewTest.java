package org.softserve.authorized.test;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.softserve.authorized.base.BaseAuthorized;
import org.softserve.pages.product.review.ReviewPage;
import org.softserve.pages.product.review.ReviewPage.StarRating;

import static org.softserve.constants.Constants.Links.PRODUCT_EXAMPLE_LINK;




class ReviewTest extends BaseAuthorized {
    protected ReviewPage reviewPage = new ReviewPage(driver);

    @Test
    public void createReviewTest() {

        reviewPage.open(PRODUCT_EXAMPLE_LINK);
        reviewPage.clickProductReviewsButton()
                .clickRating(StarRating.FIVE_STAR)
                .fillNickname("test")
                .fillSummary("summary")
                .fillReview("Review")
                .clickSubmitButton();

        Assertions.assertNotNull(reviewPage.getReviewMessageElement());
    }








}