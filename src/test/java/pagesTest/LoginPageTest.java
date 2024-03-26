package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.LoginPage;

public class LoginPageTest extends BaseClass {

	@Test
	public void logInPageTest() throws InterruptedException {
		loginPage.logInPage();
		
	}
}
