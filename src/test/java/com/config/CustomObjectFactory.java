package com.config;

import io.cucumber.core.backend.ObjectFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pages.SearchPage;
import com.stepdefinitions.SearchFunctionality_Steps;
import com.stepdefinitions.SearchFunctionality_Steps2;

public class CustomObjectFactory implements ObjectFactory {
	private WebDriver driver;
	private SearchPage search;

    private final List<Class<?>> classes = new ArrayList<>();

    @Override
    public void start() {
    	 try {
    			
    System.setProperty("webdriver.chrome.driver" , "Drivers\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--start-maximized");
    driver = new ChromeDriver(options);
    // Open a website in Chrome
    driver.get("https://careers.db.com/");
    Thread.sleep(1000);
 
    Robot rb = new Robot();
    rb.mouseMove(900,650);
    rb.mousePress(KeyEvent.BUTTON1_MASK);
    rb.mouseRelease(KeyEvent.BUTTON1_MASK);
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