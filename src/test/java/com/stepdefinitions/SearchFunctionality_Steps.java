package com.stepdefinitions;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.base.BaseClass;
import com.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchFunctionality_Steps extends BaseClass {
	
	private WebDriver driver;
	private SearchPage search;
	
	public SearchFunctionality_Steps (WebDriver driver, SearchPage search) {
		this.driver = driver;
		this.search = new SearchPage(driver);
	}

    @Given("user should navigate to careers website")
    public void usernavigateToCareersWebsite() {
    	try {
        System.out.println("Navigating to careers website...");
        String actualtitle = driver.getTitle();
        System.out.println("Actual Title : " + " " + actualtitle);
        String expectedTitle = "Home – Deutsche Bank Careers";
        Assert.assertEquals(actualtitle, expectedTitle, "Title Verification failed");
    	}catch(Exception e) {
    		e.printStackTrace();
    		Screenshot("Navigatewebsite");
    	}
        
    }

    @Then("user should navigate to search and interact with search input fields {string} and {string} and {string} and {string} and {string}")
    public void user_navigateToSearchFields(String Input1, String Input2 , String Input3 , String Input4 , String Input5)  {
    	
    	try {
			search.Professionals();
		
    	search.divisioncategory(Input1);
    	search.countryfield(Input2);
    	search.CoTitle(Input3);
    	search.Availability(Input4);
    	search.JobID(Input5);
    	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

       
    }

    @Then("Submit Search form.")
    public void submitSearchForm(){
        System.out.println("Submitting the search form...");
        try {
			search.SearchButton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Screenshot("Navigatewebsite");
		}
      
    }

    @Then("Validate the result")
    public void validateSearchResults() {
     
        try {
        	search.Result();
        } catch (InterruptedException e) {
		
			e.printStackTrace();
			Screenshot("Navigatewebsite");
		}
    }
}
