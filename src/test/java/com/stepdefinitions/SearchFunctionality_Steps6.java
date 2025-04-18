package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.base.BaseClass;
import com.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchFunctionality_Steps6 extends BaseClass{
	private WebDriver driver;
	private SearchPage search;
	
	public SearchFunctionality_Steps6 (WebDriver driver, SearchPage search) {
		this.driver = driver;
		this.search = new SearchPage(driver);
	}
	  @Given("Careers website should open and navigate to Job search page")
	    public void CareersWebsite() {
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

	    @Then("Select Corporate title{string}")
	    public void Select_Corporate_Title(String Input1)  {
	    	
	    	try {
				search.Professionals();
				
	    	search.CoTitle(Input1);
	    	
	    	 
	    	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
				Screenshot("SearchFields");
			}
	    

	       
	    }


    @Then("Verify result by clicking on search button {string}")
    public void VerifyResult(String Input2){
        
        try {
        	
			search.SearchButton(); 
			Thread.sleep(2000);
			search.VerifyResult(Input2);
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Screenshot("Submit");
		}

    }
}
