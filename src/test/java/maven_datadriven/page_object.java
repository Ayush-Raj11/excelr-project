package maven_datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class page_object {

	@FindBy(id="email")
	public static WebElement Username;
	@FindBy(id="password")
	public static WebElement Password;
	@FindBy(id="submitBTN")
	public static WebElement login;
	
	
}
