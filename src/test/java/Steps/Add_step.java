package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mainjava.Add_java;

public class Add_step {
Add_java j=new Add_java();
@Given("^the next url is launched$")
public void the_next_url_is_launched() 
{
	j.url();
	j.loginpage();
}

@When("^the url is launched click for the searched product$")
public void the_url_is_launched_click_for_the_searched_product() {
	j.clickproduct();
}

@Then("^add to basket$")
public void add_to_basket() {
	j.clickaddbasket();
	j.close();
}

}
