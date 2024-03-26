package common;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import reports.Loggers;

public class CommonWaits {

	static WebDriver driver;
	static WebDriverWait wait;
	
	public CommonWaits(WebDriverWait wait) {
		CommonWaits.wait = wait;
	}
	
	public static void waitThenClick(WebDriver driver, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			Loggers.logTheTest("The element was clickable and here it clicked ---> " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n");
			Assert.fail();
			
			
			
			
		}
	}
}
