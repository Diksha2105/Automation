package com.testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = "src/test/resources/features", // Path to your feature files
    glue = "com.stepdefinitions", 
    tags = "@regression and @Smoke" ,
    plugin = {"pretty", "html:target/cucumber-reports-html.html" , "json:target/cucumber-json/cucumber.json"},
    objectFactory = com.config.CustomObjectFactory.class
)
public class testRunner extends AbstractTestNGCucumberTests{




}