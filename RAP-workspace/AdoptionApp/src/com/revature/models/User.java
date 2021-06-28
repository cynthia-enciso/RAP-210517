package com.revature.models;
/* TODO: input validation:
	- username cannot be empty
	- password cannot be empty
 */
public abstract class User {
	// fields
	private String username;
	private String pass;
	
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
	public void setPass(String password) {
		this.pass = password;
	}
	
	
}
