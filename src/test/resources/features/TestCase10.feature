Feature: Search Functionality

@regression 

Scenario Outline: Verify Keyword Search
  Given Navigate to Keyword search form
  Then Select RoleTitle"<Input1>" and KeyWord"<Input2>"
  Then Validate result by clicking on search button"<Input3>"

Examples:
  | Input1         | Input2  | Input3 |
  | Engineer       |  Java   | Engineer |
 
