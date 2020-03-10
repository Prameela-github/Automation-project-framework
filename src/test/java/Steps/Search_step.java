package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mainjava.Search_java;

public class Search_step {
	Search_java s=new Search_java();
	@Given("^the url is launched$")
	public void the_url_is_launched() {
		s.url();
		s.loginpage();
	}

	@When("^the url is launched search for the product$")
	public void the_url_is_launched_search_for_the_product() {
		s.typeinsearch();
	}

	@Then("^press enter key$")
	public void press_enter_key() {
		s.clicking();
		s.close();
	}

}
