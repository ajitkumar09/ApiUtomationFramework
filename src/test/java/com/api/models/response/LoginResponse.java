package com.api.models.response;

import java.util.List;

public class LoginResponse {
	private String token;
	private String type;
	private int id;
	private String username;
	private String email;
	private List<String> roles;
	
	public LoginResponse() {
		
	}
	public LoginResponse(String token, String type, int id, String username, String email, List<String> roles) {
		super();
		this.token = token;
		this.type = type;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
	
	
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}


	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the roles
	 */
	public List<String> getRoles() {
		return roles;
	}


	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "LoginResponse [token=" + token + ", type=" + type + ", id=" + id + ", username=" + username + ", email="
				+ email + ", roles=" + roles + "]";
	}

}
