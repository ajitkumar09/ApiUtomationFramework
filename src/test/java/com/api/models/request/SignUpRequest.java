package com.api.models.request;

public class SignUpRequest {
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	public SignUpRequest(String username, String password, String email, String firstName, String lastName,
			String mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "SignUpRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}
	public static class Builder{
		private String username;
		private String password;
		private String email;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		
		public Builder userName(String username) {
			this.username=username;
			Builder x=this;
			return x;
		}
		public Builder password(String username) {
			this.password=password;
			Builder x=this;
			return x;
		}
		public Builder  email(String email) {
			this. email= email;
			Builder x=this;
			return x;
		}
		public Builder firstName(String firstName) {
			this.firstName=firstName;
			Builder x=this;
			return x;
		}
		public Builder lastName(String lastName) {
			this.lastName=lastName;
			Builder x=this;
			return x;
		}
		public Builder lmobileNumber(String mobileNumber) {
			this.mobileNumber=mobileNumber;
			Builder x=this;
			return x;
		}
		public SignUpRequest build() {
			SignUpRequest signuprequest = new SignUpRequest(username,password,email,firstName,lastName,mobileNumber);
			return signuprequest;
			
		}
	}
}

