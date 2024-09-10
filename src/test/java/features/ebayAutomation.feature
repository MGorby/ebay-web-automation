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

    @taskTwo
    Scenario Outline: Access a Product via Search
      Given user navigates to "https://www.ebay.com/"
      When user type "<keyword>" on searchbox
      And user change the search category as "Computers/Tablets & Networking"
      And user click on search button
      And user see that the name of the first result item contains "<keyword>"
      Examples:
      | keyword    |
      | Asus       |
      | Macbook    |