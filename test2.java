package com.wxd.action;

import freemarker.template.utility.Execute;

public class loginaction  {
private String username;


public String execute(){
	if(username.equals("admin")&& password.equals("123")){
		return "yes";
	}
	return "no";
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
private String password;
}
