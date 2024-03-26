package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePageTitleVerification {

	WebDriver driver;

	public HomePageTitleVerification(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
public void titleVerification() {
	verifyTitle(driver, "An Insurance Company For Your Car And More | GEICO");
}
	
	
}
