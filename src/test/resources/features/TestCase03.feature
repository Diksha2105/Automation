Feature: Search Functionality

@regression 
@Smoke
Scenario Outline: Verify Search Functionality with Invalid Input with multiple filters
  Given search form should open
  Then provide invalid input "<Input1>" and "<Input2>" and "<Input3>" and "<Input4>" and "<Input5>"
  Then click on submit button form should submit by getting correct error message 

Examples:
  | Input1     | Input2 | Input3  | Input4     | Input5  |
  | Test       |  vvNew | Nurce   | New        | 3806    |
 
