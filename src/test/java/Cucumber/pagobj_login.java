package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pagobj_login {
	
public static WebElement username(WebDriver driver) {
	return driver.findElement(By.cssSelector("input[name='username']"));
	}
public static WebElement password(WebDriver driver) {
	return driver.findElement(By.cssSelector("input[name='password']"));
	}

public static WebElement Loginbtn(WebDriver driver) {
	return driver.findElement(By.cssSelector("button[type='submit']"));
}
public static WebElement upgrade_btn(WebDriver driver) {
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/a/button"));
}
}
