package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.NSS_ToDoPage;
import util.BrowserFactory;

public class NSS_TodoTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() throws InterruptedException {
// Starts the browser and saves the driver in the test class
		driver = BrowserFactory.startBrowser();

//		On to the site
		driver.get("http://techfios.com/test/104/");
		System.out.println("Before Adding " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		NSS_ToDoPage nss_todoPage = PageFactory.initElements(driver, NSS_ToDoPage.class);
		nss_todoPage.UserShldBeAbleToAddNewcategory();
		System.out.println("After Adding " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		driver.close();
		driver.quit();

	}

}