package testng_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grouping_example {
	//refer groping.xml
	@Test(groups= {"apple"})
	public static void apple1() {
		System.out.println("apple1");
	}
	@Test(groups= {"apple"})
	public static void apple2() {
		System.out.println("apple2");
	}
	@Test(groups= {"sam"})
	public static void samsung1() {
		System.out.println("sam1");
	}
	@Test(groups= {"sam"})
	public static void samsung2() {
		System.out.println("sam2");
	}
	
	
	


}
