package businesslogics;

import org.openqa.selenium.support.PageFactory;

import pages.SignupPopupBox;
import testbase.BaseClass;
import testutils.ExcelUtils;
import testutils.TestActions;

public class SignupPopup extends BaseClass{

	TestActions browserActions = new TestActions();
	ExcelUtils exceldata = new ExcelUtils();

	public void signupPopup() {

		SignupPopupBox signupPopup = PageFactory.initElements(driver, SignupPopupBox.class);

		if(browserActions.verifyElementPresence(signupPopup.signupPopupBox) == true) {
			browserActions.clickElement(signupPopup.signupPopupCloseButton);
		}
	}

}
