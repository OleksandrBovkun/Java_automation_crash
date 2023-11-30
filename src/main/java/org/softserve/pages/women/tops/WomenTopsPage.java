package org.softserve.pages.women.tops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.softserve.pages.base.BasePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.softserve.constants.Xpath.SortByTemplate.*;


// Sereda Olga
public class WomenTopsPage extends BasePage {

    @FindBy(xpath = SORT_BY)
    private WebElement sortBy;
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
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public WomenTopsPage(WebDriver driver) {
        super(driver);
    }
    public void clickSortBy(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SORT_BY)));
        sortBy.click();
    }

    public void clickSortByPrice(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SORT_BY_PRICE_XPATH)));
        sortByPrice.click();

    }

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
