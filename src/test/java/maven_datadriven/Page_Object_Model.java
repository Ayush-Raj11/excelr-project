package maven_datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Model {
	private static final String username = null;
	private static final String password = null;
	private static final String login = null;
	static WebDriver driver;

	
	public static void main(String args[]) {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		PageFactory.initElements(driver,Page_Object_Model.class);
		
		page_object.Username.sendKeys("standard_user");
		page_object.Password.sendKeys("secret_sauce");
		page_object.login.click();
		
		//pagefactory
		
		}
}
