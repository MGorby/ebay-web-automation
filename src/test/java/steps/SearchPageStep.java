package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pagesObject.DetailPagePO;
import pagesObject.SearchPagePO;
import tests.TestBase;
import utility.SeleniumHelpers;

import java.text.ParseException;

public class SearchPageStep extends TestBase{

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private SearchPagePO search = new SearchPagePO(driver);

    @Given("user navigates to {string}")
    public void userNavigatesToMamikosHomepage(String url) {
        selenium.navigateToPage(url);
    }

    @When("user go to Cell Phones & Smartphones page")
    public void userGoToCellPhonesSmartphonesPage() throws InterruptedException {
        search.clickOnShopByCategoryDropdown();
        search.clickOnCellPhonesAccBtn();
        search.clickOnCellPhonesSmartphonesBtn();
    }

    @And("user open all filter")
    public void userOpenAllFilter() throws InterruptedException {
        search.clickOnAllFiltersBtn();
    }

    @And("user set New in Condition filter")
    public void userSetNewInConditionFilter() throws InterruptedException {
        search.clickConditionTabFilter();
        search.selectNewConditionFilter();
    }

    @And("user set min price filter {string}")
    public void userSetMinPriceFilter(String minprice) throws InterruptedException {
        search.clickPriceTabFilter();
        search.setMinPriceFilter(minprice);
    }

    @And("user set max price filter {string}")
    public void userSetMaxPriceFilter(String maxprice) throws InterruptedException {
        search.setMaxPriceFilter(maxprice);
    }

    @And("user set Item Location filter in Asia")
    public void userSetItemLocationFilterInAsia() throws InterruptedException {
        search.clickLocationFilter();
        search.selectAsiaLocationFilter();
    }

    @And("user click on apply button")
    public void userClickOnApplyButton() throws InterruptedException {
        search.clickApplyBtn();
    }

    @And("user see search result title is {string}")
    public void userSeeSearchResultTitleIs(String title) {
        Assert.assertEquals(search.getSearchResultTitleText(), title, "Search result title is not equals");
    }

    @And("user select the first result")
    public void userSelectTheFirstResult() throws InterruptedException {
        search.selectFirstResult();
    }

    @When("user type {string} on searchbox")
    public void userTypeOnSearchbox(String keyword) {
        search.enterSearchKeyword(keyword);
    }

    @And("user change the search category as {string}")
    public void userChangeTheSearchCategoryAs(String category) throws InterruptedException {
        search.clickOnAllCategoriesDropdown();
        search.clickCategoryOption(category);
    }

    @And("user click on search button")
    public void userClickOnSearchButton() throws InterruptedException {
        search.clickSearchButton();
    }

    @And("user see that the name of the first result item contains {string}")
    public void userSeeThatTheNameOfTheFirstResultItemContains(String title) {
        Assert.assertTrue(search.getFirstItemTitleText().toLowerCase().contains(title.toLowerCase()), "Product is not match with keyword");
    }
}
