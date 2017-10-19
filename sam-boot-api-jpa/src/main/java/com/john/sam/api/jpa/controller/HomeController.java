package com.john.sam.api.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.john.sam.api.jpa.model.Greeting;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public Greeting index() {
		return new Greeting("Welcom to Spring Boot !!");
	}
}
