package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static common.CommonActions.*;

import javax.swing.Action;

public class HomePageScroll {

	WebDriver driver;
	Actions actions;
	JavascriptExecutor js;

	public HomePageScroll(WebDriver driver) {
		super();
		this.driver = driver;

		actions = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}

	public void homePageScrollByActionsClass() {
		pause(3);
		// for Scroll Down using Actions class, to go at the bottom of the page
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		pause(3);
		// for Scroll Up using Actions class at the top of the page
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		pause(3);
		// instead of END and HOME, we can use Keys.UP or Keys.Down
		// But it doesn't change much but the test case passes, we will not use them
	}

	// important interview question
	// 2nd way: Scroll by javascriptExecutor
	// scroll in a certain position (not at the bottom or up)

	public void homePageScrollByJSExecutor() {
		pause(3);
		// This will scroll down the page by 1000 pixel vertically
		// here 0 is x axis, 1000 y axis
		// you choose your pixel accordingly to reach to that web element
		js.executeScript("window.scrollBy(0, 1000)", "");

		// You can change the value to any pixel, and put your own to see the web
		// element you wanna test
		pause(4);

		js.executeScript("window.scrollBy(0, -1000)", "");
		// scroll up till 1000px, but not necessary based on your test
		// minus when it goes opposite of down
		pause(3);

	}

}
