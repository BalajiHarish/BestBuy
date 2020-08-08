package businesslogics;

import org.openqa.selenium.support.PageFactory;

import pages.HomePage;
import testbase.BaseClass;
import testutils.ExcelUtils;
import testutils.TestActions;

public class SearchItem extends BaseClass{
	
	TestActions browserActions = new TestActions();
	ExcelUtils exceldata = new ExcelUtils();
	
	public void searchAnItem() throws InterruptedException {
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		
		browserActions.enterText(homepage.searchBarText, exceldata.getCellDataString("SearchDetails", 1, "Item Name"));
		browserActions.sleep(2000);
		browserActions.enterKey(homepage.searchButton);
	}

}
