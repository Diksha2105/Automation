Feature: Search Functionality

@regression 
@Sanity
Scenario Outline: Search Job By State and City
  Given website should open and navigate to search page
  Then Select State"<Input1>" and City"<Input2>"
  Then Verify by clicking on search button "<Input3>"

Examples:
  | Input1            | Input2  | Input3 |
  | Maharashtra       |  Pune   | Pune |
 
