Feature: Search Functionality

@regression 
@Sanity
Scenario Outline: Verify Search Functionality with not providing Country 
  Given Job Search page 
  Then Provide input for Division category, corporate title,availability and JobID "<Input1>" and "<Input3>" and "<Input4>" and "<Input5>"
  Then Click on search button
  Then Search result should display for all country "<Input6>"

Examples:
  | Input1            | Input3  | Input4     | Input5  | Input6  |
  |  Human Resources  |  Analyst | Full Time  | RO1234  | Analyst|
 
