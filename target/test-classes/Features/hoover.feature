Feature:
  Background:
    Given user is on home page

    @hoover
    Scenario: user should be able to perform hoover action
      When user hoover over "Computers" category link and click on subcategory link "Notebooks"
      Then user should able to navigate to subcategory page "notebooks" successfully