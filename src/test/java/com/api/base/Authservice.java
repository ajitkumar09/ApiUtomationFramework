package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class Authservice extends BaseService {
	private static final String Base_PATH="/api/auth/";
	private static final String BASE_PATH = null;
//	private static final String BASE_URI="http://q";
	public Response login(LoginRequest payload) {
		return postRequest(payload,Base_PATH+ "login");
	}
	public Response signUp(SignUpRequest payload) {
		return postRequest(payload,Base_PATH+ "signup");
	}
		public Response forgotPassword(String emailAddress) {
			HashMap<String, String> payload = new HashMap<String, String>();
			payload.put("email", emailAddress);
			return postRequest(payload, BASE_PATH+"forgot-password");
		}
	
}
