package org.softserve.woman.top.content;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.softserve.base.BaseUnauthorized;
import org.softserve.pages.woman.top.content.WomanTopContentPage;

import static org.softserve.constants.Constants.Links.MAIN_PAGE_LINK;



// Petrenko Maryna



class WomanTopContentPageTest extends BaseUnauthorized {
    protected static WomanTopContentPage womanTopContentPage;



    @BeforeAll
    public static void beforeAllMethod(){
        womanTopContentPage = new WomanTopContentPage(driver);
        womanTopContentPage.open(MAIN_PAGE_LINK);

    }



    @Test
    public void verifyAllTabsAvailibility(){
        womanTopContentPage.clickWomanTab()
                           .clickTopsItem()
                           .verifyTitelVisible()
                           .clickFirstElement()
                           .verifyMainContentVisible()
                           .scrollToDetailsTab();
        womanTopContentPage.clickMoreInfoTab();
        Assertions.assertNotNull(womanTopContentPage.getMoreInfoContent());
        womanTopContentPage.clickReviewsTab();
        Assertions.assertNotNull(womanTopContentPage.getReviewsContent());
        womanTopContentPage.clickDetailsTab();
        Assertions.assertNotNull(womanTopContentPage.getDetailsContent());


    }
}