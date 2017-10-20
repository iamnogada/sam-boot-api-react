package com.john.sam.api.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.john.sam.api.jpa.model.Account;
import com.john.sam.api.jpa.model.AccountDAO;

@Controller
public class AccountController {

	@Autowired
	private AccountDAO accountDAO;
	 
	@RequestMapping("/account")
	@ResponseBody
	public Account login(@RequestParam String email, @RequestParam String displayName, @RequestParam String password) {
		Account account = new Account(email, displayName, password);
		this.accountDAO.save(account);
		return account;
	}
}
