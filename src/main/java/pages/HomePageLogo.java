package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePageLogo {

	WebDriver driver;

	public HomePageLogo(WebDriver driver) {
		super();
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='icon-geico']") 
	WebElement logo;
	
	public void isLogoDisplayed() {
		elementDisplayed(logo);
	}
	
	
	
}
