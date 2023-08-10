package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/resources",
glue= {"stepDefinitions"},monochrome=true,
tags="@smoke",

plugin= {"pretty","html:target/HtmlReports/index.html",
		"json:target/CucumberReports/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}



		



)


public class TestRunner {

}
