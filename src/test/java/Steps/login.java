package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mainjava.Loginpage;

public class login {
	Loginpage a = new Loginpage();
	@Given("^the user launched the browser$")
	public void the_user_launched_the_browser() {
		a.url();
	}

	@When("^the user opened the automation practice homepage$")
	public void the_user_opened_the_automation_practice_homepage() {
		a.loginpage();
		
	}

	@Then("^the user click my account$")
	public void the_user_click_my_account() {
		a.MyAccount();
	}

	@Then("^the user enter email and password$")
	public void the_user_enter_email_and_password() {
		a.logindetails();
	}

	@Then("^the user click login button$")
	public void the_user_click_login_button() {
		a.submit();
		a.close();
	}


}
