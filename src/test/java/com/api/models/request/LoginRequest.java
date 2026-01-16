package com.api.models.request;

public class LoginRequest {
	private String username;
	private String password;
	public LoginRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	@Override
	public String toString() {
		return "LoginRequest [username=" + username + ", password=" + password + "]";
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
