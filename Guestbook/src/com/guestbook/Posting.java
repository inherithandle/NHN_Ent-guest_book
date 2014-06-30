package com.guestbook;

import java.util.Date;

public class Posting {
	Integer 	Id;
	String		Password;
	String		Content;
	String		Email;
	Date		Created_time;
	Date		Modified_time;
	
	public void setId(Integer Id) {
		this.Id = Id;
	}
	
	public void setCreatedtime(Date Created_time) {
		this.Created_time = Created_time;
	}
	
	public void setModifiedtime(Date Modified_time) {
		this.Modified_time = Modified_time;
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	public void setContent(String Content) {
		this.Content = Content;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getContent() {
		return Content;
	}
	
	public Date getCreatedtime() {
		return Created_time;
	}
	
	public Date getModfiedtime() {
		return Modified_time;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public Integer getId() {
		return Id;
	}
}