package com.bytedata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/home")
	public String home() {
		return ("<h1>Welcome bytedata</h1>");
	}

	@RequestMapping("/user")
	public String user() {
		return ("<h1>Welcome user</h1>");
	}

	@RequestMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}

}
