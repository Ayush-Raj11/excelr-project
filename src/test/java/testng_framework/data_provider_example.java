package testng_framework;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class data_provider_example {
static WebDriver driver;
	@Test(dataProvider="logindata")
	public void logintest(String username,String password) {
	
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username); 
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).isDisplayed());	
		//Assertions- hard and soft assert.
		
	}
@DataProvider(name="logindata")
public Object[][] login(){
	Object[][] data=new String[2][2];
	data[0][0]="Admin";
	data[0][1]="admin123";
	data[1][0]="rahul";
	data[1][1]="rahul@123";
	
	return data;
		
}
public static void screenshot() throws IOException {
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("C:\\Users\\DELL\\Desktop\\AYUSH's PROMPT\\Excelr working platform\\materials_gen_by_eclipse\\Screenshort\\failed1.jpeg"));// copying to local external file as (failed1.jpeg file name)
	
	// Note :-->we can only able to generate screenshots through (listnerss.xml) file of this file.
}
}
