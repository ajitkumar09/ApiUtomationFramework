package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.Authservice;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {

    @Test
    public void getProfileInfoTest() {

        // -------- LOGIN --------
        Authservice authService = new Authservice();
        Response loginResponseRaw =
                authService.login(new LoginRequest("uday1234", "uday1234"));

        LoginResponse loginResponse =
                loginResponseRaw.as(LoginResponse.class);

        System.out.println("Token: " + loginResponse.getToken());

        // -------- GET PROFILE --------
        UserProfileManagementService profileService =
                new UserProfileManagementService();

        Response profileResponseRaw =
                profileService.getProfile(loginResponse.getToken());

        System.out.println("Profile Response:");
        System.out.println(profileResponseRaw.asPrettyString());

        UserProfileResponse userProfileResponse =
                profileResponseRaw.as(UserProfileResponse.class);

        // ✅ Correct getter call
        System.out.println("Username: " + userProfileResponse.getUsername());
    }
}
