package testng_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	@Test(priority=1)
	public static void login() {
		System.out.println("login");
	}
	@Test(priority=2)
	public static void add_to_cart() {
		System.out.println("add to cart ");
	}
	@Test(priority=3)
	public static void payemnt() {
		System.out.println("payemnt ");
	}
	@Test(priority=4)
	public static void logout() {
		System.out.println("logout");
	}
	
	}
	


