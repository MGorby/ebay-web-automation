package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class TaskOnePO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public TaskOnePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#nav-link-accountList")
    private WebElement signInButton;

    @FindBy(css = "#createAccountSubmit")
    private WebElement signUpButton;

    @FindBy(css = "#ap_customer_name")
    private WebElement nameForm;

    @FindBy(css = "#ap_email")
    private WebElement emailForm;

    @FindBy(css = "#ap_password")
    private WebElement passwordForm;

    @FindBy(css = "#ap_password_check")
    private WebElement passwordCheck;

    @FindBy(css = "#continue")
    private WebElement createAccButton;

    @FindBy(css = "#auth-password-mismatch-alert > div > div")
    private WebElement missMatchPasswordPopUp;

    @FindBy(css = "#authportal-main-section > div:nth-child(2) > div > div.a-section.a-spacing-large > div > div > h4")
    private WebElement registeredEmailPopUp;

//    @FindBy(css = "#auth-error-message-box > div > div > ul > li > span")
    @FindBy(css = "#auth-error-message-box > div")
    private WebElement unavailableEmailPopUp;

    @FindBy(css = "#signInSubmit")
    private WebElement submitSignInButton;

    @FindBy(xpath = "//*[contains(text(),'Buy Again')]")
    private WebElement buyAgainButton;

    @FindBy(xpath = "(//span[contains(text(),'Browsing History')])[3]")
    private WebElement browsingHistoryButton;

    @FindBy(css = "#nav-hamburger-menu")
    private WebElement sideBarButton;

    @FindBy(css = "#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(27) > a")
    private WebElement signOutButton;

    /**
     * Click on Sign In button
     *
     * @throws InterruptedException
     */
    public void clickSignIn() throws InterruptedException {
        selenium.clickOn(signInButton);
    }

    /**
     * Click on Sign Up button
     *
     * @throws InterruptedException
     */
    public void clickSignUp() throws InterruptedException {
        selenium.clickOn(signUpButton);
    }

    /**
     * Enter Text in Your name
     * @param word is text we want to search
     */
    public void enterYourName(String word) {
        selenium.enterText(nameForm, word, false);
    }

    /**
     * Enter Text in Email
     * @param word is text we want to search
     */
    public void enterEmail(String word) {
        selenium.enterText(emailForm, word, false);
    }

    /**
     * Enter Text in Password
     * @param word is text we want to search
     */
    public void enterPassword(String word) {
        selenium.enterText(passwordForm, word, false);
    }

    /**
     * Enter Text in Password Check
     * @param word is text we want to search
     */
    public void enterPasswordCheck(String word) {
        selenium.enterText(passwordCheck, word, false);
    }

    /**
     * Click on Sign In button
     *
     * @throws InterruptedException
     */
    public void clickCreateAcc() throws InterruptedException {
        selenium.clickOn(createAccButton);
    }

    /**
     * Get Invalid warning Text
     *
     * @return variable
     */
    public String getMissMatchPasswordPopUpText() {
        String warning = selenium.getText(missMatchPasswordPopUp);
        return warning;
    }

    /**
     * Get Invalid email warning Text
     *
     * @return variable
     */
    public String getRegisteredEmailPopUpText() {
        String registered = selenium.getText(registeredEmailPopUp);
        return registered;
    }

    /**
     * Click on Continue button
     *
     * @throws InterruptedException
     */
    public void clickContinue() throws InterruptedException {
        selenium.clickOn(createAccButton);
    }

//    /**
//     * Get Cannot find email Text
//     *
//     * @return variable
//     */
//    public String getUnavailableEmailPopUpText() {
//        String unavailable = selenium.getText(unavailableEmailPopUp);
//        return unavailable;
//    }

    /**
     * Check Warning Pop up is displayed
     *
     * @return status true / false
     */
    public boolean isWarningPopUpDispplayed() {
        return unavailableEmailPopUp.isDisplayed();
    }

    /**
     * Click on Submit Sign In button
     *
     * @throws InterruptedException
     */
    public void submitSignIn() throws InterruptedException {
        selenium.clickOn(submitSignInButton);
    }

    /**
     * Click on Sign Out button
     *
     * @throws InterruptedException
     */
    public void signOut() throws InterruptedException {
        selenium.clickOn(sideBarButton);
        selenium.clickOn(signOutButton);
    }
}
