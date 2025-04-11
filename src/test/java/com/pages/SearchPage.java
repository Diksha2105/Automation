package com.pages;

import java.time.Duration;

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
	this.wait = new WebDriverWait(driver , Duration.ofSeconds(30));
	
}
private By Professionals = By.xpath("//li[@id = 'professionals_top']") ;
private By divisioncategory = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs1__combobox']");

private By CountryField = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs2__combobox']");
private By corporateTitle = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs3__combobox']");
private By whatisyourAvailability = By.xpath("//div[@class='v-select vs--single vs--searchable']//child::input[@aria-labelledby = 'vs4__combobox']");
private By JobID = By.xpath("//input[@id ='jobIdSearch']");
private By SearchButton = By.xpath("//button[contains (text(), 'Search')]");
private By reset = By.xpath("//a[contains (text(), ' Reset ')]");
private By result = By.xpath("//*[@id=\"job-module\"]//child::div[contains (text(), 'Results')]");

public void Professionals() throws InterruptedException {
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Professionals));
	
	element.click();
	Thread.sleep(2000);
	
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

	
}


