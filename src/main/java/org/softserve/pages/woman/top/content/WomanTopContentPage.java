package org.softserve.pages.woman.top.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.softserve.pages.base.BasePage;


import static org.softserve.constants.Xpath.WomanTab.*;


// Petrenko Maryna
public class WomanTopContentPage extends BasePage {

    @FindBy(xpath = WOMAN_ITEM)
    private WebElement womanItem;
    @FindBy(xpath = TOPS_ITEM)
    private WebElement topsItem;
    @FindBy(xpath = PAGE_TITLE)
    private WebElement pageTitle;
    @FindBy(xpath = FIRST_ELEMENT)
    private WebElement firstElement;
    @FindBy(xpath = MAIN_CONTENT)
    private WebElement mainContent;
    @FindBy(xpath = DETAILS_TAB)
    private WebElement detailsTab;
    @FindBy(xpath = DETAILS_CONTENT)
    private WebElement detailsContent;
    @FindBy(xpath = MORE_INFO_TAB)
    private WebElement moreInfoTab;
    @FindBy(xpath = MORE_INFO_CONTENT)
    private WebElement moreInfoContent;
    @FindBy(xpath = REVIEWS_TAB)
    private WebElement reviewsTab;
    @FindBy(xpath = REVIEWS_CONTENT)
    private WebElement reviewsContent;



    public WomanTopContentPage(WebDriver driver) { super(driver);}

    public WomanTopContentPage clickWomanTab(){
        waitElementIsClickable(womanItem);
        womanItem.click();
        return this;
    }

    public WomanTopContentPage clickTopsItem(){
        waitElementIsClickable(topsItem);
        topsItem.click();
        return this;
    }


    public WomanTopContentPage verifyTitelVisible(){
        waitElementIsClickable(pageTitle);
        return this;
    }

    public WomanTopContentPage clickFirstElement(){
        waitElementIsClickable(firstElement);
        firstElement.click();
        return this;
    }


    public WomanTopContentPage verifyMainContentVisible(){
        waitElementIsClickable(mainContent);
        return this;
    }

    public WomanTopContentPage scrollToDetailsTab(){
        scrollToElement(detailsTab);
        return this;
    }

    public WomanTopContentPage clickDetailsTab(){
        waitElementIsClickable(detailsTab);
        detailsTab.click();
        return this;
    }

//    public WomanTopContentPage verifyDetailsContentVisible(){
//        waitElementIsClickable(detailsContent);
//        return this;
//    }

    public WebElement getDetailsContent(){
        return detailsContent;
    }


    public WomanTopContentPage clickMoreInfoTab(){
        waitElementIsClickable(moreInfoTab);
        moreInfoTab.click();
        return this;
    }

//    public WomanTopContentPage verifyMoreInfoContentVisible(){
//        waitElementIsClickable(moreInfoContent);
//        return this;
//    }

    public WebElement getMoreInfoContent(){
        return moreInfoContent;
    }

    public WomanTopContentPage clickReviewsTab(){
        waitElementIsClickable(reviewsTab);
        reviewsTab.click();
        return this;
    }

//    public WomanTopContentPage verifyReviewsContentVisible(){
//        waitElementIsClickable(reviewsContent);
//        return this;
//    }

    public WebElement getReviewsContent(){
        return reviewsContent;
    }
}
