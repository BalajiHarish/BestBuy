package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseCountryPage {
	
	//Choose Country Page
	
		@FindBy(xpath = "//div/h1[contains(text(),'Choose a country.')]")
		public WebElement chooseCountryDisplayText;
		
		@FindBy(xpath = "//div[@lang='en']//a/img[@alt='Canada']")
		public WebElement canada;
		
		@FindBy(xpath = "//div[@lang='en']//a/img[@alt='United States']")
		public WebElement unitedstates;
		
		@FindBy(xpath = "//div[@lang='en']//a/img[@alt='Mexico']")
		public WebElement mexico;

}
