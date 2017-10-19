package com.john.sam.api.jpa.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Greeting {

	private String now;
	

	private String message;
	
	public Greeting(String message) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		this.now = dtf.format(now); //2016/11/16 12:08:43
		this.message= message;
	}
	
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getNow() {
		return now;
	}

	public void setNow(String now) {
		this.now = now;
	}
	public String toString() {
		return String.join(this.now," : ",this.message);
		
	}
}
