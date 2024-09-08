@automation
  Feature: Sign Up & Sign In features

  @signUp
  Scenario: Access a Product via category after applying multiple filters
    Given user navigates to "https://www.ebay.com/"
    When user go to Cell Phones & Accessories page
    And user click on Register button
    And user fill name "Gorby"
    And user fill email "gorbytabah@gmail.com"
    And user fill amazon password "qwerty123"
    And user fill password confirmation "qwerty"
    When user clicks create account
    Then display missmatch password warning "Passwords must match"

  Scenario: User Sign up with registered email
    Given user navigates to "https://www.amazon.com/"
    When user click on Sign in button
    And user click on Register button
    And user fill name "Gorby"
    And user fill email "fakhrezatabah@gmail.com"
    And user fill amazon password "qwerty123"
    And user fill password confirmation "qwerty123"
    When user clicks create account
    Then display registered email warning "Email address already in use"

  @signIn
  Scenario: User Sign in with wrong email format
    Given user navigates to "https://www.amazon.com/"
    When user click on Sign in button
    And user fill email "fakhrezatabah"
    And user click on Continue button
    Then display warning pop up

  Scenario: User Sign in with valid email and password
    Given user navigates to "https://www.amazon.com/"
    When user click on Sign in button
    And user fill email "fakhrezatabah@gmail.com"
    Then user click on Continue button
    And user fill amazon password "qwerty123"
    When user submit Sign-In
    Then user signing out