package com.model;

public class User {
   private String username;
   private String password;
public User(String username, String password) {
	// TODO Auto-generated constructor stub
	this.username=username;
	this.password=password;
}
public String getUsername() {
	return this.username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return this.password;
}
public void setPassword(String password) {
	this.password = password;
}
}
