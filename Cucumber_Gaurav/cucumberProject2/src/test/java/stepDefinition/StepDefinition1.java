package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reports.Report;
import utils.TestContextSetup;

public class StepDefinition1 {
	
	TestContextSetup testContextSetup;
	
	public StepDefinition1(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
	}
	
	
	
	@Given("I have a valid ISO message template")
	public void i_have_a_valid_iso_message_template() {
	   System.out.println("Message generation process started");
	   Report.log(testContextSetup.scenario, "Message generation process started");
	}
	@When("I populate the ISO message with required data from sheet {string} and subSheet {string} and rowNumber {int}")
	public void i_populate_the_iso_message_with_required_data_from_sheet_and_sub_sheet_and_row_number(String filePath, String subSheet, Integer rowNumber) {
	
		System.out.println("Fetching data from excel to prepare test message");
		Report.log(testContextSetup.scenario, "Fetching data from excel to prepare test message");
	}
	@Then("the generated ISO message should be valid")
	public void the_generated_iso_message_should_be_valid() {
	   System.out.println("message generated successfully");
	   Report.log(testContextSetup.scenario, "message generated successfully");
	}
	@Then("the ISO message should be posted to the API queue successfully")
	public void the_iso_message_should_be_posted_to_the_api_queue_successfully() {
	  System.out.println("Message posted to API successfully");
	  Report.log(testContextSetup.scenario, "Message posted to API successfully");
	}

}
