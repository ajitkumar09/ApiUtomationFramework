package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.Authservice;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;
@Listeners(com.api.listeners.TestListeners.class)

public class LoginApiTest3 {
	 @Test(description = "verify if login api is working")
	    public void loginTest() {
		 LoginRequest loginRequest = new LoginRequest("uday1234" , "uday1234");
	 Authservice authService = new Authservice();
	 Response response =authService.login( loginRequest);
//	 System.out.println(response.asPrettyString());
	 LoginResponse loginResponse=response.as(LoginResponse.class);
	 System.out.println(response.asPrettyString());
	 System.out.println(loginResponse.getToken());
	 System.out.println(loginResponse.getEmail());
	 System.out.println(loginResponse.getId());
	 Assert.assertTrue(loginResponse.getToken() !=null);
	 Assert.assertEquals(loginResponse.getEmail(), "Ajit@1234");
	 Assert.assertEquals(loginResponse.getId(),3);
	 
	 
	 
	 
	 }
}
