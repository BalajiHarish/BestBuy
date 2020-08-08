package businesslogics;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pages.CreateAccountPage;
import pages.HomePage;
import testbase.BaseClass;
import testutils.ExcelUtils;
import testutils.TestActions;

public class CreateAccount extends BaseClass{
	
	TestActions browserActions = new TestActions();
	ExcelUtils exceldata = new ExcelUtils();
	public boolean passwordStrengthVerification = false;
	
	public void switchToCreateAccountPage() throws InterruptedException {
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		
		browserActions.clickElement(homepage.accountsMenu);
		browserActions.sleep(1000);
		browserActions.clickElement(homepage.createAccountButton);
	}
	
	public void createNewAccount() {
		

		CreateAccountPage createacctpage = PageFactory.initElements(driver, CreateAccountPage.class);
		
		browserActions.enterText(createacctpage.firstNameText, exceldata.getCellDataString("CreateNewAccount", 1, "First Name"));
		browserActions.enterText(createacctpage.lastNameText, exceldata.getCellDataString("CreateNewAccount", 1, "Last Name"));
		browserActions.enterText(createacctpage.emailText, exceldata.getCellDataString("CreateNewAccount", 1, "Email"));
		browserActions.enterText(createacctpage.passwordText, exceldata.getCellDataString("CreateNewAccount", 1, "Password"));
		//browserActions.enterText(createacctpage.phoneText, exceldata.getCellDataString("CreateNewAccount", 1, "Phone No"));
		
		if(browserActions.verifyElementsPresence(createacctpage.passwordError) == true) {
			passwordStrengthVerification = true;
			Assert.assertFalse(passwordStrengthVerification, "Password is not Strong Enough ");
		}
		
		if(browserActions.verifyElementPresence(createacctpage.confirmPasswordPresence) == true) {
			browserActions.enterText(createacctpage.confirmPasswordText, exceldata.getCellDataString("CreateNewAccount", 1, "Password"));
		}
		
		browserActions.clickElement(createacctpage.createAccountButton);
		
	}

}
