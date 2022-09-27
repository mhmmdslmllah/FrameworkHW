package testPages;

import org.testng.annotations.Test;

import base.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false, priority = 1)
	public void logoTest() {
		homePage.logoDisplayed();

	}

	@Test(enabled = false, priority = 2)
	public void searchBoxTest() {
		homePage.searchBoxClick();
	}
 
	//
	@Test(enabled = false, priority = 3)
	public void coursebtnClickTest() {
		homePage.coursesClick();
	}

	@Test(enabled = true, priority = 4) // This test will execute first because by default the value of priority is 0.
										// But it's working here why?
	public void logInTest() throws InterruptedException {
		homePage.logInBtnClick();
	}

}
