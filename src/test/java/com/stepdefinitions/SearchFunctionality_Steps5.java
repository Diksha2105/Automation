package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.base.BaseClass;
import com.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchFunctionality_Steps5 extends BaseClass {
	private WebDriver driver;
	private SearchPage search;
	
	public SearchFunctionality_Steps5 (WebDriver driver, SearchPage search) {
		this.driver = driver;
		this.search = new SearchPage(driver);
	}
	  @Given("Job Search page")
	    public void JobSearchPage() {
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

	    @Then("Provide input for Division category, corporate title,availability and JobID {string} and {string} and {string} and {string}")
	    public void provideInput(String Input1, String Input2 , String Input3 , String Input4 )  {
	    	
	    	try {
				search.Professionals();
			
	    	search.divisioncategory(Input1);
	    	
	    	search.CoTitle(Input2);
	    	search.Availability(Input3);
	    	search.JobID(Input4);
	    	 
	    	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
				Screenshot("SearchFields");
			}
	    

	       
	    }
	

    @Then("Click on search button")
    public void ClickSearchButton(){
        
        try {
			search.ResetButton(); 
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Screenshot("Submit");
		}

    }
    @Then("Search result should display for all country {string}")
    public void SearchResultshoulddisplay(String Input6) {
        System.out.println("Validating search results...");
        try {
			search.VerifyResult(Input6);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Screenshot("Result3");
		}
        
    }

}
