package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.Authservice;

import io.restassured.response.Response;

public class ForgotPassword2 {
	 @Test(description = "verify if login api is working")
	 
	 public void forgotPassword() {
		 Authservice authService = new Authservice();
		 Response response=authService.forgotPassword("ajitkumarsahoo0813@gmail.com");
		 System.out.println(response.asPrettyString());
		 
		 
	 }
}
