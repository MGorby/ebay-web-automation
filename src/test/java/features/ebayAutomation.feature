@automation
  Feature: Search features

  @taskOne
  Scenario: Access a Product via category after applying multiple filters
    Given user navigates to "https://www.ebay.com/"
    When user go to Cell Phones & Smartphones page
    And user open all filter
    And user set New in Condition filter
    And user set min price filter "3,000,000"
    And user set max price filter "4,000,000"
    And user set Item Location filter in Asia
    And user click on apply button
    And user see search result title is "Cell Phones & Smartphones between IDR3,000,000.00 and IDR4,000,000.00"
    And user select the first result
    Then user see the product condition is "New"
    And user see the product locations is contains "China"

#  Scenario: User Sign up with registered email
#    Given user navigates to "https://www.amazon.com/"
#    When user click on Sign in button
#    And user click on Register button
#    And user fill name "Gorby"
#    And user fill email "fakhrezatabah@gmail.com"
#    And user fill amazon password "qwerty123"
#    And user fill password confirmation "qwerty123"
#    When user clicks create account
#    Then display registered email warning "Email address already in use"
#
#  @signIn
#  Scenario: User Sign in with wrong email format
#    Given user navigates to "https://www.amazon.com/"
#    When user click on Sign in button
#    And user fill email "fakhrezatabah"
#    And user click on Continue button
#    Then display warning pop up
#
#  Scenario: User Sign in with valid email and password
#    Given user navigates to "https://www.amazon.com/"
#    When user click on Sign in button
#    And user fill email "fakhrezatabah@gmail.com"
#    Then user click on Continue button
#    And user fill amazon password "qwerty123"
#    When user submit Sign-In
#    Then user signing out