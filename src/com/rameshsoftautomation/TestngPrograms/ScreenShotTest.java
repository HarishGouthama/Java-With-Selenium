package com.rameshsoftautomation.TestngPrograms;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ScreenShotTest extends TestListenerAdapter{
	@Override
	public void onTestFailure(ITestResult iTestResult)
	{
		System.out.println("Screenshot on failure");
		try {
		ScreenShotUtilty.screenshot(iTestResult.getName(), DriverEngine.driver);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}