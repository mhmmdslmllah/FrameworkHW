package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//body[@class='lang-en '] ")
	WebElement logo;

	@FindBy(xpath = "//span[@class='_gkt786u']")
	WebElement searchField;

	@FindBy(xpath = "//span[@data-test-id='learn-menu-button']")
	WebElement coursesMianBtn;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement logInBtn;

	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo displayed? " + flag);
		return flag;
	}

	public void searchBoxClick() {
		searchField.click();
	}

	public boolean coursesClick() {
		boolean flag1 = coursesMianBtn.isDisplayed();
		System.out.println("Is the Course button working?" + flag1);
		return flag1;
	}
	
	public void logInBtnClick() throws InterruptedException {
		Thread.sleep(3000);
		logInBtn.click();
	}

}
