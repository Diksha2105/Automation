package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.base.BaseClass;
import com.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchFunctionality_Steps7 extends BaseClass{
	private WebDriver driver;
	private SearchPage search;
	
	public SearchFunctionality_Steps7 (WebDriver driver, SearchPage search) {
		this.driver = driver;
		this.search = new SearchPage(driver);
	}
	  @Given("open search page and navigate to Division")
	    public void OpenSearchPage() {
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

	    @Then("select Division Category{string}")
	    public void Select_Division(String Input1)  {
	    	
	    	try {
				search.Professionals();
				
	    	search.divisioncategory(Input1);
	    	
	    	 
	    	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
				Screenshot("SearchFields");
			}
	    }
	

    @Then("result should display for respective Division category by click on search button {string}")
    public void resultDisplay(String Input2){
        
        try {
			search.SearchButton();
			Thread.sleep(2000);
			search.VerifyResult(Input2);
			Thread.sleep(1000);
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Screenshot("Submit");
		}

    }
}
