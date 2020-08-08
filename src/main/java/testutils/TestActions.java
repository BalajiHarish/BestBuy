package testutils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testbase.BaseClass;

public class TestActions extends BaseClass{
	
	public void clickElement(WebElement element) {

		element.click();
	}

	public void clickElement(By elementLocator) {

		WebElement element = driver.findElement(elementLocator);
		element.click();
	}

	public void enterKey(WebElement element) {

		element.sendKeys(Keys.ENTER);
	}

	public void enterText(WebElement element, String textToEnter) {

		element.sendKeys(textToEnter);
	}
	
	public void clearText(WebElement element) {
		
		element.clear();
	}

	public String getTitle() {

		return driver.getTitle();
	}

	public String getCurrentURL() {

		return driver.getCurrentUrl();
	}

	public void sleep(int S) throws InterruptedException {

		Thread.sleep(S);
	}

	public void closeBrowser() {

		driver.close();
	}

	public void quitBrowser() {

		driver.quit();
	}

	public void selectFromDropDown(WebElement element, String ItemName) {

		Select dropdownItems = new Select(element);
		dropdownItems.selectByVisibleText(ItemName);
	}

	public void selectFromDropDownWithPartialText(WebElement element, String ItemName) {

		Select dropdownItems = new Select(element);
		List<WebElement> list = dropdownItems.getOptions();
		for(int i = 0; i<list.size();i++) {
			String values = list.get(i).getText();
			if(values.contains(ItemName)) {
				list.get(i).click();
				break;
			}
		}

	}
	
	public boolean verifyElementsPresence(List<WebElement> element) {

		int count = element.size();
		if (count != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyElementPresence(WebElement element) {

		if(element.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

}
