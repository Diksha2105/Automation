Feature: Reset Functionality

@regression
Scenario: Verify Reset Search functionality

Given careers website should open
Then Navigate to search form "<Input1>" and "<Input2>" and "<Input3>" and "<Input4>" and "<Input5>"
Then check result
Then Click on Reset Button

Examples:
  | Input1     | Input2 | Input3  | Input4     | Input5  |
  | Chairman   | India  | Analyst | Full Time  | RO1234  |
  | @@@        | ##     | %$#     | @#         | @#      |