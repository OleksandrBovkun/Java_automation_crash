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
    WebElement oneStarInput;
    @FindBy(xpath = ReviewTemplate.Rating.TWO_STAR_INPUT)
    WebElement twoStarInput;
    @FindBy(xpath = ReviewTemplate.Rating.THREE_STAR_INPUT)
    WebElement threeStarInput;
    @FindBy(xpath = ReviewTemplate.Rating.FOUR_STAR_INPUT)
    WebElement fourStarInput;
    @FindBy(xpath = ReviewTemplate.Rating.FIVE_STAR_INPUT)
    WebElement fiveStarInput;

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

    public ReviewPage clickRatingOneStar(){
        WebElement star = oneStarInput;
        clickStar(star);
        return this;
    }
    public ReviewPage clickRatingTwoStar(){
        WebElement star = twoStarInput;
        clickStar(star);
        return this;
    }
    public ReviewPage clickRatingThreeStar(){
        WebElement star = threeStarInput;
        clickStar(star);
        return this;
    }
    public ReviewPage clickRatingFourStar(){
        WebElement star = fourStarInput;
        clickStar(star);
        return this;
    }
    public ReviewPage clickRatingFiveStar(){
        WebElement star = fiveStarInput;
        clickStar(star);
        return this;
    }

    private ReviewPage clickStar(WebElement star){
        waitElementIsClickable(star);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", star);
        js.executeScript("arguments[0].click();", star);
        return this;
    }


    public WebElement getReviewMessageElement(){
        return reviewSubmittedMessage;
    }



}







