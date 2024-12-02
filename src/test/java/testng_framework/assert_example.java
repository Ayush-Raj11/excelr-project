package testng_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_example {
	static WebDriver driver;
	@Test
	public static void verifyHomepageTitle() {
	driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	String expectedTitle = "ABCD";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public static void newpage() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

public static void main(String[] args)  {
 
	verifyHomepageTitle();
	newpage();
}
}
