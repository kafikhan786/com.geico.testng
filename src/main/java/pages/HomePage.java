package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//h1[@id='section1heading']")
	WebElement homeTittlElement;
	
	public void homePageTextVerification() throws InterruptedException {
		
		verifyTextInTheWebElement(homeTittlElement, "The Insurance Savings You Expect");
		
		pause(4);
		
	}
	
	

}
