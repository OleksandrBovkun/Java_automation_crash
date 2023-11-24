package org.softserve.pages.product.review;





import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.softserve.constants.Xpath.ReviewTemplate;
import org.softserve.pages.base.BasePage;

public class ReviewPage extends BasePage {


    @FindBy(xpath = ReviewTemplate.PRODUCT_REVIEWS_BUTTON)
    WebElement productReviewsButton;
    @FindBy(xpath = ReviewTemplate.NICKNAME_INPUT)
    WebElement nicknameInput;
    @FindBy(xpath = ReviewTemplate.SUMMARY_INPUT)
    WebElement summaryInput;
    @FindBy(xpath = ReviewTemplate.REVIEW_TEXTAREA)
    WebElement reviewTextarea;
    @FindBy(xpath = ReviewTemplate.SUBMIT_BUTTON)
    WebElement submitButton;
    @FindBy(xpath = ReviewTemplate.REVIEW_SUBMITTED_MESSAGE)
    WebElement reviewSubmittedMessage;

    @FindBy(xpath = ReviewTemplate.Rating.ONE_STAR_INPUT)
    static WebElement oneStarInput;
    @FindBy(xpath = ReviewTemplate.Rating.TWO_STAR_INPUT)
    static WebElement twoStarInput;
    @FindBy(xpath = ReviewTemplate.Rating.THREE_STAR_INPUT)
    static WebElement threeStarInput;
    @FindBy(xpath = ReviewTemplate.Rating.FOUR_STAR_INPUT)
    static WebElement fourStarInput;
    @FindBy(xpath = ReviewTemplate.Rating.FIVE_STAR_INPUT)
    static WebElement fiveStarInput;

    //todo: provide validator (hibernate validator), change 'clickRating' method so it can get int value to select star
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







