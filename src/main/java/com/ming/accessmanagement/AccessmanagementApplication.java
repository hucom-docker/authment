package com.ming.accessmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AccessmanagementApplication {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "This is the main page!";
	}

	public static void main(String[] args) {
		SpringApplication.run(AccessmanagementApplication.class, args);
	}
}
