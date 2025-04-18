Feature: Search Functionality

@regression 
@Sanity
Scenario Outline: Search Job By Division Category
  Given open search page and navigate to Division
  Then select Division Category"<Input1>"
  Then result should display for respective Division category by click on search button"<Input2>"

Examples:
  | Input1           | Input2 |
  | Human Resources  |  Human Resources |
 
