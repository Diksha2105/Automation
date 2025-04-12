Feature: Search Functionality

@regression 
@Smoke
Scenario Outline: Verify Search Functionality
  Given user should navigate to careers website
  Then user should navigate to search and interact with search input fields "<Input1>" and "<Input2>" and "<Input3>" and "<Input4>" and "<Input5>"
  Then Validate the result
  Then Submit Search form.

Examples:
  | Input1     | Input2 | Input3  | Input4     | Input5  |
  | Chairman   | India  | Analyst | Full Time  | RO1234  |
  | @@@        | ##     | %$#     | @#         | @#      |



