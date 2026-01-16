package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.Authservice;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreation {
	 @Test(description = "verify if login api is working")
	 
	 public void createAccountTest() {
		SignUpRequest signUpRequest= new SignUpRequest.Builder()
				.userName("Ajit")
				.email("Ajit@yahoo.com")
				.firstName("Ajit")
				.password("Ajit123")
				.lastName("sahoo")
				.lmobileNumber("7008385791")
				.build();
		 Authservice authService= new Authservice();
		 Response response=authService.signUp(signUpRequest);
		 System.out.println(response.asPrettyString());
		 Assert.assertEquals(response.asPrettyString(), "User registration successfully");
	 }
}
