package com.graymatter.demo.model;

public class UserResponse {

	private String status;
	private User user;
	
	public UserResponse(String status, User user) {
		super();
		this.status = status;
		this.user = user;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
