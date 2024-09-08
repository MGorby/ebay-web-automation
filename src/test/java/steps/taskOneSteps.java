package steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pagesObject.TaskOnePO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class taskOneSteps extends TestBase{
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private TaskOnePO task1 = new TaskOnePO(driver);

    @When("user click on Sign in button")
    public void userClickOnSignInButton() throws InterruptedException {
        task1.clickSignIn();
    }

    @And("user click on Register button")
    public void userClickOnRegisterButton() throws InterruptedException {
        task1.clickSignUp();
    }

    @And("user fill name {string}")
    public void userFillName(String name) {
        task1.enterYourName(name);
    }

    @And("user fill email {string}")
    public void userFillEmail(String mail) {
        task1.enterEmail(mail);
    }

    @And("user fill amazon password {string}")
    public void userFillAmazonPassword(String pass) {
        task1.enterPassword(pass);
    }

    @And("user fill password confirmation {string}")
    public void userFillPasswordConfirmation(String pass2) {
        task1.enterPasswordCheck(pass2);
    }

    @When("user clicks create account")
    public void userClicksCreateAccount() throws InterruptedException {
        task1.clickCreateAcc();
    }

    @Then("display missmatch password warning {string}")
    public void displayMissmatchPasswordWarning(String warning) {
        Assert.assertEquals(task1.getMissMatchPasswordPopUpText(), warning, "Missmatch Password Pop Up is not equals");
    }

    @Then("display registered email warning {string}")
    public void displayRegisteredEmailWarning(String registered) {
        Assert.assertEquals(task1.getRegisteredEmailPopUpText(), registered, "Registered Email Warning is not equals");
    }

    @And("user click on Continue button")
    public void userClickOnContinueButton() throws InterruptedException {
        task1.clickContinue();
    }

    @When("user submit Sign-In")
    public void userSubmitSignIn() throws InterruptedException {
        task1.submitSignIn();
    }

    @Then("display warning pop up")
    public void displayWarningPopUp() {
        Assert.assertTrue(task1.isWarningPopUpDispplayed(), "Warning Pop Up is not displayed");
    }

    @Then("user signing out")
    public void userSigningOut() throws InterruptedException {
        task1.signOut();
    }
}