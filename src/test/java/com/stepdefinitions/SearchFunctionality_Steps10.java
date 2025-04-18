package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.base.BaseClass;
import com.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchFunctionality_Steps10 extends BaseClass {
	private WebDriver driver;
	private SearchPage search;
	
	public SearchFunctionality_Steps10 (WebDriver driver, SearchPage search) {
		this.driver = driver;
		this.search = new SearchPage(driver);
	}
	  @Given("Navigate to Job Search page")
	    public void navigateToJobSearch() {
	    	try {
	        System.out.println("Navigate to Keyword search form");
	        String actualtitle = driver.getTitle();
	        System.out.println("Actual Title : " + " " + actualtitle);
	        String expectedTitle = "Home – Deutsche Bank Careers";
	        Assert.assertEquals(actualtitle, expectedTitle, "Title Verification failed");
	        
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	
	    		Screenshot("Navigatewebsite");
	    	}
	    	

	        
	    }

	    @Then("Select RoleTitle {string} and KeyWord {string}")
	    public void SelectRoleTitle(String Input1, String Input2 )  {
	    	
	    	try {
	    		search.Professionals();
	    	
		    	search.divisioncategory(Input1);
		    	search.countryfield(Input2);
		    	
		    	 
	    	 
	    	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
				Screenshot("SearchFields");
			}
	    

	       
	    }
	

    @Then("Validate result by clicking on search button{string}")
    public void ValidateResult(String Input3){
        
        try {
			search.SearchButton(); 
			Thread.sleep(2000);
			search.VerifyResult(Input3);
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Screenshot("Submit");
		}

    }
}
