package org.softserve.constants;


public class Xpath {
    public interface Login{
    String
            EMAIL_INPUT = "//input[@name='login[username]']",
            PASSWORD_INPUT = "//input[@name='login[password]']",
            SIGN_IN_BUTTON = "//button[@id='send2' and @class='action login primary']",
            FORGOT_PASSWORD_BUTTON = "//a[@class='action remind' and span[text()='Forgot Your Password?']]",
            //"//a[@class='action remind']"
            CREATE_ACCOUNT_BUTTON = "//a[@class='action create primary' and span[text()='Create an Account']]";
            // "//a[@class='action create primary']"



}
    public interface Review{
        interface RATING{
            String
//                ONE_STAR_INPUT = "//label[@id='Rating_1_label']",
//                TWO_STAR_INPUT = "//label[@id='Rating_2_label']",
//                THREE_STAR_INPUT = "//label[@id='Rating_3_label']",
//                FOUR_STAR_INPUT = "//label[@id='Rating_4_label']",
//                FIVE_STAR_INPUT = "//label[@id='Rating_5_label']";// "//input[@id='Rating_5']"




            ONE_STAR_INPUT = "//input[@id='Rating_1']",
            TWO_STAR_INPUT = "//input[@id='Rating_2']",
            THREE_STAR_INPUT = "//input[@id='Rating_3']",
            FOUR_STAR_INPUT = "//input[@id='Rating_4']",
            FIVE_STAR_INPUT = "//input[@id='Rating_5']";
        }
        String
                PRODUCT_REVIEWS_BUTTON = "//a[@id='tab-label-reviews-title']",
                NICKNAME_INPUT = "//input[@id='nickname_field']",
                SUMMARY_INPUT = "//input[@id='summary_field']",
                REVIEW_TEXTAREA = "//textarea[@id='review_field']",
                SUBMIT_BUTTON = "//button[@class='action submit primary' and span[text()='Submit Review']]",
                                //  "//button[@class='action submit primary']"
                REVIEW_SUBMITTED_MESSAGE = "//div[@role='alert' and div//div[text()='You submitted your review for moderation.']]";
    }                          // "//div[@role='alert']"

}
