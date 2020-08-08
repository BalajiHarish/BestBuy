package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	//Search Item Page
	
	@FindBy(id="gh-search-input")
	public WebElement searchBarText;
	
	@FindBy(css = "button.header-search-button")
	public WebElement searchButton;
	
	@FindBy(xpath = "//button//descendant::span[contains(text(),'Account')]")
	public WebElement accountsMenu;
	
	@FindBy(xpath = "//a[@href='https://www.bestbuy.com/identity/global/createAccount']/button")
	public WebElement createAccountButton;

}
