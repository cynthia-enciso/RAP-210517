package com.revature.models;

public abstract class User {
	// fields
	private String username;
	private String pass;
	
	//constructor
	public User(String username, String pass) {
		this.setUsername(username);
		this.setPass(pass);
	}
	
	// getters and setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
