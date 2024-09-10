package pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class SearchPagePO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public SearchPagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#gh-ac")
    private WebElement searchBox;

    @FindBy(css = "#gh-cat")
    private WebElement allCategoriesDropdown;

    @FindBy(css = "[value='58058']")
    private WebElement computerTabletCategoryBtn;

    @FindBy(css = "#gh-btn")
    private WebElement searchBtn;

    @FindBy(css = "#gh-shop-a")
    private WebElement shopByCategoryDropdown;

    @FindBy(css = "[_sp='m570.l3652']")
    private WebElement cellPhoneAndAccBtn;

    @FindBy(xpath = "//a[contains(text(),'Cell Phones & Smartphones')]")
    private WebElement cellPhonesAndSmartphonesBtn;

    @FindBy(css = ".brm__all-filters")
    private WebElement allFiltersBtn;

    @FindBy(css = "[data-aspecttitle='LH_ItemCondition']")
    private WebElement filterConditionTab;

    @FindBy(css = "[for='c3-subPanel-LH_ItemCondition_New_cbx']")
    private WebElement newConditionCheckbox;

    @FindBy(css = "[data-aspecttitle='price']")
    private WebElement filterPriceTab;

    @FindBy(css = ".x-textrange__input--from")
    private WebElement minPriceTxtBox;

    @FindBy(css = ".x-textrange__input--to")
    private WebElement maxPriceTxtBox;

    @FindBy(css = "[data-aspecttitle='location']")
    private WebElement itemLocationTab;

    @FindBy(xpath = "//input[@value='Asia']")
    private WebElement asiaCheckBox;

    @FindBy(css = ".btn--primary")
    private WebElement applyBtn;

    @FindBy(css = ".b-pageheader__text")
    private WebElement searchResultTitle;

    @FindBy(xpath = "(//a[@class='s-item__link'])[1]")
    private WebElement firstItemTitle;

    @FindBy(xpath = "((//span[@role='heading']))[3]")
    private WebElement firstItemName;

    /**
     * Click on Shop by Category dropdown
     * @throws InterruptedException
     */
    public void clickOnShopByCategoryDropdown() throws InterruptedException {
        selenium.clickOn(shopByCategoryDropdown);
    }

    /**
     * Click on Cell Phones & Accessories button
     * @throws InterruptedException
     */
    public void clickOnCellPhonesAccBtn() throws InterruptedException {
        selenium.clickOn(cellPhoneAndAccBtn);
    }

    /**
     * Click on Cell Phones & Smartphones button
     * @throws InterruptedException
     */
    public void clickOnCellPhonesSmartphonesBtn() throws InterruptedException {
        selenium.clickOn(cellPhonesAndSmartphonesBtn);
    }

    /**
     * Click on All Filters button
     * @throws InterruptedException
     */
    public void clickOnAllFiltersBtn() throws InterruptedException {
        selenium.clickOn(allFiltersBtn);
    }

    /**
     * Click on Condition Tab in All Filter
     * @throws InterruptedException
     */
    public void clickConditionTabFilter() throws InterruptedException {
        selenium.clickOn(filterConditionTab);
    }

    /**
     * Select New option in Condition Filter
     * @throws InterruptedException
     */
    public void selectNewConditionFilter() throws InterruptedException {
        selenium.clickOn(newConditionCheckbox);
    }

    /**
     * Click on Price Tab in All Filter
     * @throws InterruptedException
     */
    public void clickPriceTabFilter() throws InterruptedException {
        selenium.clickOn(filterPriceTab);
    }

    /**
     * Set min price in Filter
     */
    public void setMinPriceFilter(String minprice){
        selenium.enterText(minPriceTxtBox, minprice, false);
    }

    /**
     * Set max price in Filter
     */
    public void setMaxPriceFilter(String maxprice){
        selenium.enterText(maxPriceTxtBox, maxprice, false);
    }

    /**
     * Click on Item Location Tab in All Filter
     * @throws InterruptedException
     */
    public void clickLocationFilter() throws InterruptedException {
        selenium.clickOn(itemLocationTab);
    }

    /**
     * Select Asia option in Item Location Filter
     */
    public void selectAsiaLocationFilter(){
        selenium.javascriptClickOn(asiaCheckBox);
    }

    /**
     * Click Apply button on filter
     * @throws InterruptedException
     */
    public void clickApplyBtn() throws InterruptedException {
        selenium.clickOn(applyBtn);
    }

    /**
     * Select first option on search result
     * @throws InterruptedException
     */
    public void selectFirstResult() throws InterruptedException {
        selenium.clickOn(firstItemTitle);
    }

    /**
     * Get Search Result Title Text
     *
     * @return variable
     */
    public String getSearchResultTitleText() {
        String result = selenium.getText(searchResultTitle);
        return result;
    }

    /**
     * Enter search keyword in searchbox
     */
    public void enterSearchKeyword(String keyword){
        selenium.enterText(searchBox, keyword, false);
    }

    /**
     * Click All Categories in searchbar
     * @throws InterruptedException
     */
    public void clickOnAllCategoriesDropdown() throws InterruptedException {
        selenium.clickOn(allCategoriesDropdown);
    }

    /**
     * Click Category Option in All Categories Dropdown
     * @throws InterruptedException
     */
    public void clickCategoryOption(String category) throws InterruptedException{
        selenium.clickOn(driver.findElement(By.xpath("//option[.='"+ category +"']")));
    }

    /**
     * Click Search button
     * @throws InterruptedException
     */
    public void clickSearchButton() throws InterruptedException {
        selenium.clickOn(searchBtn);
    }

    /**
     * Get Search Result Title Text
     *
     * @return variable
     */
    public String getFirstItemTitleText() {
        String name = selenium.getText(firstItemName);
        return name.toLowerCase();
    }
}
