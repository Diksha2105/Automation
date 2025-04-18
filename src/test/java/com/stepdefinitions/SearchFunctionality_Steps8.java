package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.base.BaseClass;
import com.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchFunctionality_Steps8 extends BaseClass {
	private WebDriver driver;
	private SearchPage search;
	
	public SearchFunctionality_Steps8 (WebDriver driver, SearchPage search) {
		this.driver = driver;
		this.search = new SearchPage(driver);
	}
	  @Given("website should open and navigate to search page")
	    public void websiteOpen() {
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

	    @Then("Select State{string} and City{string}")
	    public void select_Stateand_city(String Input1, String Input2)  {
	    	
	    	try {
				search.Professionals();
				search.SearchRole();
	    	search.StateField(Input1);
	    	search.cityField(Input2);
	    	
	    	 
	    	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
				Screenshot("SearchFields");
			}
	    

	       
	    }
	

    @Then("Verify by clicking on search button {string}")
    public void Verifybyclciking(String Input3){
        
        try {
			search.SearchButton(); 
			Thread.sleep(2000);
			search.VerifyResultLocation(Input3);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Screenshot("Submit");
		}

    }
}
