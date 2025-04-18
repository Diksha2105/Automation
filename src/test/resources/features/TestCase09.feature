Feature: Search Functionality

@regression 

Scenario Outline: Search Job with special characters
  Given Job search form should open
  Then Provide special characters in Input fields "<Input1>" and "<Input2>" and "<Input3>" and "<Input4>" and "<Input5>"
  Then By clicking on search button relevant result should display

Examples:
  | Input1     | Input2 | Input3  | Input4     | Input5  |
  | @@@@       | &&&&   | !!!!    | ***&       | @@**&^  |
  
