package org.softserve.women.tops;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.softserve.SetupDriver;
import org.softserve.base.BaseUnauthorized;
import org.softserve.pages.women.tops.WomenTopsPage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.softserve.constants.Constants.Links.WOMEN_TOPS_LINK;

// Sereda Olga
class WomenTopsPageTest extends BaseUnauthorized {
    protected static WomenTopsPage womenTopsPage;
    private List<Integer> actual = new ArrayList<>();
    @BeforeAll
    public static void beforeAllMethod(){
        womenTopsPage = new WomenTopsPage(driver);
        womenTopsPage.open(WOMEN_TOPS_LINK);
        womenTopsPage.fullSizeScreen();
    }

    @Test
    public void sortByPriceToHigher(){
        womenTopsPage.clickSortBy();
        womenTopsPage.clickSortByPrice();
        actual = womenTopsPage.getPriceValues();
        boolean isFirstPriceTheLowest = true;
        for (int i = 1; i < actual.size(); i++){
            if (actual.get(i-1) > actual.get(i)){
                isFirstPriceTheLowest = false;
                break;
            }
        }
        assertTrue(isFirstPriceTheLowest);
    }
}