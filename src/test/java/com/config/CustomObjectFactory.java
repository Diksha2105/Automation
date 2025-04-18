package com.config;

import io.cucumber.core.backend.ObjectFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.base.BaseClass;
import com.pages.SearchPage;
import com.stepdefinitions.SearchFunctionality_Steps;
import com.stepdefinitions.SearchFunctionality_Steps10;
import com.stepdefinitions.SearchFunctionality_Steps2;
import com.stepdefinitions.SearchFunctionality_Steps3;
import com.stepdefinitions.SearchFunctionality_Steps4;
import com.stepdefinitions.SearchFunctionality_Steps5;
import com.stepdefinitions.SearchFunctionality_Steps6;
import com.stepdefinitions.SearchFunctionality_Steps7;
import com.stepdefinitions.SearchFunctionality_Steps8;
import com.stepdefinitions.SearchFunctionality_Steps9;

public class CustomObjectFactory implements ObjectFactory {
	private WebDriver driver;
	private SearchPage search;

    private final List<Class<?>> classes = new ArrayList<>();

    @Override
    public void start() {
    	 try {
    		 String browser = BaseClass.getProperty("browser");
    		 String URL = BaseClass.getProperty("url");

    		  if (browser == null || browser.equalsIgnoreCase("chrome")) {
    	            System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
    	            ChromeOptions options = new ChromeOptions();
    	            options.addArguments("--remote-allow-origins=*");
    	            options.addArguments("--start-maximized");
    	            driver = new ChromeDriver(options);
    	        } else if (browser.equalsIgnoreCase("firefox")) {
    	            System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
    	            driver = new FirefoxDriver();
    	        } else if (browser.equalsIgnoreCase("edge")) {
    	            System.setProperty("webdriver.edge.driver", "Drivers\\msedgedriver.exe");
    	            driver = new EdgeDriver();
    	        } else {
    	            throw new IllegalArgumentException("Unsupported browser: " + browser);
    	        }


    // Open a website in Chrome
    driver.get(URL);
    Thread.sleep(1000);
 
    Robot rb = new Robot();
    rb.mouseMove(900,650);
    rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    Thread.sleep(2000);
    
   
  
} catch (AWTException | InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
    
    
    }

    @Override
    public void stop() {
    if(driver != null) {
    	driver.quit();
    }
    }

    @Override
    public <T> T getInstance(Class<T> glueClass) {
        try {
        	if (glueClass == WebDriver.class) {
        		return glueClass.cast(driver);
        	}
        	if (glueClass == SearchFunctionality_Steps.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	if (glueClass == SearchFunctionality_Steps2.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	if (glueClass == SearchFunctionality_Steps3.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	if (glueClass == SearchFunctionality_Steps4.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	if (glueClass == SearchFunctionality_Steps5.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	if (glueClass == SearchFunctionality_Steps6.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	if (glueClass == SearchFunctionality_Steps7.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	if (glueClass == SearchFunctionality_Steps8.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	if (glueClass == SearchFunctionality_Steps9.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	if (glueClass == SearchFunctionality_Steps10.class) {
        		return glueClass.getDeclaredConstructor(WebDriver.class , SearchPage.class).newInstance(driver, search);
        	}
        	return glueClass.getDeclaredConstructor().newInstance();
        }catch (Exception e) {
        	throw new RuntimeException(e);
        }
    }

    @Override
    public boolean addClass(Class<?> glueClass) {
       return classes.add(glueClass);
    }

   
}