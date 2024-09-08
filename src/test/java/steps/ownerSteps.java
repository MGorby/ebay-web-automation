package steps;

import io.cucumber.java.en.*;
import pagesObject.OwnerBO;
import tests.TestBase;
import utility.SeleniumHelpers;

import java.text.ParseException;

public class ownerSteps extends TestBase {

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private OwnerBO owner = new OwnerBO(driver);

    @When("user login as owner")
    public void userClicksOnEnterButton() throws InterruptedException {
        owner.clickOnLoginOwner();
    }

    @And("user fill owner number {string}")
    public void userFillOwnerNumber(String word) {
        owner.enterOwnerNumber(word);
    }

    @And("user fill owner password {string}")
    public void userFillOwnerPassword(String word) throws InterruptedException {
        owner.enterOwnerPassword(word);
        owner.clickONOwnerLoginButton();
    }

    @Then("user dissmiss FTUE on owner page")
    public void userDissmissFTUEOnOwnerPage() throws InterruptedException {
        owner.clickOnIUnderstandOnSetAdditionalCostsPopUp();
    }

    @When("user go to add tenant")
    public void userGoToAddTenant() throws InterruptedException {
        owner.scrollToAddTenant();
    }

    @And("user pass the on boarding")
    public void userPassTheOnBoarding() throws InterruptedException {
        owner.passAddTenantInfo();
    }

    @And("user choose method to add tenant")
    public void userChooseMethodToAddTenant() throws InterruptedException {
        owner.chooseAddByOwnerMethod();
    }

    @And("user choose kost list")
    public void userChooseKostList() throws InterruptedException {
        owner.selectKost();
    }

    @Then("user fill tenant phone number {string}")
    public void userFillTenantPhoneNumber(String word) {
        owner.enterTenantNumber(word);
    }

    @And("user choose room for tenant and proceed")
    public void userChooseRoomForTenantAndProceed() throws InterruptedException {
        owner.selectRoom();
    }

    @Then("user fill tenant name {string}")
    public void userFillTenantName(String word) {
        owner.enterTenantName(word);
    }

    @And("choose tenant gender and proceed")
    public void chooseTenantGenderAndProceed() throws InterruptedException {
        owner.selectGender();
    }

    @And("user choose rent count and duration")
    public void userChooseRentCountAndDuration() throws InterruptedException {
        owner.selectCountDuration();
    }

    @And("user choose due date and proceed")
    public void userChooseDueDateAndProceed() throws InterruptedException, ParseException {
        owner.scrollToDatePicker();
        owner.selectDateForDeadlinePay();
        owner.clickNextStep2();
    }

    @Then("user input late charge {string}")
    public void userInputLateCharge(String word) {
        owner.enterLateCharge(word);
    }

    @And("user input deadline charge {string}")
    public void userInputDeadlineCharge(String word) {
        owner.enterDeadlineCharge(word);
    }

    @And("user fill additional price {string}")
    public void userFillAdditionalPrice(String word) {
        owner.enterFirstAdditionalPrice(word);
    }

    @And("user fill first other price {string}")
    public void userFillFirstOtherPrice(String word) {
        owner.enterFirstAdditionalPriceCharge(word);
    }

    @Then("user add the additional price")
    public void userAddTheAdditionalPrice() throws InterruptedException {
        owner.clicAddOnOtherCharge();
    }

    @And("user fill second additional price {string}")
    public void userFillSecondAdditionalPrice(String word) {
        owner.enterSecondAdditionalPrice(word);
    }

    @And("user fill second other price {string} and proceed")
    public void userFillSecondOtherPriceAndProceed(String word) throws InterruptedException {
        owner.enterSecondAdditionalPriceCharge(word);
    }

    @And("user verify the data")
    public void userVerifyTheData() throws InterruptedException {
        owner.scrollToTotalPrice();
    }

    @Then("user click on save button")
    public void userClickOnSaveButton() throws InterruptedException {
        owner.clicSave();
    }

    @And("user click on See Tenant Detail")
    public void userClickOnSeeTenantDetail() throws InterruptedException {
        owner.clickSeeTenantDetail();
    }

    @And("user click stop the contract")
    public void userClickStopTheContract() throws InterruptedException {
        owner.endContract();
    }

    @And("user select contract end date")
    public void userSelectContractEndDate() throws InterruptedException {
        owner.selectDateForEndContract();
        owner.chooseEndContractDate();
    }

    @Then("user confirm to stop the contract")
    public void userConfirmToStopTheContract() throws InterruptedException {
        owner.confirmEndContract();
    }
}
