package com.snipit.web.model;

public class User {
	private String userId;
	private String name;
	private String role;
	private String email;
	
	public User() {
		super();
	}

	public User(String userId, String name, String role) {
		super();
		this.userId = userId;
		this.name = name;
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + "]";
	}
}
