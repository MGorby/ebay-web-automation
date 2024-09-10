package pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class DetailPagePO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public DetailPagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#gh-shop-a")
    private WebElement shopByCategoryBtn;

    @FindBy(css = "[aria-hidden='true'][data-testid='ux-textual-display'] > .ux-textspans")
    private WebElement productConditionText;

    @FindBy(css = ".ux-labels-values--legalShipping .ux-labels-values__values-content > div:nth-of-type(2)")
    private WebElement productLocationText;


    /**
     * Get Search Result Title Text
     *
     * @return variable
     */
    public String getProductConditionText() {
        String result = selenium.getText(productConditionText);
        return result;
    }


    /**
     * Get product location text
     * @return string data type
     */
    public String getProductLocationText() {
        return selenium.getText(productLocationText);
    }
}
