Feature: Reset Functionality

@regression
Scenario: Verify Reset Search functionality

Given careers website should open
Then Navigate to search form "Chairman" and "India" and "Analyst" and "Full Time" and "RO1234"
Then check result
Then Click on Reset Button