package testPages;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

	@Test(enabled = false)	// it's working in samsung's Framework
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
	public void used_of_sendKeys_and_Navigate_method_03()  throws InterruptedException {// sending keys method working
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
	@Test(enabled = true) // send and navigate method
	public void used_of_setSpecificSizeOfWindow_method() throws InterruptedException {// setting size window method working
		Dimension dimension = new Dimension(900, 500);
		driver.manage().window().setSize(dimension);
		System.out.println("The size of khan academy website is: " + 		driver.manage().window().getSize());
		Thread.sleep(4000);
		driver.navigate().to("https://www.starlink.com");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		System.out.println("The size of starlink website is: " + 		driver.manage().window().getSize());
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
	


}
}
