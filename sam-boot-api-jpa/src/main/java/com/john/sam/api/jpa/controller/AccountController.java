package com.john.sam.api.jpa.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.john.sam.api.jpa.model.Account;
import com.john.sam.api.jpa.model.AccountDAO;

@RestController
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private AccountDAO accountDAO;
	 
	@RequestMapping("/login")
	@ResponseBody
	public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) throws Exception {
		if(0 == this.accountDAO.findByInfo(email, password)) {
			return new ResponseEntity<String>(HttpStatus.OK);
		}else {
			throw new Exception("No User");
		}
	}
	
	@RequestMapping("/logout")
	@ResponseBody
	public ResponseEntity<String> login(@RequestParam String email){
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/account/{email:.+}", method=RequestMethod.GET)
	@ResponseBody
	public boolean getAccount(@PathVariable String email) {
		return this.accountDAO.exists(email);
	}
	
	@RequestMapping(value="/account", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> addAccount(@RequestBody Account account){
		this.accountDAO.save(account);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
