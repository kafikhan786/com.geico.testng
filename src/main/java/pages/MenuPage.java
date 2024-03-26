package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class MenuPage {

	WebDriver driver;

	public MenuPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//span[@class='header-link']")
	WebElement hamburgerIcon;
	
	public void clickOnhamburgerIcon() {
		pause(3);
		clickElement(hamburgerIcon);
	}
	
	
	
	
}
