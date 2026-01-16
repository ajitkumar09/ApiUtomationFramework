package com.api.tests;

import org.testng.Assert;

import com.api.base.Authservice;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;


public class UpdateProfileTest {
	public void UpdateProfiletest() {
		Authservice authService = new Authservice();
		Response response=authService.login(new LoginRequest("uday1234","uday1234"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("------------------------------------------------------");
		UserProfileManagementService userProfileManagementService=new UserProfileManagementService();
		response =userProfileManagementService.getProfile(loginResponse.getToken());
		UserProfileResponse userProfileResponse=response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "udat1234");
		
		System.out.println("------------------------------------------------------");
		ProfileRequest profileRequest = new ProfileRequest.Builder()
				.firstName("ajit")
				.lastName("sahoo")
				.email("Ajitkumar@1234")
				.mobileNumber("6653256827")
				.build();
		response=userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());
	}
	
	

}
