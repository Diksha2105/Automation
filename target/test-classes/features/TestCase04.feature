Feature: Search Functionality

@regression 
@Sanity
Scenario Outline: Verify Search Functionality with Not providing any input 
  Given navigate to search page
  Then provide empty string as input "<Input1>" and "<Input2>" and "<Input3>" and "<Input4>" and "<Input5>"
  Then apropriate message should display
  Then By Clicking search button form should submit

Examples:
  | Input1     | Input2 | Input3  | Input4     | Input5  |
  |            |        |         |            |         |
 
