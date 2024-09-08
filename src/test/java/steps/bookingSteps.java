package steps;

import io.cucumber.java.en.*;
import pagesObject.BookingPO;
import tests.TestBase;
import utility.SeleniumHelpers;

import java.text.ParseException;

public class bookingSteps extends TestBase {

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private BookingPO booking = new BookingPO(driver);

    @Given("user navigates to {string}")
    public void userNavigatesToMamikosHomepage(String url) {
        selenium.navigateToPage(url);
    }

    @When("user clicks on Enter button")
    public void userClicksOnEnterButton() throws InterruptedException {
        booking.clickOnEnterButton();
    }

    @And("user login as tenant")
    public void userLoginAsTenant() throws InterruptedException {
        booking.clickOnLoginTenant();
        booking.clickOnLoginFB();
    }

    @And("user fill username {string}")
    public void userFillUsername(String word) {
        booking.enterUsername(word);
    }

    @And("user fill password {string}")
    public void userFillPassword(String word) throws InterruptedException {
        booking.enterPassword(word);
        booking.clickONLoginButton();
    }

    @When("user clicks search bar")
    public void userClicksSearchBar() throws InterruptedException {
        booking.clickSearchBar();
    }

    @And("user search for random keyword {string}")
    public void userSearchForRandomKeyword(String word) {
        booking.enterAddress(word);
    }

    @Then("user click the search result based on area")
    public void userClickTheSearchResultBasedOnArea() throws InterruptedException {
        booking.clickTheFirstResultBasedOnArea();
        booking.dissmissFTUE();
    }

    @And("user choose one of the kost")
    public void userChooseOneOfTheKost() throws InterruptedException {
        booking.chooseKos();
    }

    @And("user dissmiss FTUE on detail kos")
    public void userDissmissFTUEOnDetailKos() throws InterruptedException {
        selenium.switchToWindow(2);
        booking.dismissFTUEScreen2();
    }

    @And("user clicks on Booking button on Kost details page")
    public void userClicksOnBookingButtonOnKostDetailsPage() throws InterruptedException, ParseException {
        String tomorrow = selenium.updateTime("yyyy MMM dd", selenium.getTimeStamp("yyy MMM dd"), "d", 1, 0, 0, 0);
        booking.scrollToKostName();
        booking.selectDateForStartBoarding(tomorrow);
        booking.selectRentType("Per bulan");
        booking.clickOnBookingButton();
    }

    @And("user fills out Rent Duration equals to {int} Bulan, and clicks on Next button")
    public void userFillsOutRentDurationEqualsToBulanAndClicksOnNextButton(int arg0) throws InterruptedException, ParseException  {
        for (int i = 1; i < 4; i++) {
            booking.increaseRateDuration();
        }
        booking.clickOnNextButton();
    }

    @And("user selects T&C checkbox and clicks on Book button")
    public void userSelectsTCCheckboxAndClicksOnBookButton() throws InterruptedException {
        booking.clickOnTermsAndConditionCheckBox();
        booking.clickOnSubmitButton();
        booking.waitUntilButtonChatSuccessBookingAppear();
    }

    @And("user click Chat Pemilik Kos")
    public void userClickChatPemilikKos() throws InterruptedException {
        booking.clickOnChatPemilikKos();
    }

    @And("user click close chat box")
    public void userClickCloseChatBox() throws InterruptedException {
        booking.clickCloseOnChatBox();
    }

    @Then("user cancel booking with reason {string}")
    public void userCancelBookingWithReason(String reason) throws InterruptedException {
        booking.cancelBookingWithReason(reason);
    }

    @And("user activated booking langsung filter")
    public void userActivatedBookingLangsungFilter() throws InterruptedException {
        booking.activatedBBKFilter();
        selenium.hardWait(5);
    }

    @And("user set filter Akses 24 jam")
    public void userSetFilterAksesJam() throws InterruptedException {
        booking.set24JamFilter();
        selenium.hardWait(5);
    }


}
