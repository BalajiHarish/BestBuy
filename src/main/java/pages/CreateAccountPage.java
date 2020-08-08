package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {
	
	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement firstNameText;
	
	@FindBy(id="lastName")
	public WebElement lastNameText;
	
	@FindBy(id="email")
	public WebElement emailText;
	
	@FindBy(id="fld-p1")
	public WebElement passwordText;
	
	@FindBy(xpath = "//input[@id='reenterPassword']")
	public WebElement confirmPasswordText;
	
	@FindBy(xpath = "//input[@id='reenterPassword']")
	public WebElement confirmPasswordPresence;
	
	@FindBy(xpath = "//span[@id='fld-p1-text']")
	public List<WebElement> passwordError;
	
	@FindBy(id="phone")
	public WebElement phoneText;
	
	@FindBy(xpath = "//button[text()='Create an Account']")
	public WebElement createAccountButton;

}
