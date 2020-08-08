package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPopupBox {
	
	//SignUp Popup Box
	
		@FindBy(xpath = "//div[@data-static-id='email-head-container']")
		public WebElement signupPopupBox;
		
		@FindBy(css = "button.c-close-icon")
		public WebElement signupPopupCloseButton;

}
