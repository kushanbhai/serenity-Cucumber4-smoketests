package starter.stepdefinitions;

import Pages.DashBoard;
import Pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogintoApplication {
	@Steps
	HomePage home;

	@Steps
	DashBoard dash;

	@Given("user is on Home Page")
	public void user_is_on_Home_Page() {
		home.openapplication();
	}

	@When("user enter Admin as data")
	public void user_enter_Admin_as_data() {
		home.enterusername();
	}

	@When("user enter admin{int} as password")
	public void user_enter_admin_as_password(Integer int1) {
		home.enterpassword();
		home.clickonLoginButton();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		dash.verifyAdmin();
	}

}
