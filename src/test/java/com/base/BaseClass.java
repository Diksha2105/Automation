package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Paths;
import java.util.Properties;

public class BaseClass {
public static WebDriver driver;

private static Properties properties;


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
		String directoryPath = "Demo/target";
		Files.createDirectories(Paths.get(directoryPath));
		String filePath = directoryPath + "/" +scenarioName + ".png";
		Files.write(Paths.get(filePath), screenshot);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}



    // Load properties file
    public static void loadProperties() {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties file.");
        }
    }

    // Get property value by key
    public static String getProperty(String key) {
        if (properties == null) {
            loadProperties(); // Load properties if not already loaded
        }
        return properties.getProperty(key);
    }
}

