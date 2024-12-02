package maven_datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Practice_POM1 {
	public static WebDriver driver;
	
	public static void login() {
		
			
			Practice_pageObjects.username.sendKeys("user@phptravels.com");
			Practice_pageObjects.password.sendKeys("demouser");
			Practice_pageObjects.login.click();
	}
	
	public static void update_profile() {
		Practice_pageObjects.profile.click();
		Practice_pageObjects.Fname.sendKeys("Sunny");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
			driver.get("https://www.phptravels.net/login");
			
		PageFactory.initElements(driver, Practice_pageObjects.class);
		login();
		update_profile();
		
	}

}
