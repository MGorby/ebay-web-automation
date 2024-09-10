package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pagesObject.DetailPagePO;
import pagesObject.SearchPagePO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class DetailPageStep extends TestBase{

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private DetailPagePO detail = new DetailPagePO(driver);

    @Then("user see the product condition is {string}")
    public void userSeeTheProductConditionIs(String condition) throws InterruptedException {
        selenium.closeTabWindowBrowser(0);
        Assert.assertEquals(detail.getProductConditionText(), condition, "The Condition is not New");
    }

    @And("user see the product locations is contains {string}")
    public void userSeeTheProductLocationsIsContains(String location) {
        Assert.assertTrue(detail.getProductLocationText().contains(location), "Product location is outside China");
    }
}
