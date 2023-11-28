package org.softserve.pages.women.tops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.softserve.pages.base.BasePage;

import java.util.ArrayList;
import java.util.List;

import static org.softserve.constants.Xpath.SortByTemplate.*;


// Sereda Olga
public class WomenTopsPage extends BasePage {

    @FindBy(xpath = SORT_BY_PRICE_XPATH)
    private WebElement sortByPrice;
    @FindBy(xpath = SORT_BY_PRODUCT_NAME_XPATH)
    private WebElement sortByProductName;
    @FindBy(xpath = SORT_BY_POSITION_XPATH)
    private WebElement sortByPosition;
    @FindBy(xpath = DESCENDING_DIRECTION_XPATH)
    private WebElement descendingDirection;
    @FindBy(xpath = PRICE_VALUES_XPATH)
    private List<WebElement> priceValues;


    public WomenTopsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSortByPrice(){sortByPrice.click();}
    public void clickSortByProductName(){sortByProductName.click();}
    public void clickSortByPosition(){sortByPosition.click();}
    public void clickDescendingDirection(){descendingDirection.click();}
    public WebElement getFirstPriceElement(){return priceValues.get(0);}
    public List<Integer> getPriceValues() {
        List<Integer> priceValuesList = new ArrayList<>();
        for (WebElement price : priceValues) {
            Integer currentPrice = Integer.parseInt(price.getAttribute("data-price-amount"));
            priceValuesList.add(currentPrice);
        }
        return priceValuesList;
    }
}
