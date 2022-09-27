package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	public HomePage homePage;

	@BeforeMethod
	public void setUp() {//System is a class and setProperties is the method.
		//Here we are using the absolute path for a driver to launch. This is one of the way to launch the browser, there two other ways also.
		//WebDriver manager setup, which setup the diver itself and launches the driver.
		System.setProperty("webdriver.chrome.driver","/Users/saleem/eclipse-workspace/com.khanacademy.private/driver/chromedriver");
		driver = new ChromeDriver();//ChromeDriver is a concrete class which implements WebDriver Interface. Here we are using the Top Casting concept.
		driver.manage().window().maximize();// Or fullscreen(); method 
		driver.manage().deleteAllCookies();
		driver.get("https://www.khanacademy.org/");
		homePage = new HomePage(driver);
	
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();

	}

}
