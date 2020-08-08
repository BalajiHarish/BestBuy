package testcases;

import org.testng.annotations.Test;

import businesslogics.CreateAccount;
import suitePackage.HookClass;
import testutils.TestActions;

@Test(groups = {"smoke","functional"})
public class CreateAccountTest extends HookClass{
	
	TestActions browserActions = new TestActions();
	CreateAccount createAccount = new CreateAccount();
	
	@Test
	public void createNewAccount() throws InterruptedException {
		
		createAccount.switchToCreateAccountPage();
		browserActions.sleep(5000);
		createAccount.createNewAccount();
	}

}
