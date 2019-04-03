package StepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksstepDefination {
	
	@Before
	public void setUp(){
		System.out.println("luanch browser");
	}
	
	@After
	public void tearDown(){
		System.out.println("close browser");
	}

	
	@Given("^user is on deal page$")
	public void user_is_on_deal_page() {
		
	}

	@When("^user fills the deals form$")
	public void user_fills_the_deals_form() {
		
	}

	@Then("^deal is created$")
	public void deal_is_created() {
		System.out.println("created deal");
		
	}

	@Given("^user is on contact page$")
	public void user_is_on_contact_page(){
		
	}

	@When("^user fills the contact form$")
	public void user_fills_the_contact_form(){
		
	}

	@Then("^contact is created$")
	public void contact_is_created() {
		System.out.println("created contact");
		
	}


}
