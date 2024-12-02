package Cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class login_test {
//cucumber-- bdd- behaviour driven dev-test steps.
	//feature file-- teststeps
	//gherkin---> simple english highlight annotations
	//step definition--> gherkin+test steps
	static WebDriver driver;

@Given("Open Browser")
public void open_browser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@Then("Enter username {string}")
public void enter_username(String uname) {
	 
//     username.sendKeys("Admin"); 
	pagobj_login.username(driver).sendKeys(uname);
}

@And("Enter password {string}")
public void enter_password(String pwd) {
	
//	password.sendKeys("admin123");
	pagobj_login.password(driver).sendKeys(pwd);
}

@Then("Click login button")
public void click_login_button() {
	
	pagobj_login.Loginbtn(driver).click();
	
}
@Then("verify login data")
public void verify_login_data() {
	pagobj_login.upgrade_btn(driver).isDisplayed();
   System.out.println("login sucess");
}

@Then("close the broswer")
public void close_the_broswer() {
driver.quit();
}


}
