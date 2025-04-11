package com.testrunner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.config.CustomObjectFactory;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
    features = "src/test/resources/features/", // Path to your feature files
    glue = "com.stepdefinitions",                // Package containing step definitions
    plugin = {"pretty", "html:target/cucumber-reports-html.html" , "json:target/cucumber-json/cucumber.json"},
    objectFactory = com.config.CustomObjectFactory.class
)
public class testRunner extends AbstractTestNGCucumberTests {


}