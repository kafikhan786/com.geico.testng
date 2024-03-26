package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageLogoTest extends BaseClass{

	@Test
	public void isLogoDisplayedTest() {
		homePageLogo.isLogoDisplayed();
	}
}
