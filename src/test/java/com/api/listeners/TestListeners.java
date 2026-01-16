package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener{
	private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(TestListeners.class);
	public void onStart(ITestContext context) {
		Logger.info("Test uite Started!!!");
	}	
    public void onFinish(ITestContext context) {
    	Logger.info("Test uite Completed!!!");
	}
	

    public void onTestSuccess(ITestResult result) {
    	Logger.info("Started!!"+result.getMethod().getMethodName());
    	Logger.info("Description!!"+result.getMethod().getDescription());
	}
	
    public void onTestFailure(ITestResult result) {
    	Logger.error("Faild!!"+result.getMethod().getMethodName());
	}
    public void onTestSkipped(ITestResult result) {
    	Logger.info("Skipped!!"+result.getMethod().getMethodName());
	}
}
