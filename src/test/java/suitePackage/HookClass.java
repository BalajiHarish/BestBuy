package suitePackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import businesslogics.ChooseCountry;
import businesslogics.SignupPopup;
import io.github.bonigarcia.wdm.WebDriverManager;
import testbase.BaseClass;
import testutils.TestActions;

public class HookClass extends BaseClass{
	
	TestActions browserActions = new TestActions();
	ChooseCountry country = new ChooseCountry();
	SignupPopup signupPopup = new SignupPopup();
	
	@Parameters("browserName")
	@BeforeClass(alwaysRun = true)
	public void setUp(String browserName) throws InterruptedException {

		if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {

			WebDriverManager.iedriver().arch32().setup();
			driver = new InternetExplorerDriver();
		}
		
		initialization();
		country.chooseCountry();
		browserActions.sleep(5000);
		signupPopup.signupPopup();
		browserActions.sleep(2000);
		
	}
	
	@AfterClass(alwaysRun = true)
	public void finish() throws InterruptedException {

		driver.quit();
	}

}
