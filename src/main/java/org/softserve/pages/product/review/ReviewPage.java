package org.softserve.pages.product.review;



import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.softserve.constants.Xpath.Review;
import org.softserve.pages.base.BasePage;

public class ReviewPage extends BasePage {


    @FindBy(xpath = Review.PRODUCT_REVIEWS_BUTTON)
    WebElement productReviewsButton;
    @FindBy(xpath = Review.NICKNAME_INPUT)
    WebElement nicknameInput;
    @FindBy(xpath = Review.SUMMARY_INPUT)
    WebElement summaryInput;
    @FindBy(xpath = Review.REVIEW_TEXTAREA)
    WebElement reviewTextarea;
    @FindBy(xpath = Review.SUBMIT_BUTTON)
    WebElement submitButton;

    @FindBy(xpath = Review.REVIEW_SUBMITTED_MESSAGE)
    WebElement reviewSubmittedMessage;


    @FindBy(xpath = Review.RATING.ONE_STAR_INPUT)
    static WebElement oneStarInput;

    @FindBy(xpath = Review.RATING.TWO_STAR_INPUT)
    static WebElement twoStarInput;
    @FindBy(xpath = Review.RATING.THREE_STAR_INPUT)
    static WebElement threeStarInput;
    @FindBy(xpath = Review.RATING.FOUR_STAR_INPUT)
    static WebElement fourStarInput;
    @FindBy(xpath = Review.RATING.FIVE_STAR_INPUT)
    static WebElement fiveStarInput;
    public enum StarRating {
        ONE_STAR(oneStarInput),
        TWO_STAR(twoStarInput),
        THREE_STAR(threeStarInput),
        FOUR_STAR(fourStarInput),
        FIVE_STAR(fiveStarInput);
        private WebElement value;
        StarRating(WebElement star) {
            this.value = star;
        }
        public WebElement getValue() {
            return value;
        }
    }


    public ReviewPage(WebDriver driver) {
        super(driver);
    }

    public ReviewPage clickProductReviewsButton(){
        waitElementIsClickable(productReviewsButton);
        productReviewsButton.click();
        return this;
    }

    public ReviewPage fillNickname(String nickname){
        waitElementIsVisible(nicknameInput);
        fillField(nicknameInput, nickname);
        return this;
    }
    public ReviewPage fillSummary(String summary){
        waitElementIsVisible(summaryInput);
        fillField(summaryInput, summary);
        return this;
    }
    public ReviewPage fillReview(String review){
        waitElementIsVisible(reviewTextarea);
        fillField(reviewTextarea, review);
        return this;
    }

    public ReviewPage clickSubmitButton(){
        waitElementIsClickable(submitButton);
        submitButton.click();
        return this;
    }

    public ReviewPage clickRating(StarRating starInput){
        waitElementIsClickable(starInput.getValue());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", starInput.getValue());
        js.executeScript("arguments[0].click();", starInput.getValue());

        return this;
    }

    public WebElement getReviewMessageElement(){
        return reviewSubmittedMessage;
    }



}







