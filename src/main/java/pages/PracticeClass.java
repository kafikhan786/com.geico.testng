package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeClass {

	WebDriver driver;

	public PracticeClass(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "benzradio")
	WebElement benzRadioButton;
	
	@FindBy(id= "hondacheck")
	WebElement hondaCheckBox;
	
	@FindBy(xpath = "//button[@id= 'openwindow']")
	WebElement openNewWindowButton;
	
	@FindBy(id = "opentab")
	WebElement openNewTabButton;
	
	@FindBy(id = "carselect")
	WebElement carDropDown;
	
	@FindBy(id = "multiple-select-example")
	WebElement multipleSelectExample;
	
	@FindBy(xpath = "//input[@id='autosuggest']")
	WebElement typingBox;
	
	@FindBy(id = "disabled-button")
	WebElement disableButton;
	
	@FindBy(id = "enabled-button")
	WebElement enableButton;
	
	@FindBy(id = "hide-textbox")
	WebElement hideButton;
	
	@FindBy(id = "show-textbox")
	WebElement showButton;
	
	@FindBy(id = "alertbtn")
	WebElement alertButton;
	
	@FindBy(id = "confirmbtn")
	WebElement confirmButton;
	
	@FindBy(xpath = "//button[@id='mousehover']")
	WebElement mouseHoverButton;

	@FindBy(xpath = "//form[@id='search']")
	WebElement searchButton;
	
	@FindBy(name = "categories")
	WebElement selectCategory;
	
	
	
	
	public void practiceClassMethods() {
		driver.navigate().to("https://www.letskodeit.com/practice");
		
		
		
		
		
		
		
	}
	
	
	
}
