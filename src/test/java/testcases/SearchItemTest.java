package testcases;

import org.testng.annotations.Test;

import businesslogics.SearchItem;
import suitePackage.HookClass;
import testutils.TestActions;

@Test(groups = {"sanity"})
public class SearchItemTest extends HookClass{
	
	SearchItem search = new SearchItem();
	TestActions browserActions = new TestActions();
	
	@Test
	public void searchItem() throws InterruptedException {
		
		search.searchAnItem();
	}

}
