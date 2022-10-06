package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

	@Test(enabled = false, priority = 4) // This test will execute first because by default the value of priority is 0.
											// But it's working here why?
	public void logInTest() throws InterruptedException {
		homePage.logInBtnClick();
	}

	@Test(enabled = false, priority = 5)
	public void signUpButtonTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(3000);

	}

	@Test(enabled = false)
	public void learnersButtonTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_1nqnoqg7' and @tabindex='0' and @href='/signup']")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void used_of_getURL_method() throws InterruptedException {// using getting current URL method
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_1nqnoqg7' and @tabindex='0' and @href='/signup']")).click();
		Thread.sleep(3000);
		System.out.println("This is the current URL of the page:" + driver.getCurrentUrl());

	}

	@Test(enabled = false) // get attribute method
	public void used_of_getAttribute_Method() {
		String value01 = driver.findElement(By.xpath("//span[text()='Search']")).getAttribute("class");
		System.out.println("This is the value of the attribute:" + value01);
	}

	@Test(enabled = false) // it's working in samsung's Framework
	public void used_of_sendKeys_method() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='_14nbw552']")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("_3ctub39 _3jkjsvy")).sendKeys("saleem");// send keys not working
		Thread.sleep(4000);
	}

	@Test(enabled = false) // send and navigate method
	public void used_of_sendKeys_and_Navigate_method_01() throws InterruptedException {// sending keys method working
		Thread.sleep(4000);
		driver.navigate().to("https://www.walmart.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();// It's not performing forward function
		Thread.sleep(4000);
	}

	@Test(enabled = false) // send and navigate method
	public void used_of_sendKeys_and_Navigate_method_02() throws InterruptedException {// sending keys method working
		Thread.sleep(4000);
		driver.navigate().to("https://www.walmart.com");
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().forward();// It's not performing forward function
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
	}

	@Test(enabled = false) // send and navigate method
	public void used_of_sendKeys_and_Navigate_method_03() throws InterruptedException {// sending keys method working
		Thread.sleep(4000);
		driver.navigate().to("https://www.tesla.com");
		Thread.sleep(4000);
		driver.navigate().to("https://www.starlink.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
	}

	@Test(enabled = false) // send and navigate method
	public void used_of_setSpecificSizeOfWindow_method() throws InterruptedException {// setting size window method
																						// working
		Dimension dimension = new Dimension(900, 500);
		driver.manage().window().setSize(dimension);
		System.out.println("The size of khan academy website is: " + driver.manage().window().getSize());
		Thread.sleep(4000);
		driver.navigate().to("https://www.starlink.com");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		System.out.println("The size of starlink website is: " + driver.manage().window().getSize());
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void dropedown_selectByIndex_method_01() throws InterruptedException {
		driver.get("https://amazon.com");
		WebElement dropElement = driver.findElement(By.id("searchDropdownBox"));
		Select select1 = new Select(dropElement);
		select1.selectByIndex(4); // Amazon Fresh
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void dropedown_selectByIndex_method_02() throws InterruptedException {
		driver.get("https://ebay.com");
		WebElement dropElement = driver.findElement(By.name("_sacat"));
		Select select2 = new Select(dropElement);
		select2.selectByIndex(4); // Books
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void dropedown_selectByIndex_method_03() throws InterruptedException {
		driver.get("https://amazon.com");
		WebElement dropElement = driver.findElement(By.id("searchDropdownBox"));
		Select select3 = new Select(dropElement);
		select3.selectByVisibleText("Books");
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void dropedown_selectByIndex_method_04() throws InterruptedException {
		driver.get("https://amazon.com");
		WebElement dropElement = driver.findElement(By.id("searchDropdownBox"));
		Select select4 = new Select(dropElement);
		select4.selectByVisibleText("Software");
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void dropedown_selectByIndex_method_05() throws InterruptedException {
		driver.get("https://amazon.com");
		WebElement dropElement = driver.findElement(By.id("searchDropdownBox"));
		Select select5 = new Select(dropElement);
		select5.selectByValue("search-alias=appliances"); // appliances
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void dropedown_selectByIndex_method_06() throws InterruptedException {
		driver.get("https://amazon.com");
		WebElement dropElement = driver.findElement(By.id("searchDropdownBox"));
		Select select6 = new Select(dropElement);
		select6.selectByValue("search-alias=amazonfresh"); // amazonfresh
		Thread.sleep(4000);
	}
	
	@Test(enabled = false)
	public void logoTest02() {
		WebElement logo = driver.findElement(By.xpath("//body[@class='lang-en ']"));
		 boolean flag = logo.isDisplayed();
		 Assert.assertFalse(true, "Application logo is not displayed.....");
		// java.lang.AssertionError: Application logo is not displayed..... expected [false] but found [true]

	}
	
	@Test(enabled = false)//PASSED: logoTest03
	public void logoTest03() {
		WebElement logo = driver.findElement(By.xpath("//body[@class='lang-en ']"));
		 boolean flag = logo.isDisplayed();
		 Assert.assertTrue(true, "Application logo is not displayed.....");
		 
	}
	
	@Test(enabled = false)
	public void use_of_get_title_method02() {// get title method
		String actual = driver.getTitle();
		String expected = "Khan Academy | Free Online Courses, Lessons &amp; Practice";
		Assert.assertEquals(actual, expected, "Home title doesn't match.....");
		//java.lang.AssertionError: Home title doesn't match..... because it doesn't match with the actual.
	}
	
	@Test(enabled = true)
	public void use_of_get_title_method_using_softAssertion() {// get title method
		String expected = driver.getTitle();
		String actual = "Khan Academy | Free Online Courses, Lessons &amp; Practice";
		System.out.println("HomePage title is: " + actual);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expected, "Home title doesn't match.....");
		String currentURL= driver.getCurrentUrl();
		System.out.println("The current URL from priority 2 is :" +currentURL);
	
}
}
