package com.beans;

public class UserInfo {
	private String  id;
   public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
private String userName;
   private String password;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
   
}
