package testng_framework;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener_example implements ITestListener {

	public void onTestFailure(ITestResult result) {
	System.out.println("failed");
	try {
		data_provider_example.screenshot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
