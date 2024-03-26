package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageScrollTest extends BaseClass {

	@Test (enabled = false)
	public void homePageScrollTest() {
		homePageScroll.homePageScrollByActionsClass();
	
	}
	
	@Test (enabled = true)
	
	public void homePageScrollByJSExecutor() {
		homePageScroll.homePageScrollByJSExecutor();
	}
	
	
	}
	

