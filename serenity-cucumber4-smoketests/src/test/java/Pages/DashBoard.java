package Pages;

import net.thucydides.core.annotations.Step;

public class DashBoard {
OrangeHRMDashBoardPage dashboard;
	@Step
	public void verifyAdmin() {
		dashboard.VerifyLogin();
	}
}
