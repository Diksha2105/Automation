Feature: Search Functionality

@regression 
@Sanity
Scenario Outline: Search Job By Corporate title
  Given Careers website should open and navigate to Job search page
  Then Select Corporate title"<Input1>"
  Then Verify result by clicking on search button "<Input2>"

Examples:
  | Input1    | Input2 |
  |  Analyst  | Analyst| 
 
