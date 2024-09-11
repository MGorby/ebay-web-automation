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
    And user click on applied filter
    Then user see the condition filter applied is "New"
    And user see the price filter applied is "$3,000,000.00 to $4,000,000.00"
    And user see the item location filter applied is "Asia"

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