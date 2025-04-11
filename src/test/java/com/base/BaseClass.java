package com.base;

import java.nio.file.Files;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Paths;

public class BaseClass {
public static WebDriver driver;

public static void scrollintoView(WebElement element) {
	
	try {
		((JavascriptExecutor) driver).executeScript("argument[0].scrollIntoView(true)", element);
		
	}catch (Exception e) {
		System.out.println("Not able to scroll page");
	}
}

public static void dropdownSelection(WebElement element , String value) {
	Select dropdown = new Select(element);
	dropdown.selectByVisibleText(value);
	
}
public static void Screenshot (String Name) {
	if(driver!= null) {
		try {
			System.out.println("Taking screenshot...");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			
			saveScreenshotToFile(screenshot , Name);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}else {
		System.err.println("Screenshot not capture");
	}
}

public static void saveScreenshotToFile(byte[] screenshot, String scenarioName) {
	try {
		String directoryPath = "C://Users//Anushka//Desktop//Diksha//Test Automation//Demo//target";
		Files.createDirectories(Paths.get(directoryPath));
		String filePath = directoryPath + "/" +scenarioName + ".png";
		Files.write(Paths.get(filePath), screenshot);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
