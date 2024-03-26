package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;
import static org.testng.Assert.assertEquals;

import java.net.http.WebSocket;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(text(),'Log In')])[1]")
	WebElement firstLogInButton;

	@FindBy(xpath = "(//button[@id='manageSubmit'])[1]")
	WebElement secoundLogInButton;

	@FindBy(xpath = "//input[@id='TextInputComponent-1']")
	WebElement userIdField;

	@FindBy(xpath = "//input[@id='TextInputComponent-2']")
	WebElement userPasswordField;

	@FindBy(name = "SubmitButtonComponent-1")
	WebElement thirdLogInButton;

	@FindBy(xpath = "//h2[text()='Hello, R']")
	WebElement textVerification;

	public void logInPage() throws InterruptedException {

		pause(3);
		clickElement(firstLogInButton);

		pause(3);
		clickElement(secoundLogInButton);
		pause(3);
		verifyLengthOfTheFieldContent(userIdField, "100");
		
		pause(2);
		inputText(userIdField, "kafikhan786@gmail.com");

		pause(2);
		inputText(userPasswordField, "Kafi101200");
		pause(2);

		clearTextFromTheField(userIdField);
		clearTextFromTheField(userPasswordField);
		pause(2);

		inputText(userIdField, "kafikhan786@gmail.com");

		pause(2);
		inputText(userPasswordField, "Kafi101200");
	
		pause(2);
		clickElement(thirdLogInButton);

		
//		pause(2);
//		verifyTextInTheWebElement(textVerification, "Hello, R");
//
//		pause(4);

	}

}
