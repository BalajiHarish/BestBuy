package businesslogics;

import org.openqa.selenium.support.PageFactory;

import pages.ChooseCountryPage;
import testbase.BaseClass;
import testutils.ExcelUtils;
import testutils.TestActions;

public class ChooseCountry extends BaseClass{

	TestActions browserActions = new TestActions();
	ExcelUtils exceldata = new ExcelUtils();

	public void chooseCountry() {

		ChooseCountryPage countrypage = PageFactory.initElements(driver, ChooseCountryPage.class);

		if(browserActions.verifyElementPresence(countrypage.chooseCountryDisplayText) == true) {

			if(exceldata.getCellDataString("WebSite", 1, "Country").equalsIgnoreCase("United States")) {
				browserActions.clickElement(countrypage.unitedstates);
			} else if(exceldata.getCellDataString("WebSite", 1, "Country").equalsIgnoreCase("Canada")) {
				browserActions.clickElement(countrypage.canada);
			} else if(exceldata.getCellDataString("WebSite", 1, "Country").equalsIgnoreCase("Mexico")) {
				browserActions.clickElement(countrypage.mexico);
			}
		}
	}

}
