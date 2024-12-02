package maven_datadriven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class page_object_model_practice {
	public static WebDriver driver;
	
	public static void login() {
			
		page_object.Username.sendKeys("user@phptravels.com");
		page_object.Password.sendKeys("demouser");
		page_object.login.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
			driver.get("https://www.phptravels.net/login");		
		PageFactory.initElements(driver, page_object.class);
		login();
	
		
	}

}