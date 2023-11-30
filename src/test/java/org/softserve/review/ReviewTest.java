package org.softserve.review;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.softserve.base.BaseAuthorized;
import org.softserve.pages.product.review.ReviewPage;


import static org.softserve.constants.Constants.Links.PRODUCT_EXAMPLE_LINK;




class ReviewTest extends BaseAuthorized {
    protected static ReviewPage reviewPage; //= new ReviewPage(driver);



    @BeforeAll
    public static void baseAuthorizedBeforeAll(){
        reviewPage = new ReviewPage(driver);
    }

    @Test
    public void createReviewTest() {

        reviewPage.open(PRODUCT_EXAMPLE_LINK);
        reviewPage.clickProductReviewsButton()
                .clickRatingFiveStar()
                .fillNickname("test")
                .fillSummary("summary")
//                .fillReview(yourReviewTextareaElement, "Review")
                .clickSubmitButton();

        Assertions.assertNotNull(reviewPage.getReviewMessageElement());
    }








}