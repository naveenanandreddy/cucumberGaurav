package runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import reports.Report;

@CucumberOptions(
		 features = "src/test/java/features",  // Path to feature files
		    glue = {"cucumberOptions","stepDefinition"},                  // Package containing step definitions
		    plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}, // Report generation
		    monochrome = true
	)
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	
	@BeforeSuite
	public void beforeSetup() {
		
		System.out.println("****************Test Started******************************");
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		Report.generateReport();
		
	}

}
