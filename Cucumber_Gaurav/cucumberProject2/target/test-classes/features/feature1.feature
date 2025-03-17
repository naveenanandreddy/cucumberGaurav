Feature: ISO Outard Message Generation
  

  @sanity1
  Scenario: Generate a valid ISO message
   Given I have a valid ISO message template
    When I populate the ISO message with required data from sheet "Data_RTGS_REGRESSION 4.xlsx" and subSheet "TestCases" and rowNumber <rowNumber>
    Then the generated ISO message should be valid
    And the ISO message should be posted to the API queue successfully 
   
   Examples:
   | rowNumber	|
   |	1					|


