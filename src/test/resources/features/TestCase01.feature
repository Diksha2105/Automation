Feature: Search Functionality

@regression 
@sanity
Scenario: Verify Search Functionality by giving valid input data

Given user should navigate to careers website
Then user should navigate to search and interact with search input fields "Chairman" and "India" and "Analyst" and "Full Time" and "RO1234"
Then Validate the result
Then Submit Search form.

@regression
@sanity
Scenario: Verify Search Functionality by giving Invalid input data

Given user should navigate to careers website
Then user should navigate to search and interact with search input fields "@@@" and "##" and "%$#" and "@#" and "@#"
Then Validate the result
Then Submit Search form.

@regression
@sanity
Scenario: Verify Search Functionality by not providing data in Country field

Given user should navigate to careers website
Then user should navigate to search and interact with search input fields "Chairman" and "" and "Analyst" and "Full Time" and "RO1234"
Then Validate the result
Then Submit Search form.

@regression
Scenario: Verify Search Functionality by not providing data 

Given user should navigate to careers website
Then user should navigate to search and interact with search input fields "" and "" and "" and "" and ""
Then Validate the result
Then Submit Search form.

@regression
Scenario: Verify Search Functionality by providing invalid JOB ID

Given user should navigate to careers website
Then user should navigate to search and interact with search input fields "Chairman" and "India" and "Analyst" and "Full Time" and "RO1234"
Then Validate the result
Then Submit Search form.

