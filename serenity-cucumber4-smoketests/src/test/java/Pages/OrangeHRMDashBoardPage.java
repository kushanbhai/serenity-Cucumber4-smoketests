package Pages;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMDashBoardPage extends PageObject {
	public void VerifyLogin() {
		String currentUrl = getDriver().getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("dashboard"));

	}
}
