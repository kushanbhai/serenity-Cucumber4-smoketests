package Pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject {

	public void enterusername() {
		$(By.id("txtUsername")).type("Admin");
	}

	public void enterpassword() {
		$(By.id("txtPassword")).type("admin123");
	}

	public void clickLoginbtn() {
		$(By.id("btnLogin")).click();
	}
}
