package testng_framework;

import org.testng.annotations.Test;

public class annotation2 {
	@Test(priority=1)
	public static void amazonlogin() {
		System.out.println("amazonlogin");
	}
	@Test(priority=2)
	public static void amazonadd_to_cart() {
		System.out.println("amazon add to cart ");
	}
}
