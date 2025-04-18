package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.BaseClass;

public class SearchPage {
private WebDriver driver;
private WebDriverWait wait;

public SearchPage (WebDriver driver) {
	this.driver = driver;
	this.wait = new WebDriverWait(driver , Duration.ofSeconds(50));
	
}
private By Professionals = By.xpath("//li[@id = 'professionals_top']") ;
private By SearchRole = By.xpath("//a[@title ='Search Roles']");
private By divisioncategory = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs1__combobox']");
private By state = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs3__combobox']");
private By CountryField = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs2__combobox']");
private By corporateTitle = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs3__combobox']");
private By city = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs4__combobox']");
private By whatisyourAvailability = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs4__combobox']");
private By JobID = By.xpath("//input[@id ='jobIdSearch']");
private By SearchButton = By.xpath("//button[contains (text(), 'Search')]");
private By reset = By.xpath("//a[contains (text(), ' Reset ')]");
private By result = By.xpath("//*[@id=\"job-module\"]//child::div[contains (text(), 'Results')]");
private By wantToWork = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs6__combobox']");
private By roleKeyword = By.xpath("//input[@id ='roleKeyword']");
private By jobidsearchkey = By.xpath("//input[@id ='jobIdSearch']");
private By VerifyResult = By.xpath("//div[@class = 'detail-info']/div[1]");
private By SearchResultKyeword = By.xpath("//div[@class ='detail-entry']/h2");
private By Locationkey = By.xpath("//div[@class ='detail-entry']/div");
private By SearchKey = By.xpath("//div[@class = 'keyword-container professional']/a[contains (text() ,' Search ')]");
public void Professionals() throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Professionals));
	
	element.click();
	Thread.sleep(2000);
	
}
public void SearchRole() throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SearchRole));
	element.click();
	Thread.sleep(2000);
	
}	
public void StateField(String statefield) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(state));
	
	element.sendKeys(statefield + Keys.RETURN);
	Thread.sleep(2000);
	
}

public void cityField(String cityfield) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(city));
	
	element.sendKeys(cityfield + Keys.RETURN);
	Thread.sleep(2000);
	
}

public void wantToWorkField(String work) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wantToWork));
	
	element.sendKeys(work + Keys.RETURN);
	Thread.sleep(1000);
	
}
public void KeywordInput1(String Keywordrole) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(roleKeyword));
	
	element.sendKeys(Keywordrole + Keys.RETURN);
	Thread.sleep(1000);
	
}
public void KeywordInput2(String KeyworJob) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(jobidsearchkey));
	
	element.sendKeys(KeyworJob + Keys.RETURN);
	Thread.sleep(1000);
	
}
public void Clicksearch() throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SearchKey));
	
	element.click();
	Thread.sleep(1000);
	
}
public void divisioncategory(String category) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(divisioncategory));

	element.sendKeys(category + Keys.RETURN);
	
	Thread.sleep(1000);
	
	
}
public void countryfield(String Country) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CountryField));

	
	element.sendKeys(Country + Keys.RETURN);
	Thread.sleep(1000);
	
	
}
public void CoTitle(String Title) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(corporateTitle));

	
	element.sendKeys(Title + Keys.RETURN);
	Thread.sleep(1000);
	
	
}
public void Availability(String Availability) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(whatisyourAvailability));

	element.sendKeys(Availability + Keys.RETURN);
	Thread.sleep(1000);
	
	
}
public void JobID(String ID) throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(JobID));

	element.sendKeys(ID);
	Thread.sleep(1000);
	
	
}
public void SearchButton() throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SearchButton));

	element.click();
	Thread.sleep(1000);
	
	
}
public void ResetButton() throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(reset));

	element.click();
	Thread.sleep(1000);
	
	
}
public void Result() throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(result));

	String result = element.getText();
	System.out.println("Result is:" + result);
	Assert.assertTrue(result.contains("Result"), "Result word not found!");
	Thread.sleep(1000);
	
	
}
public void VerifyResult(String KeyWord)throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(VerifyResult));
	
	String Result = element.getText();
	System.out.println("Result is:" + Result);
	
	 List<WebElement> searchResults = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchResultKyeword));


	String key = KeyWord; // Keyword to validate
	boolean isKeywordPresent = false;

	for (WebElement result : searchResults) {
	    if (result.getText().contains(key)) {
	        isKeywordPresent = true; // Keyword found
	    }
	}

	// Assert that at least one result contains the keyword
	Assert.assertTrue(isKeywordPresent, "No search result contains the keyword: " + key);
	
	
}
public void VerifyResultLocation(String KeyWord)throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(VerifyResult));
	
	String Result = element.getText();
	System.out.println("Result is:" + Result);
	
	 List<WebElement> searchResults = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locationkey));


	String key = KeyWord; // Keyword to validate
	boolean isKeywordPresent = false;

	for (WebElement result : searchResults) {
	    if (result.getText().contains(key)) {
	        isKeywordPresent = true; // Keyword found
	    }
	}

	// Assert that at least one result contains the keyword
	Assert.assertTrue(isKeywordPresent, "No search result contains the keyword: " + key);
	
	
}
	
}


