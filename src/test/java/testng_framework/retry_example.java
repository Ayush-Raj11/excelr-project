package testng_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retry_example {
@Test(retryAnalyzer=testng_framework.retrytest.class)
	public static void test1() {
		String S1="hello";
		String S2="hi";
		Assert.assertEquals(S1, S2);
	}
}
