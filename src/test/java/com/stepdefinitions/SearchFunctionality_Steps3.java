package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.base.BaseClass;
import com.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchFunctionality_Steps3 extends BaseClass{
	private WebDriver driver;
	private SearchPage search;
	
	public SearchFunctionality_Steps3 (WebDriver driver, SearchPage search) {
		this.driver = driver;
		this.search = new SearchPage(driver);
	}
	  @Given("search form should open")
	    public void searchForm() {
	    	try {
	        System.out.println("Navigating to careers website...");
	        String actualtitle = driver.getTitle();
	        System.out.println("Actual Title : " + " " + actualtitle);
	        String expectedTitle = "Home – Deutsche Bank Careers";
	        Assert.assertEquals(actualtitle, expectedTitle, "Title Verification failed");
	        
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	
	    		Screenshot("searchPage");
	    	}
	    	

	        
	    }

	    @Then("provide invalid input {string} and {string} and {string} and {string} and {string}")
	    public void provideInvalidInput(String Input1, String Input2 , String Input3 , String Input4 , String Input5)  {
	    	
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
			
				Screenshot("SearchFields");
			}
	    

	       
	    }
	

    @Then("click on submit button form should submit by getting correct error message")
    public void ClickonSubmitform(){
        
        try {
			search.SearchButton();; 
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Screenshot("Submit");
		}

    }

}
