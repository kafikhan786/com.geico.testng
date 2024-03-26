package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class DropDownAutoPage {
	
	WebDriver driver;

	public DropDownAutoPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='manage_select']")
	WebElement autoDropDown;
	
	public void dropDownAuto() {
	LoginPage loginPage=new LoginPage(driver);	
	
	pause(3);
	clickElement(loginPage.firstLogInButton);
	
	pause(3);
	selectDropdown(autoDropDown, "Landlord");
	pause(2);
	
	//driver.navigate().to("https://www.letskodeit.com/practice");
	
	}
	
	
	
	

}
