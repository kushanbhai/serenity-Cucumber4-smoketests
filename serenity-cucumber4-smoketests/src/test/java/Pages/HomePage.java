package Pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
OrangeHRMHomePage homepage;
	@Step
	public void openapplication() {
		homepage.open();
	}
	@Step
	public void enterusername() {
		homepage.enterusername();
	}
	@Step
	public void enterpassword() {
		homepage.enterpassword();
	}
	@Step
	public void clickonLoginButton() {
		homepage.clickLoginbtn();
	}
}
