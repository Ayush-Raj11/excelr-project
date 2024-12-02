package testng_framework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization_example {
	//refer parameetr.xml
	@Test
	@Parameters("username")
	public static void username(String name) {
		System.out.println(name);
	}
	//parameterization---

}
