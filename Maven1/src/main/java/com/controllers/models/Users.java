package com.controllers.models;

public class Users {
	
	private int id;
	private String fullname;
	private String email;
	private String password;
	private String confirmPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}
	
	
	

}
