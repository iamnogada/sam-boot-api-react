package com.john.sam.api.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Accounts")
public class Account {
	
	@Id
	@Column(name="email", unique=true)
	String email;
	@Column(name="displayname")
	String displayName;
	@Column(name="password")
	String password;
	
	public Account() {
		this.email=this.displayName=this.password="";
	}
	public Account(String email, String displayName, String password) {
		this.email= email;
		this.displayName= displayName;
		this.password=password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return String.format("%s:%s:%s", this.email,this.displayName,this.password);
	}
}
